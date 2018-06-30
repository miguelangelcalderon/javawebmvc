<%-- 
    Document   : selecciona-cerveza
    Created on : 22-may-2018, 18:56:15
    Author     : Practicas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Que tipo de cerveza te gusta</h2>
        <form method="post" action="/MVC-Bar/Camarero">
        <table border="1">
            <tr>
                <td>Tipos</td>
                    <td>
                    <select name="tipos">
                        <option value="1">Rubias</option>
                        <option value="2">Ambar</option>
                        <option value="3">Negra</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button>Enviar</button>
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>
