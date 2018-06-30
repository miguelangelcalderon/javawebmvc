<%-- 
    Document   : detalle-articulo
    Created on : 25-may-2018, 15:44:20
    Author     : Alumno
--%>

<%@page import="com.hazerta.modelo.ArticuloDAO"%>
<%@page import="com.hazerta.pojos.Articulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<%
    ArticuloDAO aDAO=new ArticuloDAO();
    Articulo a=aDAO.getById(Integer.parseInt(request.getParameter("id")));
    pageContext.setAttribute("a",a);
    
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Tienda Virtual</title>
    <style>
            table {width:500px;
                   margin:40px auto;
                   background-color:bisque;
                   border:1px solid black;
                  border-collapse:collapse;}
            th,td {
                    border:1px solid black;
                    border-collapse:collapse;
                }
     
    </style>
    </head>
    <body>
        <br>
         <%@include file="total-carrito.jsp"  %>
         <%@include file="menu.html"  %>
  <h2>Datos del  producto ${a.nombre}}</h2>
            <table>
            <tr>           
                <th>Nombre</th>
                <td>${a.nombre}}</td>
                
            </tr>
            <tr>
               <th>Descripcion</th>
                <td>${a.descripcion}</td>
               
            </tr>
            <tr>
                <th>Precio</th>
                <td>${a.pvp} €</td>
                
            </tr>    
            <tr>
                <th>Stock</th>
                <td>${a.stock}</td>
            </tr>
            <tr>
                <th>Foto</th>
                <td><img src="img/${a.foto}" width="150" height="150"></td>
            </tr>
            <tr>
                <th>Categoría</th>
                <td>${a.categoria.nombre}</td>
            </tr>
            <tr>
                <th>Proveedor</th>
                <td>${a.proveedor.nombre}</td>
                
            </tr>
            <tr>
                <th>Novedad</th>
                <td>${a.novedad eq 1?"SI":"NO"}</td>
            </tr>
            <tr>
                <th>Oferta</th>
                <td>${a.oferta eq 1?"SI":"NO"}</td>
            </tr>
             <tr>
                 <td colspan="2">
                     <a href="/EjercicioMVC-TiendaVirtual/Cesta?accion=add&id=${a.id}">
                     <img src="img/add-to-cart.png" width="50" height="50">
                     </a>
                 </td>
                 
            </tr>

        </table>
    </body>
</html>

