<%-- 
    Document   : error
    Created on : Jun 3, 2021, 9:27:33 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ERROR PAGE</title>
    </head>
    <body>
        <h1>ERROR</h1>
        <font id="error" color="red">
        ${requestScope.ERROR}
        </font>
    </body>
</html>
