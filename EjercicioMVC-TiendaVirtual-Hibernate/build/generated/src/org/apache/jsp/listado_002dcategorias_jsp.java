package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.hazerta.modelo.CategoriaDAO;
import com.hazerta.pojos.Categorias;
import com.hazerta.modelo.ArticuloDAO;

public final class listado_002dcategorias_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    CategoriaDAO cDAO=new CategoriaDAO();
    Categorias categoria=cDAO.getById(2);
 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            table {width:600px;\r\n");
      out.write("                   margin: 40px auto;\r\n");
      out.write("                   background-color:ghostwhite;\r\n");
      out.write("                   border: 1px solid red;\r\n");
      out.write("                   border-collapse:collapse;}\r\n");
      out.write("            th,td{\r\n");
      out.write("                border: 1px solid black;\r\n");
      out.write("                border-collapse:collapse;\r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <br>\r\n");
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
      out.write("        <form method=\"post\" action=\"Login\">\n");
      out.write("            Login:<input type=\"text\" name=\"login\" size=\"10\">\n");
      out.write("            Pass:<input type=\"password\" name=\"pass\" size=\"10\">\n");
      out.write("            <button>Login</button>\n");
      out.write("        </form>\n");
      out.write("        ");
 }else { 
      out.write("            \n");
      out.write("        En sesion <a href=\"Logout\">Cerrar Sesion</a>\n");
      out.write("        ");
   }
      out.write("\n");
      out.write("       <Strong>Total Cesta:</Strong>\n");
      out.write("        ");
      out.print((session.getAttribute("total")==null)?"0":session.getAttribute("total") );
      out.write("    \n");
      out.write("</div>");
      out.write("\r\n");
      out.write("         ");
      out.write("    <hr>\n");
      out.write("    <a href=\"index.jsp\">Home</a> | \n");
      out.write("    <a href=\"listado.jsp\">Ver todos los articulos</a> |\n");
      out.write("    <a href=\"nuevo-articulo.jsp\">Alta de un articulo</a> | \n");
      out.write("    <a href=\"cesta.jsp\">Desglose cesta</a> | \n");
      out.write("    <a href=\"home.jsp\">Mis datos</a>\n");
      out.write("    <hr>");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <h2> Categoria:");
      out.print(categoria.getNombre() );
      out.write(" </h2>\r\n");
      out.write("         \r\n");
      out.write("        <h1>Todos los articulos</h1>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Id</th>\r\n");
      out.write("                <th>Nombre</th>\r\n");
      out.write("                <th>Pvp</th>\r\n");
      out.write("                <th>Foto</th>\r\n");
      out.write("                <th>Novedad</th>\r\n");
      out.write("                <th>Oferta</th>\r\n");
      out.write("                <th>&nbsp;</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <td></td>\r\n");
      out.write("                  <td></td>\r\n");
      out.write("                  <td></td>\r\n");
      out.write("                  <td></td>\r\n");
      out.write("                  <td></td>\r\n");
      out.write("                  <td></td>\r\n");
      out.write("                   <td>\r\n");
      out.write("                     \r\n");
      out.write("                 </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("            <a href=\"nuevo.jsp\">Insertar nuevo articulo</a>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
