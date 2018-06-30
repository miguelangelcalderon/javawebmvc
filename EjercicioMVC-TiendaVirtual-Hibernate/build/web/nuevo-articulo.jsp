<%-- 
    Document   : nuevo-articulo
    Created on : 25-may-2018, 15:44:01
    Author     : Alumno
--%>

<%@page import="com.hazerta.pojos.Proveedores"%>
<%@page import="com.hazerta.modelo.ProveedorDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hazerta.pojos.Categorias"%>
<%@page import="com.hazerta.modelo.CategoriaDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            CategoriaDAO catDAO=new CategoriaDAO();
            ArrayList<Categorias> categorias = catDAO.getAll();
            ProveedorDAO proDAO=new ProveedorDAO();
            ArrayList<Proveedores> proveedores = proDAO.getAll();
            pageContext.setAttribute("categorias",categorias);
            pageContext.setAttribute("proveedores",proveedores);
            
        %>
        <br>
         <%@include file="total-carrito.jsp"  %>
         <%@include file="menu.html"  %>
        <h1>Nuevo Artículo</h1>
        <form method="post" action="Insertar">
            
            Nombre: <input type="text" name="nombre"><br>
            Descripcion: <textarea name="descripcion"></textarea><br>
            PVP: <input type="number" name="pvp"><br>
            Stock: <input type="number" name="stock"><br>
            Foto: <input type="text" name="foto"><br>
            Categoria: 
            <select name="categoria">
            <c:forEach var="c" items="${categorias}">
                <option value="${c.idCategoria}">${c.nombre}</option>    
            </c:forEach>
             </select>
            <br>
             Proveedor: 
             <select name="proveedor">
            <c:forEach var="p" items="${proveedores}">
                <option value="${p.idProveedor}">${p.nombre}</option>    
            </c:forEach>
                            
             </select>
             <br>
            Novedad:    <input type="radio" name="novedad" value="1" > SI
                        <input type="radio" name="novedad" value="0" checked> NO<br>

            Oferta:     <input type="radio" name="oferta" value="1" > SI
                        <input type="radio" name="oferta" value="0" checked> NO<br>
                        <button>Enviar</button>
                          
        </form>
    </body>
</html>
