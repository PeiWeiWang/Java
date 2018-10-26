package com.cookie;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitServlet
 */
@WebServlet("/VisitServlet")
public class VisitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /*
     * 1.判断是否是第一次
     */
		response.setContentType("text/html;charset=utf-8");
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtil.getCookieByName(cookies, "last_time");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String lastTimeString =dateFormat.format(new Date());
		if(cookie == null) {
			//第一次访问
			Cookie lastTime  = new Cookie("last_time",lastTimeString);
			//设置存活时间
			lastTime.setMaxAge(60*60);
			//将cookie带回浏览器
			response.addCookie(lastTime);
			response.getWriter().write("欢迎光临");
		}else {
			//取出上一次访问的时间
			String last_Time = cookie.getValue();
			//将这一次访问的时间放入cookie中更新
			cookie.setValue(lastTimeString);
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
			response.getWriter().write("上一次访问时间"+last_Time);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
