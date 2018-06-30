<%-- 
    Document   : listado.jsp
    Created on : 23-may-2018, 17:48:20
    Author     : Practicas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="pojos.Promocion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  ArrayList<Promocion> promociones=new ArrayList<Promocion>();
  promociones=(ArrayList<Promocion>)request.getAttribute("datos");
    
%>    
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
        <%
            if (request.getAttribute("mensajeOK")!="" && request.getAttribute("mensajeOK")!=null)
            {
        %>    
        <span id="mensajeOK"><%=request.getAttribute("mensajeOK")%></span>
        <% } %>
     
        <%
            if (request.getAttribute("mensajeKO")!="" && request.getAttribute("mensajeKO")!=null)
            {
        %>    
        <span id="mensajeKO"><%=request.getAttribute("mensajeKO")%></span>
        <% } %>
     
        
        
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
            <%
              for (Promocion p:promociones)
              {
              %>    
            <tr>
                <td><%=p.getId() %></td>
                <td><%=p.getNombre()%></td>
                <td><%=p.getLocalidad()%></td>
                <td><%= p.getProvincia().getNombre()%></td>
                
                <td><a href="Controlador?accion=editar&id=<%=p.getId()%>">Editar</a></td>
                <td><a href="Controlador?accion=eliminar&id=<%=p.getId()%>">Eliminar</a></td>
            </tr>
            <% } %>
         </table>
       <br>
       <a href="nueva.jsp">Dar de Alta nueva Promocion</a>
    </body>
</html>
