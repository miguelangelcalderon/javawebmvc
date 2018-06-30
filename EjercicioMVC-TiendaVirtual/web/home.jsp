<%@page import="com.hazerta.pojos.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tienda virtual-Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            .error { color:red;}
        </style>    
    </head>
    <body>
         <%@include file="total-carrito.jsp"  %>
         <%@include file="menu.html"  %>
        <%
        if (session.getAttribute("currentSessionUser")!=null)
        {
     
            Cliente c=(Cliente)session.getAttribute("currentSessionUser");
        %>  
        <h2>Home del cliente</h2>
        <hr>
        <p>Bienvenido  <%=c.getNombre()%> </p>
        Datos Personales:
        <p>Nombre:<%=c.getNombre() %></p>
        <p>Apellidos:<%=c.getApellidos() %></p>
        <p>Direccion:<%=c.getDireccion() %></p>
        <p>Telefono:<%=c.getTelefono() %></p>
        <p>Email:<%=c.getEmail() %></p>
        <a href="/EjercicioMVC-TiendaVirtual/Logout">Cerrar Sesion</a>
        <br>
        <a href="sigues.jsp">Continuar</a>
        <% } else {

            out.println("No tiene permisos para entrar en esta zona");
        }%>
    </body>
</html>

