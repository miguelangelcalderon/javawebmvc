<%-- 
    Document   : listado
    Created on : 25-may-2018, 15:30:28
    Author     : Alumno
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hazerta.pojos.Articulo"%>
<%@page import="com.hazerta.modelo.ArticuloDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArticuloDAO aDAO=new ArticuloDAO();
    ArrayList<Articulo> articulos=aDAO.getAll();
    pageContext.setAttribute("listado",articulos);
 %>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {width:600px;
                   margin: 40px auto;
                   background-color:ghostwhite;
                   border: 1px solid red;
                   border-collapse:collapse;}
            th,td{
                border: 1px solid black;
                border-collapse:collapse;
            }
           
        </style>
    </head>
    <body>
        <br>
         <%@include file="total-carrito.jsp"  %>
         <%@include file="menu.html"  %>
        <h1>Todos los articulos</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Pvp</th>
                <th>Foto</th>
                <th>Novedad</th>
                <th>Oferta</th>
                <th>&nbsp;</th>
            </tr>
          <c:forEach var="a" items="${listado}">
              <tr>
                  <td>${a.id}</td>
                  <td><a href="detalle-articulo.jsp?id=${a.id}">${a.nombre}</a></td>
                  <td>${a.pvp}</td>
                  <td><img src="img/${a.foto}" height="50" ></td>
                  <td>${a.novedad eq 1?"SI":"NO"}</td>
                  <td>${a.oferta eq 1?"SI":"NO"}</td>
                   <td>
                     <a href="/EjercicioMVC-TiendaVirtual/Cesta?accion=add&id=${a.id}">
                     <img src="img/add-to-cart.png" width="50" height="50">
                     </a>
                 </td>
              </tr>
          </c:forEach>
            
        </table>
            <a href="nuevo.jsp">Insertar nuevo articulo</a>
        
    </body>
</html>
