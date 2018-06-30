<%-- 
    Document   : listado
    Created on : 23-may-2018, 16:05:31
    Author     : Practicas
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojos.Articulo"%>
<%@page import="modelos.ArticuloDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ArticuloDAO aDAO=new ArticuloDAO();
    ArrayList<Articulo> articulos=new ArrayList<Articulo>();
    articulos=aDAO.getAll();
    /*
    try { 
    articulos=aDAO.getAll();
    }catch(SQLException ex) {
        out.println("Se ha producido un error de SQL "+ex.getMessage());
     return;   
    }
    */
    
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
    </head>
    <body>
        <h2>Listado de todos los productos con For Each</h2>
         <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Precio</th>
                
            </tr>
            <%
              for (Articulo a:articulos)
              {
            %>    
            <tr>
                <td><%=a.getId()     %></td>
                <td><%=a.getNombre() %> </td>
                <td><%=a.getPrecio() %> €</td>
            </tr>
            <%}%>    
        </table>
        <h2>Listado de todos los productos con Iterator</h2>
         <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Precio</th>
            </tr>
            <%
              Iterator it=articulos.iterator();
              while (it.hasNext())
              {
                  Articulo a=(Articulo)it.next();
            %>    
            <tr>
                <td><%=a.getId()     %></td>
                <td><%=a.getNombre() %> </td>
                <td><%=a.getPrecio() %> €</td>
            </tr>
            <%}%>    
        </table>
    </body>
</html>
