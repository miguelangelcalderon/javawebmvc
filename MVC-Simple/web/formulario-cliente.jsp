<%-- 
    Document   : formulario-cliente
    Created on : 22-may-2018, 16:59:37
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
        <form method="post" action="/MVC-Simple/controlador">
        <table border="1">
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre" size="20">
                </td>
            </tr>
            <tr>
                <td>Profesion</td>
                    <td>
                    <select name="profesion">
                        <option value="Estudiante">Estudiante</option>
                        <option value="Autonomo">Autonomo</option>
                        <option value="Cuenta ajena">Cuenta ajena</option>
                        <option value="Funcionario">Funcionario</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Edad:</td>
                <td>
                <input type="number" size="3" name="edad">
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
