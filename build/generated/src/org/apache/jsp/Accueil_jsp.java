package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Accueil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>E-Fahana | Accueil</title>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div class=\"d-flex\" id=\"wrapper\">\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <div class=\"bg-light border-right\" id=\"sidebar-wrapper\">\n");
      out.write("      <div class=\"sidebar-heading\">E-Fahana</div>\n");
      out.write("      <div class=\"list-group list-group-flush\">\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Dashboard</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Shortcuts</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Overview</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Events</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Profile</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Status</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <div id=\"page-content-wrapper\">\n");
      out.write("\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-light bg-light border-bottom\">\n");
      out.write("        <button class=\"btn btn-primary\" id=\"menu-toggle\">Toggle Menu</button>\n");
      out.write("\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto mt-2 mt-lg-0\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Dropdown\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <h1 class=\"mt-4\">Simple Sidebar</h1>\n");
      out.write("        <p>The starting state of the menu will appear collapsed on smaller screens, and will appear non-collapsed on larger screens. When toggled using the button below, the menu will change.</p>\n");
      out.write("        <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>. The top navbar is optional, and just for demonstration. Just create an element with the <code>#menu-toggle</code> ID which will toggle the menu when clicked.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /#page-content-wrapper -->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Menu Toggle Script -->\n");
      out.write("  <script>\n");
      out.write("    $(\"#menu-toggle\").click(function(e) {\n");
      out.write("      e.preventDefault();\n");
      out.write("      $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
