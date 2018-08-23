
# RequestDispacher

* The RequestDispacher interface provides the facility of dispatching the request to another resource it may be html, servlet or jsp.

* The RequestDispatcher interface provides two methods.

## Forward : 

Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.

```
	RequestDispatcher rd=request.getRequestDispatcher("servlet2");    
	rd.forward(request, response)
```
## Include : 

Includes the content of a resource (servlet, JSP page, or HTML file) in the response.
```
	RequestDispatcher rd=request.getRequestDispatcher("/index.html"); rd.include(request, response)    
```
