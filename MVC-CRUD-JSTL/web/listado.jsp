<%-- 
    Document   : listado.jsp
    Created on : 23-may-2018, 17:48:20
    Author     : Practicas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.ArrayList"%>
<%@page import="pojos.Promocion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table { width:500px;
                    margin:40px auto;
                    background-color:ghostwhite;
                    border:1px solid red;
                    border-collapse: collapse;}
            th,td {border:1px solid black;
                   }
            #mensajeOK { color:green;}
            #mensajeKO { color:red;}
            
        </style>   
    </head>
    <body>
        <c:if test="${not empty mensajeOK}">
        <span id="mensajeOK">${mensajeOK}</span>
        </c:if>
        <c:if test="${not empty mensajeKO}">
        <span id="mensajeOK">${mensajeKO}</span>
        </c:if>
        
        
        <h2>Listado de todas las promociones</h2>
         <table border="1">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Localidad</th>
                <th>Provincia</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items="${datos}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.nombre}</td>
                <td>${p.localidad}</td>
                <td>${p.provincia.nombre}</td>
                <td><a href="/MVC-CRUD-JSTL/editar?id=${p.id}">Editar</a></td>
                <td><a href="/MVC-CRUD-JSTL/eliminar?id=${p.id}">Eliminar</a></td>
            </tr>
            </c:forEach>
          
         </table>
       <br>
       <a href="nueva.jsp">Dar de Alta nueva Promocion</a>
    </body>
</html>
