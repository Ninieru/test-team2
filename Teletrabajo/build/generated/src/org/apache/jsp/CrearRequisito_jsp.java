package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.entidades.Prioridad;
import java.util.List;

public final class CrearRequisito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <title>Rawson BPO</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS CDN -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <!-- Our Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome JS -->\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" integrity=\"sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"PruebaServlet\" method=\"post\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Sidebar  -->\n");
      out.write("            <nav id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-header\">\n");
      out.write("                    <img src=\"img/LOGO-RAWSONBPO-9.png\" height=\"70\"  alt=\"\"/>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled components\">\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"crea_requisito.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-briefcase\"></i>\n");
      out.write("                            Crear Requisito\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"crea_incidencia.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-duplicate\"></i>\n");
      out.write("                            Crear Incidencia\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"repositorio.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-cloud\"></i>\n");
      out.write("                            Repositorio\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"crea_alerta.html\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-flag\"></i>\n");
      out.write("                            Crear Alerta\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!--<ul class=\"list-unstyled CTAs\">\n");
      out.write("                   \n");
      out.write("                  <li><a \n");
      out.write("                           href=\"#\" class=\"article\"><i class=\"glyphicon glyphicon-earphone\"></i>Llamar a Chicho</a></li>\n");
      out.write("              </ul>-->\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-info\">\n");
      out.write("                            <i class=\"fas fa-align-justify\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <i class=\"fas fa-align-justify\"></i>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"proyecto.html\">Proyectos</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"chat.html\">Chat</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link \" data-toggle=\"dropdown\" href=\"#\" role=\"button\" >Idioma</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\"></a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">InglÃ©s</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">FrancÃ©s</a>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"perfil.html\">Perfil</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <!-- CREA REQUISITO -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <p class=\"crear\">Nuevo Requisito</p>\n");
      out.write("                    <label for=\"exampleFormControlTextarea1\">DescripciÃ³n</label>\n");
      out.write("                    <textarea class=\"form-control\" name=\"des\" id=\"exampleFormControlTextarea1\" rows=\"3\" ></textarea>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- formulario-->\n");
      out.write("                <form>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputFile\">AÃ±ade un archivo</label>\n");
      out.write("                        <input type=\"file\" class=\"form-control-file\" id=\"InputFile\" aria-describedby=\"fileHelp\" name=\"file\">\n");
      out.write("                        <small id=\"fileHelp\" class=\"form-text text-muted\">Puedes aÃ±adir un archivo con la descripciÃ³n.</small>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        List<Prioridad> listaPrioridades = (List<Prioridad>) session.getAttribute("listaPrioridades");
                    
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleSelect1\">Prioridad</label>\n");
      out.write("                        <select class=\"form-control\" id=\"exampleSelect1\" name=\"prioridad\">\n");
      out.write("                            <option value=\"vacio\"></option>\n");
      out.write("                            ");
for (int i = 0; i < listaPrioridades.size(); i++) {
                                    Prioridad p = listaPrioridades.get(i);
                                    String nombre = p.getNombre();
                            
      out.write("\n");
      out.write("                            <option value=");
      out.print(nombre);
      out.write('>');
      out.print(nombre);
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                        ");

                        
                       
                        
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        <div class=\"form-group row\">\n");
      out.write("        <label for=\"example-date-input\" class=\"col-2 col-form-label\">Fecha</label>\n");
      out.write("        <div class=\"col-10\">\n");
      out.write("          <input class=\"form-control\" type=\"date\" value=\"aaaa-mm-dd\" id=\"date-input\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("        <fieldset class=\"form-group\">\n");
      out.write("          <label for=\"selecciona\">Selecciona</label>\n");
      out.write("          <div class=\"form-check\">\n");
      out.write("            <label class=\"form-check-label\">\n");
      out.write("              <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"optionsRadios1\" value=\"option1\" checked>\n");
      out.write("              OpciÃ³n 1\n");
      out.write("            </label>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-check\">\n");
      out.write("          <label class=\"form-check-label\">\n");
      out.write("              <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"option2\">\n");
      out.write("              OpciÃ³n 2\n");
      out.write("            </label>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-check disabled\">\n");
      out.write("          <label class=\"form-check-label\">\n");
      out.write("              <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"optionsRadios3\" value=\"option3\" disabled>\n");
      out.write("              OpciÃ³n marcada, el usuario no puede seleccionarla\n");
      out.write("            </label>\n");
      out.write("          </div>\n");
      out.write("        </fieldset>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("        <div class=\"form-check\">\n");
      out.write("          <label class=\"form-check-label\">\n");
      out.write("            <input type=\"checkbox\" class=\"form-check-input\">\n");
      out.write("            Comprueba algo\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("        -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--botones formulario envÃ­o-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col form-group row col-6\">\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-secondary aÃ±adir\">Añadir</button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-2\">\n");
      out.write("                <a href=\"proyecto.html\"><button type=\"button\" class=\"btn btn-light\">Volver</button></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- jQuery CDN - Slim version (=without AJAX) -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Popper.JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Bootstrap JS -->\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/js.js\"></script>\n");
      out.write("\n");
      out.write("</form>\n");
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
