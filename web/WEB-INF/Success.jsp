<%-- 
    Document   : Success
    Created on : Apr 30, 2012, 10:24:32 PM
    Author     : vinoth
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logged In</title>
    </head>
    <body>
        <h1>Congratulations!</h1>

        <p>You have successfully logged in.</p>

        <p>Your name is:<bean:write name="LoginForm" property="user"/>.</p>
    </body>
</html>
