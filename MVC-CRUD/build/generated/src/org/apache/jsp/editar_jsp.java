package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edicion de la  promocion</title>\n");
      out.write("        <style>\n");
      out.write("            table { width:500px;\n");
      out.write("                    margin:40px auto;\n");
      out.write("                    background-color:ghostwhite;\n");
      out.write("                    border:1px solid red;\n");
      out.write("                    border-collapse: collapse;}\n");
      out.write("            th,td {border:1px solid black;\n");
      out.write("                     \n");
      out.write("                   }\n");
      out.write("          \n");
      out.write("        </style>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <h2>Datos de la promociona XXXXXCX</h2>\n");
      out.write("      <form method=\"post\" action=\"Controlador\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nombre:</td>\n");
      out.write("                <td><input type=\"text\"\n");
      out.write("                           size=\"20\"\n");
      out.write("                           value=\"XXXXX\"></td>\n");
      out.write("            </tr> \n");
      out.write("            <tr>\n");
      out.write("                <td>Descripcion:</td>\n");
      out.write("                <td>\n");
      out.write("                    <textarea rows=\"4\" cols=\"30\" name=\"descripcion\">\n");
      out.write("                       XXXXXX \n");
      out.write("                    </textarea>\n");
      out.write("                </td>\n");
      out.write("            </tr> \n");
      out.write("            <tr>\n");
      out.write("                <td>Foto:</td>\n");
      out.write("                <td><input type=\"text\"\n");
      out.write("                           size=\"20\"\n");
      out.write("                           name=\"foto\"\n");
      out.write("                           value=\"xxxxx\">\n");
      out.write("                    <img src=\"foto/xxxxx.jpg\">\n");
      out.write("                </td>\n");
      out.write("            </tr> \n");
      out.write("            <tr>\n");
      out.write("                <td>Direccion:</td>\n");
      out.write("                <td><input type=\"text\"\n");
      out.write("                           size=\"40\"\n");
      out.write("                           name=\"direccion\"\n");
      out.write("                           value=\"xxxxx\">\n");
      out.write("                </td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Localidad:</td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\"\n");
      out.write("                           size=\"30\"\n");
      out.write("                           name=\"localidad\"\n");
      out.write("                           value=\"xxxxx\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Provincia:</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"provincia\">\n");
      out.write("                        <option value=\"1\">XXXXXX</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                <tr><td colspan=\"2\">\n");
      out.write("                    <button>Enviar</button>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <input type=\"reset\" value=\"Limpiar\">\n");
      out.write("                </td>\n");
      out.write("            </tr> \n");
      out.write("        </table>\n");
      out.write("          <input type=\"hidden\" name=\"accion\" value=\"actualizar\">\n");
      out.write("          <input type=\"hidden\" name=\"codigo\" value=\"XXXXX\">\n");
      out.write("      </form>\n");
      out.write("      <hr>\n");
      out.write("      <a href=\"Controlador?accion=listar\">Ver promociones</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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