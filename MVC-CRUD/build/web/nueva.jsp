<%-- 
    Document   : nueva
    Created on : 23-may-2018, 17:56:35
    Author     : Practicas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelos.ProvinciaDAO"%>
<%@page import="pojos.Provincia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta de nueva promocion</title>
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
    <%
    ProvinciaDAO provDAO=new ProvinciaDAO();
    ArrayList<Provincia> provincias=provDAO.getAll();
    %>
      <h2>Datos de la nueva promociona insertar</h2>
      <form method="post" action="Controlador">
        <table>
            <tr>
                <td>Nombre:</td>
                <td><input type="text"
                           size="20" 
                           name="nombre"></td>
            </tr> 
            <tr>
                <td>Descripcion:</td>
                <td>
                    <textarea rows="4" cols="30" name="descripcion">
                        
                    </textarea>
                </td>
            </tr> 
            <tr>
                <td>Foto:</td>
                <td><input type="text"
                           size="20"
                           name="foto">
                </td>
            </tr> 
            <tr>
                <td>Direccion:</td>
                <td><input type="text"
                           size="40"
                           name="direccion">
                </td>
               
            </tr>
            <tr>
                <td>Localidad:</td>
                <td>
                    <input type="text"
                           size="30"
                           name="localidad">
                </td>
            </tr>
            <tr>
                <td>Provincia:</td>
                <td>
                    <select name="provincia">
                        <%
                         for (Provincia pro:provincias)
                         {
                             
                             out.println("<option value='"+pro.getId()+"'>"
                             +pro.getNombre()+"</option>");
                         }
                        %>   
                    </select>
                </td>
            </tr>
                <tr><td colspan="2">
                    <button>Enviar</button>
                    &nbsp;
                    <input type="reset" value="Limpiar">
                </td>
            </tr> 
        </table>
          <input type="hidden" name="accion" value="insertar">
      </form>
    </body>
</html>
