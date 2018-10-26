package com.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     /**
      * 1.判断是否第一次访问
       *  第一次:创建新的cookie 把这次访问的商品的id加到cookie中
      * 不是第一次,把cookie的值取出来,把商品id追加到原来的后面
      *  如果商品已经存在,就不需要追加
      * 
      **/
		//先从cookie中将历史记录信息取出
		String id = request.getParameter("id");
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtil.getCookieByName(cookies, "product");
		if(cookie==null) {
			//第一次访问
			Cookie productCookie = new Cookie("product",id);
			productCookie.setMaxAge(3600);
			response.addCookie(productCookie);
		}else {
			//不是第一次
			String ids = cookie.getValue();
			//判断商品是否存在
			if(!ids.contains(id)) {
				//不存在
				cookie.setValue(ids+"#"+id);
				cookie.setMaxAge(3600);
				response.addCookie(cookie);
			}
			//如果存在,什么都不干
			response.sendRedirect("/day05/product.jsp");
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
