<%-- 
    Document   : errores
    Created on : 20-nov-2017, 11:42:15
    Author     : Curso Mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de control de errores</title>
    </head>
    <body>
        <h1>Se ha producido un error!</h1>
        <h3>Ha ocurrido un error <%=exception.getMessage()%></h3>
        <h4>Descripcion detallada <%=exception.getCause().getMessage()%></h4>
    </body>
</html>
