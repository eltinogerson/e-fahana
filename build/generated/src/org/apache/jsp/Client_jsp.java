package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Classe.Connexion;
import java.sql.ResultSet;
import Gestion.GestionClient;

public final class Client_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <meta charset=\"utf-8\">\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("      <title>e-Fahana | Clients</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/AdminLTE.min.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/_all-skins.min.css\">\n");
      out.write("      <link rel=\"icon\" href=\"Image/E-fahana.png\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"dataTable/css/dataTables.bootstrap4.css\">\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        function modifier(Num,Nom,Prenom,Adresse,Tel,ID){\n");
      out.write("            document.getElementById('idd').value=Num; \n");
      out.write("            document.getElementById('identifiant').value=ID;\n");
      out.write("            document.getElementById('om').value=Nom;  \n");
      out.write("            document.getElementById('pre').value=Prenom; \n");
      out.write("            document.getElementById('adr').value=Adresse;\n");
      out.write("            document.getElementById('tt').value=Tel;                       \n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\" style=\"overflow: hidden;\">\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("                <a href=\"../../index2.html\" class=\"logo\">\n");
      out.write("                    <span class=\"logo-mini\"><b style=\"font-size: 2.0em\"><i>e</i></b><em>Fn</em></span>\n");
      out.write("                  <span class=\"logo-lg\"><b style=\"font-size: 2.5em\"><i>e</i></b>-Fahana</span>\n");
      out.write("                </a>\n");
      out.write("                <nav class=\"navbar navbar-static-top\" style=\"height: 50px;\">\n");
      out.write("                    <a href=\"#\" data-toggle=\"push-menu\">\n");
      out.write("                      <button type=\"button\" class=\"btn btn-outline-primary\" style=\"background-color: transparent; border: none;\">\n");
      out.write("                          <image src=\"./Image/btnMenu.PNG\" width=\"25px\" height=\"25px\">\n");
      out.write("                      </button>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                      <ul class=\"nav navbar-nav\">    \n");
      out.write("\n");
      out.write("                        <!-- Profil de l'utilisateur -->\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <img src=\"Image/p.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                            <span class=\"hidden-xs\">MANDATIANA Gerson Elvestino</span>\n");
      out.write("                          </a>\n");
      out.write("                          <ul class=\"dropdown-menu\">\n");
      out.write("                            <li class=\"user-header\">\n");
      out.write("                              <img src=\"../../dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                              <p>\n");
      out.write("                                Alexander Pierce - Web Developer\n");
      out.write("                                <small>Member since Nov. 2012</small>\n");
      out.write("                              </p>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- Menu Body -->\n");
      out.write("                            <li class=\"user-body\">\n");
      out.write("                              <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-4 text-center\">\n");
      out.write("                                  <a href=\"#\">Followers</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-4 text-center\">\n");
      out.write("                                  <a href=\"#\">Sales</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-4 text-center\">\n");
      out.write("                                  <a href=\"#\">Friends</a>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <!-- /.row -->\n");
      out.write("                            </li>\n");
      out.write("                            <!-- Menu Footer-->\n");
      out.write("                            <li class=\"user-footer\">\n");
      out.write("                              <div class=\"pull-left\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"pull-right\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                              </div>\n");
      out.write("                            </li>\n");
      out.write("                          </ul>\n");
      out.write("                        </li>\n");
      out.write("                      </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("          <!-- =============================================== -->\n");
      out.write("\n");
      out.write("    <!-- Left side column. contains the sidebar -->\n");
      out.write("    <aside class=\"main-sidebar toggled\" style=\"margin-top: 20px;\">\n");
      out.write("        <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("          <div class=\"input-group\">\n");
      out.write("              <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\" style=\"border: none;\">\n");
      out.write("                <span class=\"input-group-btn\">\n");
      out.write("                    <button type=\"submit\" id=\"search-btn\" class=\"btn btn-primary\">\n");
      out.write("                        <img src=\"Image/rech.png\" width=\"20px\" height=\"20px\">\n");
      out.write("                    </button>\n");
      out.write("                </span>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("        <hr class=\"separator\"/>\n");
      out.write("        <!-- /.search form -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- sidebar menu -->\n");
      out.write("        <ul class=\"sidebar-menu\" data-widget=\"tree\">\n");
      out.write("            <li class=\"header\"><small style=\"color: #37474F; margin-left: 4px;\">Menu de Navigation</small></li>\n");
      out.write("            <hr class=\"separator\">\n");
      out.write("            <li>\n");
      out.write("                <a href=\"Menu\">\n");
      out.write("                    <i><img src=\"Image/Dashboard.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Tableau de bord</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"Commande\">\n");
      out.write("                    <i><img src=\"Image/order.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Commande</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        <li class=\"treeview\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("              <i><img src=\"Image/produits.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i>\n");
      out.write("              <span>Produits</span>\n");
      out.write("              <span class=\"pull-right-container\">\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("              </span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"treeview-menu\">\n");
      out.write("              <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"10px\" height=\"10px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Nos produits</a></li>\n");
      out.write("              <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"10px\" height=\"10px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Stocks</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <i><img src=\"Image/chart.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Bilan</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"treeview active\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("              <i><img src=\"Image/data.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Documents</span>\n");
      out.write("              <span class=\"pull-right-container\">\n");
      out.write("                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("              </span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"treeview-menu\">\n");
      out.write("                <li class=\"active\"><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Clients</a></li>\n");
      out.write("                <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Fournisseurs</a></li>\n");
      out.write("                <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Livraisons</a></li>\n");
      out.write("                <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8x\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Vendeurs</a></li>\n");
      out.write("                <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Membres</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"#\">\n");
      out.write("              <i><img src=\"Image/caisse.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Caisse</span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("        <hr class=\"separator\"/>\n");
      out.write("        </ul>\n");
      out.write("    </aside>\n");
      out.write("\n");
      out.write("    <!-- =============================================== -->\n");
      out.write("\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <div style=\"width: 100%; height: 350px; background: #357ca5;\" id=\"titre\">\n");
      out.write("                <img src='Image/Dash.png'>\n");
      out.write("            </div> \n");
      out.write("            <hr class=\"separator1\">\n");
      out.write("            <h3 style=\"text-align: center;\" class=\"display-4\">Nos Clients</h3>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <table id=\"mytable\" class=\"table table-bordered table-striped table-hover\">\n");
      out.write("                    <thead style=\"background-color: #3c8dbc; color: white;\">\n");
      out.write("\t                  <tr>\n");
      out.write("                            <th>Numero</th>\n");
      out.write("\t                    <th>Nom</th>\n");
      out.write("\t                    <th>Prenoms</th>\n");
      out.write("                            <th>Adresse</th>\n");
      out.write("                            <th>Telephone</th>              \n");
      out.write("                            <th>Options</th>\n");
      out.write("\t                  </tr>\n");
      out.write("\t            </thead>\n");
      out.write("  \n");
      out.write("                    ");
   
                       try{
                           Connexion cnx = new Connexion();
                           GestionClient gcli = new GestionClient();
                           ResultSet rs;
                           rs = gcli.affichage(cnx); 
                           while (rs.next()){ 
      out.write("\n");
      out.write("                           <tr>\n");
      out.write("                               <td>");
      out.print(rs.getInt("NumClient"));
      out.write("</td>\n");
      out.write("                               <td>");
      out.print(rs.getString("NomClient"));
      out.write("</td> \n");
      out.write("                               <td>");
      out.print(rs.getString("PrenomClient"));
      out.write("</td>\n");
      out.write("                               <td>");
      out.print(rs.getString("AdresseClient"));
      out.write("</td> \n");
      out.write("                               <td>");
      out.print(rs.getString("TelClient"));
      out.write("</td> \n");
      out.write("                               <td>\n");
      out.write("                                   <a onclick=\"modifier('");
      out.print(rs.getInt("NumClient"));
      out.write("','");
      out.print(rs.getString("NomClient"));
      out.write("','");
      out.print(rs.getString("PrenomClient"));
      out.write("','");
      out.print(rs.getString("AdresseClient"));
      out.write("','");
      out.print(rs.getString("TelClient"));
      out.write("', '");
      out.print(rs.getInt("NumClient"));
      out.write("')\" class=\"btn btn-outline-warning btn-sm\" data-toggle=\"modal\" data-target=\"#myModal\">Modifier</a>\n");
      out.write("                                   <a class=\"btn btn-outline-danger btn-sm\" href=\"Client?action=suppr&Numero=");
      out.print(rs.getInt("NumClient"));
      out.write("\">supprimer</a>\n");
      out.write("                               </td>\n");
      out.write("                           </tr>\n");
      out.write("                    ");
}
                        }
                         catch(Exception ex){
                              out.println(ex.toString());
                        }
                  
      out.write("               \n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                <div class=\"modal fade\" id=\"Ajout\" tabindex=\"-1\" role=\"dialog\"  aria-hidden=\"true\" style=\"display: none;\">\n");
      out.write("                    <div class=\"modal-dialog modal-sm\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h4 class=\"modal-title\" >NOUVEAU CLIENT</h4>\n");
      out.write("                                 <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                            </div>\n");
      out.write("                            <form methode=\"get\" action=\"Client\">\n");
      out.write("                                <div class=\"modal-body\">\n");
      out.write("                                    <p>Numero :\n");
      out.write("                                    <input type=\"text\" name=\"Numero\" class=\"form-control\"></p>\n");
      out.write("                                    <p>Nom :\n");
      out.write("                                    <input type=\"text\" name=\"Nom\" class=\"form-control\"></p>\n");
      out.write("                                    <p>Prenoms :\n");
      out.write("                                    <input type=\"text\" name=\"Prenom\" class=\"form-control\"></p>\n");
      out.write("                                    <p>Adresse :\n");
      out.write("                                    <input type=\"text\" name=\"Adresse\" class=\"form-control\"></p>\n");
      out.write("                                    <p>Téléphone :\n");
      out.write("                                    <input type=\"text\" name=\"Tel\" class=\"form-control\"></p>   \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button  class=\"btn btn-primary\" style=\"width: 100%\" type=\"submit\" name=\"action\" value=\"save\" >Ajouter</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" style=\"display: none;\">\n");
      out.write("                    <div class=\"modal-dialog modal-sm\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <h4 class=\"modal-title\" id=\"myModalLabel\">MODIFICATION</h4>\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("                            </div>\n");
      out.write("                            <form methode=\"get\" action=\"Client\">\n");
      out.write("                                <div class=\"modal-body\">\n");
      out.write("                                    <p>ID :\n");
      out.write("                                    <input type=\"text\" name=\"Numero\" id=\"idd\" class=\"form-control\"></p>\n");
      out.write("                                    \n");
      out.write("                                    <p>Nom :\n");
      out.write("                                    <input type=\"text\" name=\"Nom\" id=\"om\" class=\"form-control\"></p>\n");
      out.write("\n");
      out.write("                                    <p>Prenom :\n");
      out.write("                                    <input type=\"text\" name=\"Prenom\" id=\"pre\" class=\"form-control\"></p>\n");
      out.write("\n");
      out.write("                                     <p>Adresse :\n");
      out.write("                                    <input type=\"text\" name=\"Adresse\" id=\"adr\" class=\"form-control\"></p>\n");
      out.write("\n");
      out.write("                                    <p>Tel :\n");
      out.write("                                    <input type=\"text\" name=\"Tel\" id=\"tt\" class=\"form-control\"></p>\n");
      out.write("                                    \n");
      out.write("                                    <p style=\"display: none;\">ID :\n");
      out.write("                                    <input type=\"text\" name=\"id\" id=\"identifiant\" class=\"form-control\"></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default btn-sm\" data-dismiss=\"modal\">Annuler</button>\n");
      out.write("                                    <button class=\"btn btn-primary btn-sm\"  type=\"submit\" name=\"action\" value=\"up\" >Sauvegarder</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#Ajout\" style=\"position: relative; border-radius: 50%; float: right; top: -100px\">+</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ./wrapper -->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <script src=\"js/fastclick.js\"></script>\n");
      out.write("        <script src=\"js/adminlte.min.js\"></script>\n");
      out.write("        <script src=\"js/demo.js\"></script>\n");
      out.write("        <script src=\"dataTable/js/jquery.dataTables.js\"></script>\n");
      out.write("        <script src=\"dataTable/js/dataTables.bootstrap4.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('#mytable').dataTable({\n");
      out.write("                    \"language\": {\"url\": \"dataTable/dataTables.french.lang\"}\n");
      out.write("                }); \n");
      out.write("            });\n");
      out.write("        </script>\n");
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
