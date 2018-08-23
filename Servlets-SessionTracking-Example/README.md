# Session Tracking

* Session simply means a particular interval of time.
* Session Tracking is a way to maintain state (data) of an user. It is also known as session management in servlet.
* HTTP and Web Server both are stateless, the only way to maintain a session is when some unique information about the session (session id) is passed between server and client in every request and response.

* Session Tracking Mechanism:
    * Cookies 
    * Hidden Form Field
    * URL Rewriting
    * Session Management API.
    
# Session Management - Cookies

* A cookie is a small piece of information that is persisted between the multiple client requests.

![Session Management](https://github.com/SuneetPatil/Java-Servlets/blob/master/Images/SessionManagement.png)

## Example :
```
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
Cookie = new Cookie(“name",“Suneet"); 
cookie.setMaxAge(60*60); //1 hour 
response.addCookie(cookie);   
pw.println("Cookie is created");
```

# Session Management – Hidden Form Field

* A hidden (invisible) textfield is used for maintaining the state of an user.
```
<input type="hidden" name="userName" value=“Suneet"> 
```
## Session Management – URL Rewriting

* With URL rewriting, every local URL the user might click on is dynamically modified, or rewritten, to include extra information.
* We can send parameter name/value pairs using the following format:
```
	url?name1=value1&name2=value2&??
```


