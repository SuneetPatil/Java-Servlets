package suneet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet in doGet method");
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
		out.print("<html><body>");  
		if(request.getParameter("name") == null) {
			out.print("<b>Welcome - CAMPUS BATCH 2018</b>");  
		}else {
			out.print("<b>Welcome - CAMPUS BATCH 2018 --- "+request.getParameter("name").toUpperCase()+"</b>");  
		}
		out.print("</body></html>");  
	}
}
