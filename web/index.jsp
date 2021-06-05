<%-- 
    Document   : index
    Created on : Jun 3, 2021, 8:22:01 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN PAGE</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form action="MainController" method="POST">
            Username: <input id="username" type="text" name="txtUsername" value="" />
            <font color="red">
            ${INVALID.usernameError}
            </font>
            <br>
            Password: <input id="password" type="password" name="txtPassword" value="" />
            <font color="red">
            ${INVALID.passwordError}
            </font>
            <br>
            <input id="Login" type="submit" value="Login" name="action" />
        </form>
        
    </body>
</html>
