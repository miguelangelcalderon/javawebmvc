<%-- 
    Document   : recmendacion
    Created on : 22-may-2018, 18:56:26
    Author     : Practicas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelos.Cerveza"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArrayList<Cerveza> listado=(ArrayList<Cerveza>)request.getAttribute("cervezas");
    

%>    

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Has seleccionado el tipo: <%=request.getAttribute("tipo") %></h2>
        <hr>
        Tenemos para ti:
        <table border='1'>
            <tr><th>Nombre Cerveza</th>
                <th>Descripcion Cerveza</th>
            </tr>
            
                <%
                  for (Cerveza c:listado) {
                  out.println("<tr>\n");
                  out.println("<td>"+c.getNombre()+"</td><td>"+c.getDescripcion()+"</td>\n");
                  out.println("</tr>\n");
                  }  
                %>    
               
          
        </table>
                Para SWitlana:
                <table border='1'>
            <tr><th>Nombre Cerveza</th>
                <th>Descripcion Cerveza</th>
            </tr>
            
                <%
                  for (Cerveza c:listado) {
                 %>
                 
                 <tr>
                  <td><%=c.getNombre() %></td>
                  <td><%=c.getDescripcion() %></td>
                 
                 </tr>
                 <%
                  }  
                %>    
               
          
        </table>
    </body>
</html>
