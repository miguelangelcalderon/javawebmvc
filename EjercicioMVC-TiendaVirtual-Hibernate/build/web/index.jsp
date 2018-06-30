<%@page import="com.hazerta.pojos.Articulos"%>
<%@page import="com.hazerta.modelo.ArticuloDAO"%>
<%@page import="com.hazerta.pojos.Categorias"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hazerta.modelo.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Tienda virtual</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <style>
         #recomendacion { 
                          margin-left:400px;
                          margin-right:20px;
                          margin-top:5px;
                          margin-bottom:5px;
                      }
        .item { width:150px;
                border:1px solid black;
                float:left;
               }                 
         #contenido { clear:both;}      
    </style>    
  
    </head>
    <body>
        
         <% 
           CategoriaDAO cDAO=new CategoriaDAO();
           ArrayList<Categorias> categorias=new ArrayList<Categorias>();
           categorias=cDAO.getAll();
           
           Cookie[] cookies=request.getCookies();
                                                                            
           if (cookies==null)
        {%>
        <form method="post" action="Cookies">           
        <table>           
            <tr>
                <td>Nombre:<input type="text" name="nombre"></td>                 
            </tr>
            <tr>
                <td>Categoria favorita</td>
                <td>
                <select name="categoria">                  
                    <%
                           for (Categorias cat:categorias)
                           {                              
                              out.println("<option value='"+cat.getIdCategoria()+"'>"+cat.getNombre()+"</option>");
                           }                           
                     %>                   
                </select>
                </td>
            </tr>           
            <tr>
                <td>
                    <button>Enviar</button>
                </td>
            </tr>
        </table>
        </form>
        <%}
        else 
            {  
            ArticuloDAO aDAO=new ArticuloDAO();
            ArrayList<Articulos> articulos=new ArrayList<Articulos>();          
            articulos=aDAO.getThree(Integer.parseInt(cookies[2].getValue()));
    //Cuidado que a veces manda (o no) la cookie de sesion, y el array se descoloca

            out.println("Bienvenido/a "+cookies[1].getValue()+", la ultima vez que estuviste en la tienda seleccionaste"+
                " tu categoria favorira, que es "+cookies[2].getValue()+", con lo que te mostramos algunos productos de la misma:");
        %>
        <br>
        
        <div id="recomendacion">
            <%  for (Articulos a:articulos)
            {   %>
              <div class="item">
                  <a href="detalle-articulo.jsp?id=<%=a.getIdArticulo()%>"><%=a.getNombre()%></a>
                <br>
               <%=a.getPvp()%>€
                <br>
                <img src="img/<%=a.getFoto() %>" height="50" width="50" >
                <br>
                </div>
            <%   }%>  
            
        </div>
        <%}%>
        <div id="contenido">
        <h2>Bienvenidos a la tienda virtual</h2>
        <%@include file="total-carrito.jsp"  %>
        <%@include file="menu.html"  %>
        
        <!-- POSIBLE ZONA DE LA PRACTICA DE COOKIES -->
        
        
        
        </div>
    </body>
</html>
