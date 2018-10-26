package net.wanho.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import jdk.nashorn.api.scripting.JSObject;
import net.wanho.pojo.Doctor;
import net.wanho.service.DoctorServiceI;
import net.wanho.service.impl.DoctorServiceImpl;
import net.wanho.util.JsonResult;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String doctorName = request.getParameter("doctorName");
		String password = request.getParameter("password");

		DoctorServiceI doctorServiceI = new DoctorServiceImpl();
		Doctor doctor = doctorServiceI.login(doctorName, password);
		JsonResult result=new JsonResult();
		if (doctor == null) {
			// 登录失败
			result.setStatus(400);
			result.setMsg("登录失败");
		}else {
			result.setStatus(200);
			result.setMsg("登录成功");
			request.getSession().setAttribute("doctor", doctor);
		}
		
	     JSONObject jsonObject=new JSONObject();
	     response.getWriter().write(jsonObject.toJSONString(result));
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
