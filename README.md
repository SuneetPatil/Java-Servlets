# Java-Servlets
Java-Servlets

A servlet an application that runs in a Web server or application server and provides server-side processing such as accessing a database.
Servlet can be created  either by implementing Servlet Interface or extending  abstract classe (GenericServlet or HttpServlet)

![Server Client](https://github.com/SuneetPatil/Java-Servlets/blob/master/Images/ServerClient.png)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

* Latest version on Eclipse ide
* Latest Java version

## Deployment

Clone this repository and run each examples in Java environment.

## Servlet Terminology

* Http (Hypertext Transfer Protocol): It's a stateless request-response based communication protocol.

* Client: A Client is any machine that requests information.

* Webserver: Web Server takes client Request and send requested resource back to the Client.

* Servlet: It is a small Java program runs within a Web Server (usually across Http).

* Web Container: Runtime environment for Servlets, manages life cycle of servlet.

## HTTP

* Http is the protocol that allows web servers and browsers to exchange data over the web.
* HTTP uses a request/response model.
* It is stateless means each request is considered as the new request. 

Methods  | Description
------------- | -------------
GET  | Asks to get the resource at the requested URL.
POST  | Asks the server to accept the body info attached. It is like GET request with extra info sent with the request.
HEAD | Asks for only the header part of whatever a GET would return. Just like GET but with no body.
TRACE | Asks for the loopback of the request message, for testing or troubleshooting.
PUT | Says to put the enclosed info (the body) at the requested URL.
DELETE | Says to delete the resource at the requested URL.
OPTIONS | Asks for a list of the HTTP methods to which the thing at the request URL can respond.

## Methods

Methods  | Description
------------- | -------------
public void init(ServletConfig config)  | initializes the servlet. It is the life cycle method of servlet and invoked by the web container only once.
public void service(ServletRequest request,ServletResponse response)  | provides response for the incoming request. It is invoked at each request by the web container.
public void destroy() | is invoked only once and indicates that servlet is being destroyed.
public ServletConfig getServletConfig() | returns the object of ServletConfig
public String getServletInfo() | returns information about servlet such as writer, copyright, version etc.

## Package and Deployment
![Package and Deployment](https://github.com/SuneetPatil/Java-Servlets/blob/master/Images/PackageandDeployment.png)

### Deployment Descriptor :
* web.xml is the deployment descriptor for web applications.
* Every web application module must have a single web.xml file in the folder root/WEB-INF

```
<web-app >

<servlet>

<servlet-name>GenericServlet</servlet-name>

<servlet-class>com.suneet.GenericServletExample</servlet-class>

</servlet>

<servlet-mapping>

<servlet-name>GenericServlet</servlet-name>

<url-pattern>/exampleservlet</url-pattern>

</servlet-mapping>

</web-app>

```
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

