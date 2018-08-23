
# Servlet Life Cycle

![Servlet Life Cycle](https://github.com/SuneetPatil/Java-Servlets/blob/master/Images/ServletLifeCycle.png)

* If an instance of the servlet does not exist, the Web container loads the class. 
* Creates an instance of the servlet class. 
* Initializes the servlet instance by calling the init method.
* Invokes the service method, passing a request and response object, For Http Servlet, Service method invokes doGet, doPost, etc. methods as appropriate,  Override only doGet or doPost etc. method as needed.
* Finalize the request by calling Destroy method.
