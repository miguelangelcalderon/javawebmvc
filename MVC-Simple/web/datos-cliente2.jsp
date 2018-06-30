<%-- 
    Document   : datos-cliente2
    Created on : 22-may-2018, 16:59:52
    Author     : Practicas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="elCliente" scope="request" class="modelos.Cliente" />  
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
                <td><jsp:getProperty name="elCliente" property="nombre" /></td>
            </tr>
            <tr>
                <td>Profesion</td>
                <td><jsp:getProperty name="elCliente" property="profesion" /></td>
            </tr>
            <tr>
                <td>Edad:</td>
                <td><jsp:getProperty name="elCliente" property="edad" /></td>
            </tr>
            
        </table>
    </body>
</html>
