package indi.frank.hw;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String[] product = {"手电筒","手机","冰箱","手表","笔记本"};
		if(id==null) {
			throw new RuntimeException("erro");
			
		}
		
		int index = Integer.parseInt(id);
		String productName = product[index-1];
		HttpSession session = request.getSession();
		//取出购物车
		Map<String,Integer> cart = (Map<String,Integer>) session.getAttribute("cart");
		if(cart==null) {
			//第一次购物
			cart=new HashMap<>();
			//把商品加到购物车中
			cart.put(productName,1);
			session.setAttribute("cart", cart);
		}else {
			if(cart.containsKey(productName)) {
				Integer count = cart.get(productName);
				count++;
				cart.put(productName, count);
			}else {
				//不存在新增一条
				cart.put(productName, 1);
			}
				
		}
		response.sendRedirect("/day06/product.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
