<%-- 
    Document   : editar
    Created on : 23-may-2018, 17:56:18
    Author     : Practicas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

      <h2>Datos de la promociona${datos.nombre} </h2>
      <form method="post" action="/MVC-CRUD-JSTL/actualizar">
        <table>
            <tr>
                <td>Nombre:</td>
                <td><input type="text"
                           size="20"
                           name="nombre"
                           value="${datos.nombre}"></td>
            </tr> 
            <tr>
                <td>Descripcion:</td>
                <td>
                   <textarea rows="4" cols="30" name="descripcion"><c:out value="${datos.descripcion}"/>
                   </textarea>
                </td>
            </tr> 
            <tr>
                <td>Foto:</td>
                <td><input type="text"
                           size="20"
                           name="foto"
                           value="${datos.foto}">
                    <img src="img/${datos.foto}}"
                         width="150"
                         height="150">
                </td>
            </tr> 
            <tr>
                <td>Direccion:</td>
                <td><input type="text"
                           size="40"
                           name="direccion"
                           value="${datos.direccion}"/>
                </td>
               
            </tr>
            <tr>
                <td>Localidad:</td>
                <td>
                    <input type="text"
                           size="30"
                           name="localidad"
                           value="${datos.localidad}"/>
                </td>
            </tr>
            <tr>
                <td>Provincia:</td>
                <td>
                    <select name="provincia">
                        <c:forEach items="${provincias}" var="p">
                        <option value="${p.id}" ${p.id eq datos.provincia.id ? "selected":""}>${p.nombre}</option>
                       </c:forEach>    
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
        
          <input type="hidden" name="codigo" value="${datos.id}" />>
      </form>
      <hr>
      <a href="/listar">Ver promociones</a>
    </body>
</html>

