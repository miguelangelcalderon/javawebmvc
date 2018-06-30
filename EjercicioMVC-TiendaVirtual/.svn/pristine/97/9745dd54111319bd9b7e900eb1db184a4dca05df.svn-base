<%-- 
    Document   : cesta.jsp
    Created on : 30-may-2018, 14:03:10
    Author     : Practicas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Map"%>
<%@page import="java.util.Hashtable"%>
<%@page import="com.hazerta.pojos.Articulo" %>
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
         </style>   
    </head>
    <body>
        <br>
         <%@include file="total-carrito.jsp"  %>
         <%@include file="menu.html"  %>
        <h2>Desglose del carrito:</h2>
        ${session.cesta}
        <c:if test="${empty sessionScope.cesta}">
            Cesta Vacia
        </c:if>
            
            
        <% 
          /*  
          if (session.getAttribute("cesta")==null)  
          {
              out.println("El carrito esta vacio!");
          } else 
          {
              
          Hashtable<Integer,Articulo> carrito=(Hashtable<Integer,Articulo>)session.getAttribute("cesta");
        
          */  
        %>
        <c:if test="${not empty sessionScope.cesta}">
        <table>
            <tr>
                <th>Articulo</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>Acciones</th>
                <th>SubTotal</th>
                <th>&nbsp;</th>
            </tr>
            <%
              /*
              float sumaTotal=0;  
              for(Map.Entry<Integer,Articulo> elemento:carrito.entrySet())  
              { 
                int codigoArticulo=elemento.getKey();
                Articulo actual=elemento.getValue();
                sumaTotal+=(actual.getPvp()*actual.getCantidadCarrito());
            */
            %>
            <c:forEach var="actual" items="${sessionScope.cesta}">
            <tr>
                <td>${actual.key}</td>
                <td>${actual.value.nombre} €</td>
                <td>${actual.value.cantidadCarrito}%></td>
                <td><a href="/EjercicioMVC-TiendaVirtual/Cesta?accion=removeOne&id="><img src="img/restar.png"></a>&nbsp;
                    <a href="/EjercicioMVC-TiendaVirtual/Cesta?accion=addOne&id="><img src="img/aumentar.png"></a>
                    </td>
                <td>${actual.value.pvp*actual.value.cantidadCarrito}%> €</td>
                <td><a href="/EjercicioMVC-TiendaVirtual/Cesta?accion=removeItem&id="><img src="img/eliminar.png"></a></td>
            </tr>
            <c:set var="sumaTotal" value="${sumaTotal +(actual.value.pvp*actual.value.cantidadCarrito)}"/>
            </c:forEach>
            <%
            //  }
             %>   
            <tr><td colspan="6">&nbsp;</td></tr>
            <tr>
                <td colspan="4">&nbsp;</td>
                <td colspan="2">Total:${sumaTotal}</td>
                
            </tr>
        </table>
            <br>
            <a href="/EjercicioMVC-TiendaVirtual/Cesta?accion=destroy">Eliminar Cesta</a>
        <%//}%>
        </c:if>
    </body>
</html>
