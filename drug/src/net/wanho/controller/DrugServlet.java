package net.wanho.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import net.wanho.pojo.DrugInventoryDetail;
import net.wanho.service.DrugServiceI;
import net.wanho.service.impl.DrugServiceImpl;
import net.wanho.util.JsonResult;

/**
 * Servlet implementation class DrugServlet
 */
@WebServlet("/DrugServlet")
public class DrugServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DrugServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DrugServiceI drugServiceI=new DrugServiceImpl();
		List<DrugInventoryDetail> allDrugs = drugServiceI.getAllDrugs();
		JsonResult result=new JsonResult();
		result.setStatus(200);
		result.setData(allDrugs);
		JSONObject jsonObject=new JSONObject();
		response.getWriter().write(jsonObject.toJSONString(result));
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
