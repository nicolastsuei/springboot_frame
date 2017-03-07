package wn.lizzy.springboot.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用注解注册servlert
 * MyServlet2.java
 * @author cuilj  2017年3月7日--上午10:17:55
 *
 */
@WebServlet(urlPatterns="/myServlet2/*",description="使用注解注册Servlet")
public class MyServlet2 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
		resp.setContentType("text/html"); 
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out =resp.getWriter(); 
		out.println("<html>"); 
		out.println("<head>"); 
		out.println("<title>Hello World</title>"); 
		out.println("</head>"); 
		out.println("<body>"); 
		out.println("<h1>这是使用注解注册Servlet：myServlet2</h1>"); 
		out.println("</body>"); 
		out.println("</html>");
	}
}
