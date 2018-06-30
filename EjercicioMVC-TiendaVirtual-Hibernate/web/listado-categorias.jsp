<%-- 
    Document   : listado
    Created on : 25-may-2018, 15:30:28
    Author     : Alumno
--%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="com.hazerta.pojos.Articulos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hazerta.modelo.CategoriaDAO"%>
<%@page import="com.hazerta.pojos.Categorias"%>
<%@page import="com.hazerta.modelo.ArticuloDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    CategoriaDAO cDAO=new CategoriaDAO();
    Categorias categoria=cDAO.getById(2);
    
    Set<Articulos> articulos=categoria.getArticuloses();


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
         
         
         
         
         <h2> Categoria:<%=categoria.getNombre() %> </h2>
        <h1>Todos los articulos</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Pvp</th>
                <th>Foto</th>
                <th>Novedad</th>
                <th>Oferta</th>
                <th>Proveedor</th>
            </tr>
            
            <% for (Articulos a:articulos) { %>
              <tr>
                  <td></td>
                  <td><%=a.getNombre() %></td>
                  <td><%=a.getPvp()%></td>
                  <td></td>
                  <td></td>
                  <td></td>
                  <td><%=a.getProveedores().getNombre() %>
                 </td>
              </tr>
            <% } %>
        </table>
            <a href="nuevo.jsp">Insertar nuevo articulo</a>
        
    </body>
</html>
