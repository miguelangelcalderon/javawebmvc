<%-- 
    Document   : datos-cliente
    Created on : 22-may-2018, 16:59:52
    Author     : Practicas
--%>

<%@page import="modelos.Cliente" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    Cliente c=(Cliente)request.getAttribute("elCliente");
%>    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Datos del cliente dado de alta</h2>
        <table border="1">
            <tr>
                <td>Nombre:</td>
                <td><%=c.getNombre() %></td>
            </tr>
            <tr>
                <td>Profesion</td>
                <td><%=c.getProfesion() %></td>
            </tr>
            <tr>
                <td>Edad:</td>
                <td><%=c.getEdad() %></td>
            </tr>
            
        </table>
    </body>
</html>
