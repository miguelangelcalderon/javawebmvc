<div style="text-align:right">
    
       <% if (session.getAttribute("currentSessionUser")==null) 
          {       
        %>        
       <span class="error"><%=(request.getAttribute("mensaje")!=null)?request.getAttribute("mensaje"):"" %></span>
       
        <form method="post" action="Login">
            Login:<input type="text" name="login" size="10">
            Pass:<input type="password" name="pass" size="10">
            <button>Login</button>
        </form>
        <% }else { %>            
        En sesion <a href="Logout">Cerrar Sesion</a>
        <%   }%>
       <Strong>Total Cesta:</Strong>
        <%=(session.getAttribute("total")==null)?"0":session.getAttribute("total") %>    
</div>