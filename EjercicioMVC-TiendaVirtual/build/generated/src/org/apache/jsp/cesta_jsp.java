package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.Hashtable;
import com.hazerta.pojos.Articulo;

public final class cesta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <style>\n");
      out.write("            table { width:500px;\n");
      out.write("                    margin:40px auto;\n");
      out.write("                    background-color:ghostwhite;\n");
      out.write("                    border:1px solid red;\n");
      out.write("                    border-collapse: collapse;}\n");
      out.write("            th,td {border:1px solid black;\n");
      out.write("                   }\n");
      out.write("         </style>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Desglose del carrito:</h2>\n");
      out.write("        ");
 
          if (session.getAttribute("cesta")==null)  
          {
              out.println("El carrito esta vacio!");
          } else 
          {
              
          Hashtable<Integer,Articulo> carrito=(Hashtable<Integer,Articulo>)session.getAttribute("cesta");
              
          
        
        
      out.write("\n");
      out.write("   \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Articulo</th>\n");
      out.write("                <th>Precio</th>\n");
      out.write("                <th>Cantidad</th>\n");
      out.write("                <th>Acciones</th>\n");
      out.write("                <th>SubTotal</th>\n");
      out.write("                <th>&nbsp;</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

              float sumaTotal=0;  
              for(Map.Entry<Integer,Articulo> elemento:carrito.entrySet())  
              { 
                int codigoArticulo=elemento.getKey();
                Articulo actual=elemento.getValue();
                sumaTotal+=(actual.getPvp()*actual.getCantidadCarrito());
            
      out.write("    \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(actual.getNombre());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(actual.getPvp());
      out.write(" €</td>\n");
      out.write("                <td>");
      out.print(actual.getCantidadCarrito());
      out.write("</td>\n");
      out.write("                <td><a href=\"/EjercicioMVC-TiendaVirtual/Cesta?accion=removeOne&id=");
      out.print(codigoArticulo);
      out.write("\"><img src=\"img/restar.png\"></a>&nbsp;\n");
      out.write("                    <a href=\"/EjercicioMVC-TiendaVirtual/Cesta?accion=addOne&id=");
      out.print(codigoArticulo );
      out.write("\"><img src=\"img/aumentar.png\"></a>\n");
      out.write("                    </td>\n");
      out.write("                <td>");
      out.print((actual.getPvp()*actual.getCantidadCarrito()));
      out.write(" €</td>\n");
      out.write("                <td><a href=\"/EjercicioMVC-TiendaVirtual/Cesta?accion=removeItem&id=");
      out.print(codigoArticulo );
      out.write("\"><img src=\"img/eliminar.png\"></a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

              }
             
      out.write("   \n");
      out.write("            <tr><td colspan=\"6\">&nbsp;</td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\">&nbsp;</td>\n");
      out.write("                <td colspan=\"2\">Total:");
      out.print(sumaTotal);
      out.write("</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"/Carrito-v1/destroy\">Eliminar Cesta</a>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
