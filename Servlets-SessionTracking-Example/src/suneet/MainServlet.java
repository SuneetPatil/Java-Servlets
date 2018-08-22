package suneet;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class MainServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String name=request.getParameter("username");  
		    out.print("Welcome "+name);  
		  
		    
		    //1. adding Cookies
		    Cookie ck=new Cookie("UserName",name);
		    response.addCookie(ck);
		    out.print("<br/><br/>");
		    out.print("<form action='NextServlet'>"); 
		    out.print("<input type='submit' value='Go - Using Cookies'>");  
		    out.print("</form>");
		    
		    
            /*
		    //2. Hidden Field
		    out.print("<form action='NextServlet'>");
		    out.print("<input type='hidden' name='name' value='"+name+"'>"); 
		    out.print("<input type='submit' value='Go - Using Hidden Fields'>");  
		    out.print("</form>");
		    */
		    /*
		   
		    //3. appending the username in the query string  
	        out.print("<br><a href='NextServlet?name="+name+"'>Visit - Using Url Rewritting</a>");
	       
		    */
		    
		    //4. Http Seesion
		    /*HttpSession session=request.getSession();  
	        session.setAttribute("name",name);  
	        out.print("<br><a href='NextServlet'>Visit - using HttpSession</a>");*/
	        
	        out.close();
	    }catch(Exception e){System.out.println(e);}  
	}  
}
