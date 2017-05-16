package iii.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/FirstSimpleProgram")

public class SimpleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		System.out.println("這是doGet()方法");
		resp.setContentType("text/html;charset=UTF-8"); //test/html
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>");
		out.println("用servlet來產生文字性的回應");
		out.println("</title></head><dy>");
		out.println("<br>這是doGet()方法送出的訊息</br>");
		out.println("RequastURL="+req.getRequestURL()+"<br>");
		out.println("RequastURI="+req.getRequestURI()+"<br>");
		out.println("Content Path="+req.getContextPath()+"<br>");
		out.println("Servlet Path="+req.getServletPath()+"<br>");
		out.println("Path Info="+req.getPathInfo()+"<br>");
		out.println("您的ip為："+req.getRemoteAddr()+"<br>");
		out.println("<hr>");
		out.println("瀏覽器送來的請求標頭：<br>");
		Enumeration<String> en = req.getHeaderNames();
		while(en.hasMoreElements()){     //en.hasMoreElements()=true
			String header = en.nextElement();
			String value = req.getHeader(header);
			out.println("請求標頭："+header+"=>"+value+"<br>");
		}
		out.println("</body></html>");
		out.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doPost(req, resp);
		System.out.println("這是doPost()方法");
	}

}
