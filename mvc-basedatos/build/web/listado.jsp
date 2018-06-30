<%-- 
    Document   : listado
    Created on : 13-nov-2017, 11:18:12
    Author     : Curso Mañana
--%>

<%@page import="modelo.vo.Alumno"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
    
   ArrayList<Alumno> alumnos=new ArrayList<Alumno>();   
   alumnos=(ArrayList<Alumno>)request.getAttribute("listadoAlumnos");
   

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de clientes</h1>
        <table widht="80%" border="1">
            <tr>
                <th>Id Cliente</th>
                <th>Nombre</th>
                <th>Apellidos</th>
                <th>Email</th>
                <th>Eliminado</th>
            </tr>
            
            <%
                for (Alumno a:alumnos)
                {
                 out.println("<tr>");
                 out.println("<td><a href='/mvc-basedatos/controlador?accion=ver&id="
                         +a.getIdAlumno()+"'>"
                         +a.getIdAlumno()+"</a></td>");
                 out.println("<td>"+a.getNombreAlumno()+"</td>");
                 out.println("<td>"+a.getApellidosAlumno()+"</td>");
                 out.println("<td>"+a.getEmailAlumno()+"</td>");
                 out.println("<td>"+a.isEliminado()+"</td>");
                 out.println("</tr>");
                }
            
            %>  
            </tr>
        </table>
            <h2>Otra forma de hacer la tabla</h2>
            <table widht="80%" border="1">
            <tr>
                <th>Id Cliente</th>
                <th>Nombre</th>
                <th>Apellidos</th>
                <th>Email</th>
                <th>Eliminado</th>
            </tr>
            <%for (Alumno a:alumnos)
                {
            %>    
            <tr>
                <td><a href='/mvc-basedatos/controlador?accion=ver&id=<%=a.getIdAlumno()%>'><%=a.getIdAlumno()%></a></td>
                <td><%=a.getNombreAlumno()%></td>
                <td><%=a.getApellidosAlumno()%></td>
                <td><%=a.getEmailAlumno()%></td>
                <td><%=a.isEliminado()%></td>
            </tr>   
            <% } %>
            
    </body>
</html>
