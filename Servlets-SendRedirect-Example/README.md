
# SendRedirect

* Used to redirect response to another resource, it may be servlet, jsp or html file.
* It works at client side because it uses the url bar of the browser to make another request

forward() method  | sendRedirect() method
------------- | -------------
The forward() method works at server side.  | The sendRedirect() method works at client side.
It sends the same request and response objects to another servlet.  | It always sends a new request.
It can work within the server only. | It can be used within and outside the server.
Example: request.getRequestDispacher("servlet2").forward(request,response); | Example: response.sendRedirect("servlet2");
