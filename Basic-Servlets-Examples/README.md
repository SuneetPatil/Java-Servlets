## The servlet can be created by three ways:
* By implementing Servlet interface,
* By inheriting GenericServlet class, (or)
* By inheriting HttpServlet class

### GenericServlet
* Implements  Servlet, ServletConfig andSerializable interface. 
* It provides the implementaion of all the methods of these interfaces except the service method.
* GenericServlet class can handle any type of request so it is protocol-independent.

### HttpServlet
* class extends the GenericServlet class and implements Serializable interface. 
* It provides http specific methods such as doGet, doPost, doHead, doTrace etc

## Package and Deployment
 <p align="center"> 
    <img src="https://github.com/SuneetPatil/Java-Servlets/blob/master/Images/PackageandDeployment.png" alt="Package and Deployment">
 </p>

### Deployment Descriptor :
* web.xml is the deployment descriptor for web applications.
* Every web application module must have a single web.xml file in the folder root/WEB-INF

```
<web-app>
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
