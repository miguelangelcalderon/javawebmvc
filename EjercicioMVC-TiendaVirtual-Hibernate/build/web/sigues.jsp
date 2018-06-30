<%@page import="com.hazerta.pojos.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  if (session.getAttribute("currentSessionUser")!=null)
  {
     
    Cliente c=(Cliente)session.getAttribute("currentSessionUser");

%>    

<html>
    <head>
        <title>Tienda virtual-Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         
    </head>
    <body>
        
        <h2>Sigues por aqui <%=c.getNombre()%> <%=c.getApellidos() %></h2>
        <hr>
        
        <a href="/EjercicioMVC-TiendaVirtual/Logout">Cerrar Sesion</a>
    </body>
</html>

<% } else {

    out.println("No tiene permisos para entrar en esta zona");
}%>
