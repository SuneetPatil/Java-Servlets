package suneet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
/**
 * Servlet implementation class Servlet
 */
public class FirstServlet implements Servlet{
	
	ServletConfig config=null;  
	  
	public void init(ServletConfig config){  
		this.config=config;  
		System.out.println("FirstServlet is initialized");  
	}  
	  
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{  
		System.out.println("FirstServlet in service method");
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>Welcome - CAMPUS BATCH 2018 by FirstServlet</b>");  
		out.print("</body></html>");  
	}  
	
	public void destroy(){
		System.out.println("FirstServlet is destroyed");
	}
	
	public ServletConfig getServletConfig(){
		return config;
	}
	
	public String getServletInfo(){
		return "copyright @Suneet";
	} 
}
