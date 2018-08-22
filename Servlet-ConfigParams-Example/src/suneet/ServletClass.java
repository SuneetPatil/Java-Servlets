package suneet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletClass extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config=getServletConfig();
		String trainer=config.getInitParameter("Trainer");
		out.println("Servlet Trainer: "+trainer);
		
		ServletContext context=getServletContext();  
		String company=context.getInitParameter("company");  
		out.println("<br>Company: "+company); 
		
		out.close();
	}
}
