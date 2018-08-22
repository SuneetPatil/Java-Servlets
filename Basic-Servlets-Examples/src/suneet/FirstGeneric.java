package suneet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class FirstGeneric
 */
@SuppressWarnings("serial")
public class FirstGeneric extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("FirstGeneric in service method");
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>Welcome - CAMPUS BATCH 2018 by FirstGeneric</b>");  
		out.print("</body></html>");
	}
}
