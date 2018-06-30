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
        <div id="recomendacion">
              <div class="item">
                Articulo
                <br>
                Pvp
                <br>
                Foto
                <br>
                </div>   
            <div class="item">
                Articulo
                <br>
                Pvp
                <br>
                Foto
                <br>
                    
                </div>     
            <div class="item">
                Articulo
                <br>
                Pvp
                <br>
                Foto
                <br>
                    
                </div>     
        </div>
     
        <div id="contenido">
        <h2>Bienvenidos a la tienda virtual</h2>
        <%@include file="total-carrito.jsp"  %>
        <%@include file="menu.html"  %>
        
        <!-- POSIBLE ZONA DE LA PRACTICA DE COOKIES -->
        
        
        
        </div>
    </body>
</html>
