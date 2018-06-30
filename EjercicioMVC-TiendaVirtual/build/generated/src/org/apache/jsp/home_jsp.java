package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hazerta.pojos.Cliente;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/total-carrito.jsp");
    _jspx_dependants.add("/menu.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

  if (session.getAttribute("currentSessionUser")!=null)
  {
     
    Cliente c=(Cliente)session.getAttribute("currentSessionUser");


      out.write("    \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Tienda virtual-Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            .error { color:red;}\n");
      out.write("        </style>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("<div style=\"text-align:right\">\n");
      out.write("    \n");
      out.write("       ");
 if (session.getAttribute("currentSessionUser")==null) 
          {       
        
      out.write("        \n");
      out.write("       <span class=\"error\">");
      out.print((request.getAttribute("mensaje")!=null)?request.getAttribute("mensaje"):"" );
      out.write("</span>\n");
      out.write("       \n");
      out.write("        <form method=\"post\" action=\"/EjercicioMVC-TiendaVirtual/Login\">\n");
      out.write("            Login:<input type=\"text\" name=\"login\" size=\"10\">\n");
      out.write("            <br>\n");
      out.write("            Pass:<input type=\"password\" name=\"pass\" size=\"10\">\n");
      out.write("            <button>Login</button>\n");
      out.write("        </form>\n");
      out.write("        ");
 }else { 
      out.write("            \n");
      out.write("        ");
      out.print(session.getAttribute("mensaje") );
      out.write("<a href=\"Logout\">Cerrar Sesion</a>;\n");
      out.write("        ");
   }
      out.write("\n");
      out.write("       <Strong>Total Cesta:</Strong>\n");
      out.write("        ");
      out.print((session.getAttribute("total")==null)?"0":session.getAttribute("total") );
      out.write("    \n");
      out.write("</div>");
      out.write("\n");
      out.write("         ");
      out.write("    <hr>\n");
      out.write("    <a href=\"index.jsp\">Home</a> | \n");
      out.write("    <a href=\"listado.jsp\">Ver todos los articulos</a> |\n");
      out.write("    <a href=\"nuevo-articulo.jsp\">Alta de un articulo</a> | \n");
      out.write("    <a href=\"cesta.jsp\">Desglose cesta</a> | \n");
      out.write("    <a href=\"home.jsp\">Mis datos</a>\n");
      out.write("    <hr>");
      out.write("\n");
      out.write("        \n");
      out.write("        <h2>Home del cliente</h2>\n");
      out.write("        <hr>\n");
      out.write("        <p>Bienvenido  ");
      out.print(c.getNombre());
      out.write(" </p>\n");
      out.write("        Datos Personales:\n");
      out.write("        <p>Nombre:");
      out.print(c.getNombre() );
      out.write("</p>\n");
      out.write("        <p>Apellidos:");
      out.print(c.getApellidos() );
      out.write("</p>\n");
      out.write("        <p>Direccion:");
      out.print(c.getDireccion() );
      out.write("</p>\n");
      out.write("        <p>Telefono:");
      out.print(c.getTelefono() );
      out.write("</p>\n");
      out.write("        <p>Email:");
      out.print(c.getEmail() );
      out.write("</p>\n");
      out.write("        \n");
      out.write("        <a href=\"/EjercicioMVC-TiendaVirtual/Logout\">Cerrar Sesion</a>\n");
      out.write("   \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <a href=\"sigues.jsp\">Continuar</a>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
 } else {

    out.println("No tiene permisos para entrar en esta zona");
}
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
