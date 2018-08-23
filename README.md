# Java-Servlets
A Servlet an application that runs in a Web server or application server and provides server-side processing such as accessing a database.
Servlet can be created  either by implementing Servlet Interface or extending  abstract classe (GenericServlet or HttpServlet)

<p align="center"> 
  <img src="https://github.com/SuneetPatil/Java-Servlets/blob/master/Images/ServerClient.png" alt="Server Client">
</p>

## Getting Started

These instructions will help you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

* Eclipse IDE
* Java 1.7+ Version

## Deployment

Clone this repository and run each examples.

## Servlet Terminology

* Http (Hypertext Transfer Protocol): It's a stateless request-response based communication protocol.
* Client: A Client is any machine that requests information.
* Webserver: Web Server takes client Request and send requested resource back to the Client.
* Servlet: It is a small Java program runs within a Web Server (usually across Http).
* Web Container: Runtime environment for Servlets, manages life cycle of servlet.

## Methods

Methods  | Description
------------- | -------------
public void init(ServletConfig config)  | initializes the servlet. It is the life cycle method of servlet and invoked by the web container only once.
public void service(ServletRequest request,ServletResponse response)  | provides response for the incoming request. It is invoked at each request by the web container.
public void destroy() | is invoked only once and indicates that servlet is being destroyed.
public ServletConfig getServletConfig() | returns the object of ServletConfig
public String getServletInfo() | returns information about servlet such as writer, copyright, version etc.


## Servlet API
### javax.servlet
#### Interfaces

* RequestDispatcher 
* Servlet 
* ServletConfig 
* ServletContext 
* ServletRequest 
* ServletResponse 
* SingleThreadModel

#### Classes

* GenericServlet
* ServletInputStream 
* ServletOutputStream 
#### Exception Classes
* ServletException
* UnavailableException

### javax.servlet.http

#### Interfaces
* HttpServletRequest
* HttpServletResponse 
* HttpSession 
* HttpSessionBindingListener 
* HttpSessionContext 

#### Classes
* Cookie 
* HttpServlet  
* HttpSessionBindingEvent 
* HttpUtils 

## Examples

This repository explains following examples:

* [Basic-Servlets-Examples](https://github.com/SuneetPatil/Java-Servlets/blob/master/Basic-Servlets-Examples)
* [Servlet-ConfigParams-Example](https://github.com/SuneetPatil/Java-Servlets/blob/master/Servlet-ConfigParams-Example)
* [Servlets-ReqDispatcher-Example](https://github.com/SuneetPatil/Java-Servlets/tree/master/Servlets-ReqDispatcher-Example)
* [Servlets-SendRedirect-Example](https://github.com/SuneetPatil/Java-Servlets/tree/master/Servlets-SendRedirect-Example)
* [Servlets-SessionTracking-Example](https://github.com/SuneetPatil/Java-Servlets/tree/master/Servlets-SessionTracking-Example)


## Authors

* **Suneet Patil** 


## License

This project is licensed under the MIT License - see the [LICENSE](https://raw.githubusercontent.com/SuneetPatil/Java-Servlets/master/LICENSE) file for details

