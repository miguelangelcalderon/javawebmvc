<%-- 
    Document   : detalle-alumno
    Created on : 20-nov-2017, 9:32:24
    Author     : Curso Mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.vo.Alumno" %>
<!DOCTYPE html>
<%
  Alumno alumno=(Alumno)request.getAttribute("alumno");  
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del alumno</h1>
        <table border="1">
            <tr><td>Id Alumno:</td><td><%=alumno.getIdAlumno()%></td></tr>    
            <tr><td>Nombre:    </td><td><%=alumno.getNombreAlumno()%></td></tr>    
            <tr><td>Apellido:  </td><td><%=alumno.getApellidosAlumno()%></td></tr>    
            <tr><td>Email:     </td><td><%=alumno.getEmailAlumno()%></td></tr>    
            <tr><td>Eliminado: </td><td><%=alumno.isEliminado()%></td></tr>    
            
        </table>
        
        
    </body>
</html>
