
# Servlet Context and ServletConfig


## ServletConfig: 
* It is created to pass initialization information to the servlet.   
* One ServletConfig object per servlet.

```
  <servlet>
    <servlet-name>ServletClass</servlet-name>
    <servlet-class>suneet.ServletClass</servlet-class>
    <init-param>
      <param-name>Trainer</param-name>
      <param-value>Suneet Patil</param-value>
    </init-param>
  </servlet>
  <servlet-mapping>
    <servlet-name>ServletClass</servlet-name>
    <url-pattern>/ServletClass</url-pattern>
  </servlet-mapping>
  ```
  
## ServletContext:
* Defines a set of methods that a servlet uses to communicate with its servlet   container. 
* One ServletContext object per one wep application.

```
  <context-param>
    <param-name>company</param-name>
    <param-value>EVRY India</param-value>
  </context-param>
```

