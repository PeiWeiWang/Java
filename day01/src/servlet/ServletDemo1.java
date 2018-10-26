package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


//实例化的时候执行
public class ServletDemo1 implements Servlet {
	 public ServletDemo1() {
		super();
		System.out.println("我被实例化了");
		// TODO Auto-generated constructor stub
	}

	// 1.创建一个类实现Servlet接口
	 // 2.实现方法service方法处理请求,发送响应
     // 在web.xml值配置servlet
	@Override
	public void destroy() {
	System.out.println("我被销毁了");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	//当servlet初始化时,会执行这个方法
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 获取页面的打印
		System.out.println("我执行了服务");
         res.getWriter().write("hello Servlet");	
	}
 
}
