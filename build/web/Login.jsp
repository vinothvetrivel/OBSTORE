<%-- 
    Document   : Login
    Created on : Apr 30, 2012, 9:09:39 PM
    Author     : vinoth
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Hello..!</h1>
        <html:form action="/login" method="post">
            <table>
                <tr>
                <td colspan="2">
                    <bean:write name="LoginForm" property="error" filter="false"/>
                    &nbsp;</td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><html:text maxlength="20" property="user"></html:text></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><html:password maxlength="20" property="pass"></html:password></td>
                </tr>
                <tr>
                    <html:submit value="Login"></html:submit>
                </tr>
            </table>
        </html:form>
    </body>
</html>
