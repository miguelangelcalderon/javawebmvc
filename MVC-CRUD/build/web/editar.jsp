<%-- 
    Document   : editar
    Created on : 23-may-2018, 17:56:18
    Author     : Practicas
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojos.Provincia"%>
<%@page import="modelos.ProvinciaDAO"%>
<jsp:useBean id="datos" scope="request" class="pojos.Promocion" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edicion de la  promocion</title>
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
    Integer id_provincia=datos.getProvincia().getId();
    ProvinciaDAO provDAO=new ProvinciaDAO();
    ArrayList<Provincia> provincias=provDAO.getAll();
    String selected="";

%>

        <h2>Datos de la promociona <jsp:getProperty name="datos" property="nombre" /></h2>
      <form method="post" action="Controlador">
        <table>
            <tr>
                <td>Nombre:</td>
                <td><input type="text"
                           size="20"
                           name="nombre"
                           value="<jsp:getProperty name="datos" property="nombre" />"></td>
            </tr> 
            <tr>
                <td>Descripcion:</td>
                <td>
                    <textarea rows="4" cols="30" name="descripcion"><jsp:getProperty name="datos" property="descripcion" /></textarea>
                </td>
            </tr> 
            <tr>
                <td>Foto:</td>
                <td><input type="text"
                           size="20"
                           name="foto"
                           value="<jsp:getProperty name="datos" property="foto" />">
                    <img src="img/<jsp:getProperty name="datos" property="foto" />"
                         width="150"
                         height="150">
                </td>
            </tr> 
            <tr>
                <td>Direccion:</td>
                <td><input type="text"
                           size="40"
                           name="direccion"
                           value="<jsp:getProperty name="datos" property="direccion" />">
                </td>
               
            </tr>
            <tr>
                <td>Localidad:</td>
                <td>
                    <input type="text"
                           size="30"
                           name="localidad"
                           value="<jsp:getProperty name="datos" property="localidad" />">
                </td>
            </tr>
            <tr>
                <td>Provincia:</td>
                <td>
                    <select name="provincia">
                        <%
                         for (Provincia pro:provincias)
                         {
                             selected=(pro.getId()==id_provincia)?"selected":"";
                             out.println("<option value='"+pro.getId()+"' "+selected+">"
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
          <input type="hidden" name="accion" value="actualizar">
          <input type="hidden" name="codigo" value="<jsp:getProperty name="datos" property="id" />">
      </form>
      <hr>
      <a href="Controlador?accion=listar">Ver promociones</a>
    </body>
</html>

