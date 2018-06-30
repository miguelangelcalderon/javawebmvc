<%-- 
    Document   : listado
    Created on : 25-may-2018, 15:30:28
    Author     : Alumno
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hazerta.pojos.Articulos"%>
<%@page import="com.hazerta.modelo.ArticuloDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArticuloDAO aDAO=new ArticuloDAO();
    ArrayList<Object[]> articulos=aDAO.getAllAlgunosCampos();
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
       <!-- VERSION JSP --> 
       
       <h1>Todos los articulos, SOLO ALGUNOS CAMPOS en JSP</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Pvp</th>
            </tr>
            <%
              for (Object[] o:articulos) {
            %>    
              <tr>
                  <td><%=o[0]%></td>
                  <td><%=o[1]%></td>
                  <td><%=o[2]%></td>
              </tr>
           <%
              }
           %>    
        </table>
       <h1>Todos los articulos, SOLO ALGUNOS CAMPOS en JSTL</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Pvp</th>
            </tr>
             <c:forEach var="a" items="${listado}">
              <tr>
                  <td>${a[0]}</td>
                  <td>${a[1]}</td>
                  <td>${a[2]}</td>
              </tr>
          </c:forEach>
            <a href="nuevo.jsp">Insertar nuevo articulo</a>
    </body>
</html>
