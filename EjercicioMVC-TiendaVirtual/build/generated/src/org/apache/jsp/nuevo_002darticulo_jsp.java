package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hazerta.pojos.Proveedor;
import com.hazerta.modelo.ProveedorDAO;
import java.util.ArrayList;
import com.hazerta.pojos.Categoria;
import com.hazerta.modelo.CategoriaDAO;

public final class nuevo_002darticulo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            CategoriaDAO catDAO=new CategoriaDAO();
            ArrayList<Categoria> categorias = catDAO.getAll();
            ProveedorDAO proDAO=new ProveedorDAO();
            ArrayList<Proveedor> proveedores = proDAO.getAll();
        
        
      out.write("\n");
      out.write("        <h1>Nuevo Artículo</h1>\n");
      out.write("        <form method=\"post\" action=\"Insertar\">\n");
      out.write("            \n");
      out.write("            Nombre: <input type=\"text\" name=\"nombre\"><br>\n");
      out.write("            Descripcion: <textarea name=\"descripcion\"></textarea><br>\n");
      out.write("            PVP: <input type=\"number\" name=\"pvp\"><br>\n");
      out.write("            Stock: <input type=\"number\" name=\"stock\"><br>\n");
      out.write("            Foto: <input type=\"text\" name=\"foto\"><br>\n");
      out.write("            Categoria: <select name=\"categoria\">\n");
      out.write("                \n");
      out.write("            ");

                           
                for (Categoria cat:categorias){
                                 
                    out.println("<option value='"+cat.getId_categoria()+"' >"+cat.getNombre()+"</option>");
                }
            
      out.write("                \n");
      out.write("                \n");
      out.write("                        </select> <br>\n");
      out.write("                        Proveedor: <select name=\"proveedor\">\n");
      out.write("            ");

                           
                for (Proveedor pro:proveedores){
                                 
                    out.println("<option value='"+pro.getId_proveedor()+"' >"+pro.getNombre()+"</option>");
                }
            
      out.write("                            \n");
      out.write("                            \n");
      out.write("                                    </select><br>\n");
      out.write("            Novedad:    <input type=\"radio\" name=\"novedad\" value=\"1\" > SI\n");
      out.write("                        <input type=\"radio\" name=\"novedad\" value=\"0\" checked> NO<br>\n");
      out.write("\n");
      out.write("            Oferta:     <input type=\"radio\" name=\"oferta\" value=\"1\" > SI\n");
      out.write("                        <input type=\"radio\" name=\"oferta\" value=\"0\" checked> NO<br>\n");
      out.write("                        <button>Enviar</button>\n");
      out.write("                          \n");
      out.write("        </form>\n");
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
