package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.hazerta.pojos.Articulo;
import com.hazerta.modelo.ArticuloDAO;

public final class listado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/total-carrito.jsp");
    _jspx_dependants.add("/menu.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

    ArticuloDAO aDAO=new ArticuloDAO();
    ArrayList<Articulo> articulos=aDAO.getAll();
    pageContext.setAttribute("listado",articulos);
 
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
      out.write("        <form method=\"post\" action=\"/EjercicioMVC-TiendaVirtual/Login\">\n");
      out.write("            Login:<input type=\"text\" name=\"login\" size=\"10\">\n");
      out.write("            <br>\n");
      out.write("            Pass:<input type=\"password\" name=\"pass\" size=\"10\">\n");
      out.write("            <button>Login</button>\n");
      out.write("        </form>\n");
      out.write("        ");
 }else {            
            out.println("En sesion");
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
      out.write("          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("a");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listado}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              <tr>\r\n");
          out.write("                  <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                  <td><a href=\"detalle-articulo.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></td>\r\n");
          out.write("                  <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.pvp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                  <td><img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.foto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"50\" ></td>\r\n");
          out.write("                  <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.novedad eq 1?\"SI\":\"NO\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                  <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.oferta eq 1?\"SI\":\"NO\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                   <td>\r\n");
          out.write("                     <a href=\"/EjercicioMVC-TiendaVirtual/Cesta?accion=add&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                     <img src=\"img/add-to-cart.png\" width=\"50\" height=\"50\">\r\n");
          out.write("                     </a>\r\n");
          out.write("                 </td>\r\n");
          out.write("              </tr>\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
