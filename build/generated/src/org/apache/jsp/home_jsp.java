package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>E-Fahana | Accueil</title>\n");
      out.write("        <!-- Bootstrap CSS CDN -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <!-- Our Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome JS -->\n");
      out.write("        <script defer src=\"js/solid.js\"></script>\n");
      out.write("        <script defer src=\"js/fontawesome.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- navbar -->\n");
      out.write("        <nav class=\"navbar navbar-dark navbar-static-top\" style=\"background: #039BE5; height: 52px; width: 100%; color: #fff; font-family: 'Georgia', sans-serif;\">\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-outline-primary\" style=\"margin-left: 220px; background-color: transparent; border: none;\">\n");
      out.write("                <i class=\"fas fa-align-left\"></i>\n");
      out.write("                <span><image src=\"Image/btnMenu.PNG\" width=\"25px\" height=\"25px\"></span>\n");
      out.write("            </button>\n");
      out.write("            <ul class=\"nav justify-content-end\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link active\" href=\"#\">Active</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("        <!-- sidebar -->\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <nav id=\"sidebar\" style=\"background: #263238\">\n");
      out.write("                <div class=\"sidebar-header\">\n");
      out.write("                    <h3><b class=\"display-6\">e</b>-Fahana</h3>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"list-unstyled components\">\n");
      out.write("                    <center>\n");
      out.write("                        <div class=\"input-group\" style=\"width: 210px; border: 1px solid #455A64; border-radius: 5px;\">\n");
      out.write("                            <input type=\"text\" name=\"q\" id=\"search\" class=\"form-control\" placeholder=\"Search...\" style=\"background: transparent; border: none; color: #fff\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-secondary\" style=\"background: transparent; position: relative; border: none\"><image src=\"Image/Search.png\" width=\"20px\" height=\"20px\"></button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>                        \n");
      out.write("                    </center>\n");
      out.write("                    <hr class=\"separator\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"#homeSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Home</a>\n");
      out.write("                        <ul class=\"collapse list-unstyled\" id=\"homeSubmenu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Home 1</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Home 2</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Home 3</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#documents\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Documents</a>\n");
      out.write("                        <ul class=\"collapse list-unstyled\" id=\"documents\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Clients</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Produits</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Fournisseurs</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Bilan</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#pageSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Pages</a>\n");
      out.write("                        <ul class=\"collapse list-unstyled\" id=\"pageSubmenu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Page 1</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Page 2</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Page 3</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Portfolio</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\" style=\"margin-left: 230px; margin-top: 50px;\">\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("              <div class=\"carousel-item active\">\n");
      out.write("                  <img class=\"d-block w-100\" src=\"Image/1.jpg\" alt=\"First slide\" style=\"height: 150px;\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"carousel-item\">\n");
      out.write("                <img class=\"d-block w-100\" src=\"Image/2.jpg\" alt=\"Second slide\" style=\"height: 150px;\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"carousel-item\">\n");
      out.write("                <img class=\"d-block w-100\" src=\"Image/3.jpg\" alt=\"Third slide\" style=\"height: 150px;\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("              <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("              <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("              <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("              <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"js/popper.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                btnMenu = $('#sidebarCollapse');\n");
      out.write("                $('#sidebarCollapse').on('click', function () {\n");
      out.write("                    $('#sidebar').toggleClass('active');\n");
      out.write("                    btnMenu.animate({marginRight: \"210px\"}, 0);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
