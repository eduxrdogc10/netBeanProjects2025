package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AltaAlumno_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container mt-4 col-lg-4\">\n");
      out.write("    <div class=\"card border-info\">\n");
      out.write("        <div class=\"card-header bg-info\">\n");
      out.write("            <h3>Alta de Alumno</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <form method=\"POST\">\n");
      out.write("                <label>Cuenta:</label>\n");
      out.write("                <input type=\"texto\" name=\"cuenta\" class=\"form-control\">\n");
      out.write("                <label>Nombre:</label>\n");
      out.write("                <input type=\"texto\" name=\"nombre\" class=\"form-control\">\n");
      out.write("                <label>Paterno:</label>\n");
      out.write("                <input type=\"texto\" name=\"paterno\" class=\"form-control\">\n");
      out.write("                <label>Materno:</label>\n");
      out.write("                <input type=\"texto\" name=\"materno\" class=\"form-control\">\n");
      out.write("                <label>Fecha de Nacimiento:</label>\n");
      out.write("                <input type=\"texto\" name=\"fechaNac\" class=\"form-control\">\n");
      out.write("                <label>Correo:</label>\n");
      out.write("                <input type=\"texto\" name=\"correo\" class=\"form-control\">\n");
      out.write("                <label>Celular:</label>\n");
      out.write("                <input type=\"texto\" name=\"celular\" class=\"form-control\">\n");
      out.write("                <label>Codigo:</label>\n");
      out.write("                <input type=\"texto\" name=\"codigo\" class=\"form-control\">\n");
      out.write("                <button type=\"submit\" class =\"btn btn-success\">Agregar</button>\n");
      out.write("                <a href=\"index.htm\" class=\"btn btn-warning\">Regresar</a>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
