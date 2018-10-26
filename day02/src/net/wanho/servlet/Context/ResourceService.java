package net.wanho.servlet.Context;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResourceService
 */
@WebServlet("/ResourceService")
public class ResourceService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResourceService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Properties properties = new Properties(); 
		
		//读取db文件的信息
		String path = "/WEB-INF/classes/db.properties";
		//相对路径
//		InputStream inputStream = getServletContext().getResourceAsStream(path);
//		properties.load(inputStream);
//		
//		String username = properties.getProperty("username");
//		String password = properties.getProperty("password");
//		
//		System.out.println(username+"============="+password);
		//绝对路径
		String realPath = getServletContext().getRealPath(path);
		properties.load(new FileInputStream(realPath));
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");		
		System.out.println(username+"============="+password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
