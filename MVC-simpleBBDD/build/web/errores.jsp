<%-- 
    Document   : errores.jsp
    Created on : 08-jun-2018, 19:45:41
    Author     : Practicas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Se ha producido un error:</h1>
        <h2>Causa Padre:<%=exception.getMessage()%></h2>
        <h2>Causa hija;<%=exception.getCause().getMessage() %></h2>
    </body>
</html>
