package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexInicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <title>Rawson BPO</title>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS CDN -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <!-- Our Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome JS -->\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <!-- Sidebar  -->\n");
      out.write("        <nav id=\"sidebar\">\n");
      out.write("               <div class=\"sidebar-header\">\n");
      out.write("                <a href=\"index.html\">\n");
      out.write("                    <img src=\"img/LOGO-RAWSONBPO-9.png\" height=\"70\"  alt=\"\"/></a>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled components\">\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                       <a href=\"crea_requisito.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-briefcase\"></i>\n");
      out.write("                            Crear Requisito\n");
      out.write("                        </a>\n");
      out.write("                       \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                      \n");
      out.write("                        <a href=\"crea_informe.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-duplicate\"></i>\n");
      out.write("                             Crear Informe\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"repositorio.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-cloud\"></i>\n");
      out.write("                           Repositorio\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                  \n");
      out.write("                     <li >\n");
      out.write("                        <a href=\"crea_alerta.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-flag\"></i>\n");
      out.write("                            Crear Alerta\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <!--\n");
      out.write("                <ul class=\"list-unstyled CTAs\">\n");
      out.write("                   \n");
      out.write("                  <li><a href=\"#\" class=\"article\"><i class=\"glyphicon glyphicon-earphone\"></i>Llamar a Chicho</a></li>\n");
      out.write("              </ul>\n");
      out.write("          -->\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Content  -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-info\">\n");
      out.write("                        <i class=\"glyphicon glyphicon-list\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <i class=\"fas fa-align-justify\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"proyectos2.html\">Proyectos</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"chat.html\">Chat</a>\n");
      out.write("                            </li>\n");
      out.write("                           \n");
      out.write("                             <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link \" data-toggle=\"dropdown\" href=\"#\" role=\"button\" >Idioma</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\"></a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Inglés</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Francés</a>\n");
      out.write("      \n");
      out.write("                                    </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">Perfil</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"perfil.html\">Perfil</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("             <h2>Proyecto 1</h2>\n");
      out.write("                <p>Descripción del Proyecto en el que estás trabajando, el último proyecto abierto:<br />\n");
      out.write("                Rawson BPO es una empresa tecnológica de servicios profesionales y desarrollo de soluciones innovadoras. Fundada a principios de 2015 con capital 100% español su vocación es, por un lado, proveer a sus clientes de los mejores y más motivados profesionales tecnológicos y, por otro, desarrollar soluciones tecnológicas especializadas y servicios BPO que cubran distintas necesidades y procesos de negocio.</p>\n");
      out.write("                <p>Fundada a principios de 2015 con capital 100% español su vocación es, por un lado, proveer a sus clientes de los mejores y más motivados profesionales tecnológicos y, por otro, desarrollar soluciones tecnológicas especializadas y servicios BPO que cubran distintas necesidades y procesos de negocio.</p>\n");
      out.write("\n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery CDN - Slim version (=without AJAX) -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Popper.JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/js.js\"></script>\n");
      out.write("</body>\n");
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
