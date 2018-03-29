<%--
  Created by IntelliJ IDEA.
  User: christopheresmith
  Date: 3/29/18
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CIT360 Servlet</title>
  </head>
  <body>
  <form name="loginForm" method="post" action="loginServlet">
    Favorite Super Hero: <input type="text" name="superhero"/> <br/>
    Whats his weakness?: <input type="text" name="weakness"/> <br/>
    <input type="submit" value="Login" />
  </form>
  </body>
</html>
