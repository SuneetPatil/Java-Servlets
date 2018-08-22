package suneet;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class NextServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		    String name;
		   
		    //1. Getting Cookies
		    Cookie ck[]=request.getCookies();  
		    name = ck[0].getValue(); 
		    
		    
		   /* 
		    //2 and 3. Getting the value from the request .
	        name = request.getParameter("name");
	       */
		    
	        
		    //4. Http seesion
	        /*HttpSession session=request.getSession(false);  
	        name = (String)session.getAttribute("name");  */
	        
	        
	        out.print("Hello "+name.toUpperCase());
		    out.close();  
	    }catch(Exception e){System.out.println(e);}  
	}
}
