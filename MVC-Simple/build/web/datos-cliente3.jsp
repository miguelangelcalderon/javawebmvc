<%-- 
    Document   : datos-cliente2
    Created on : 22-may-2018, 16:59:52
    Author     : Practicas
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                <td>${elCliente.nombre}</td>
            </tr>
            <tr>
                <td>Profesion</td>
                <td>${elCliente.profesion}</td>
            </tr>
            <tr>
                <td>Edad:</td>
                <td>${elCliente.edad}</td>
            </tr>
            
        </table>
            
    </body>
</html>
