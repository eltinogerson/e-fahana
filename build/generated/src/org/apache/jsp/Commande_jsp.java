package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Commande_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jstl.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>e-Fahana | Commande</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/AdminLTE.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/_all-skins.min.css\">\n");
      out.write("        <link rel=\"icon\" href=\"Image/E-fahana.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/lobibox.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dataTable/css/dataTables.bootstrap4.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/loading.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    </head>\n");
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
      out.write("                      <ul class=\"nav navbar-nav\">   \n");
      out.write("                        <!-- Profil de l'utilisateur -->\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <img src=\"Image/p.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                            <span class=\"hidden-xs\">");
      out.print( request.getAttribute("nom")+" "+request.getAttribute("prenoms"));
      out.write("</span>\n");
      out.write("                          </a>\n");
      out.write("                          <ul class=\"dropdown-menu\" style=\"border: none; border-top: none;\">\n");
      out.write("                            <li class=\"user-header\" style=\"height: 110px;\">\n");
      out.write("                                <img src=\"Image/p.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                                <p>\n");
      out.write("                                  ");
      out.print( request.getAttribute("nom")+" "+request.getAttribute("prenoms") );
      out.write("\n");
      out.write("                                  <small>");
      out.print( request.getAttribute("tel") );
      out.write("</small>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"user-footer\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-sm\">Profile</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <a href=\"#\" style=\"margin-left: 50px;\" id=\"btnDeconnexion\" class=\"btn btn-primary btn-sm\">Deconnexion</a>\n");
      out.write("                                    </div> \n");
      out.write("                                </div> \n");
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
      out.write("            <li class=\"active\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i><img src=\"Image/order.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Commande</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i><img src=\"Image/produits.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i>\n");
      out.write("                  <span>Produits</span>\n");
      out.write("                  <span class=\"pull-right-container\">\n");
      out.write("                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"10px\" height=\"10px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Nos produits</a></li>\n");
      out.write("                  <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"10px\" height=\"10px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Stocks</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i><img src=\"Image/chart.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Bilan</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i><img src=\"Image/data.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Documents</span>\n");
      out.write("                  <span class=\"pull-right-container\">\n");
      out.write("                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                  </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                  <li><a href=\"Client\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Clients</a></li>\n");
      out.write("                  <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Fournisseurs</a></li>\n");
      out.write("                  <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Livraisons</a></li>\n");
      out.write("                  <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8x\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Vendeurs</a></li>\n");
      out.write("                  <li><a href=\"#\"><i><img src=\"Image/point.png\" width=\"8px\" height=\"8px\" style=\"margin-bottom: 3px;\" class=\"mr-2\"></i>Membres</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i><img src=\"Image/caisse.png\" width=\"20px\" height=\"20px\" style=\"margin-bottom: 5px;\" class=\"mr-2\"></i><span>Caisse</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <hr class=\"separator\"/>   \n");
      out.write("        </ul>\n");
      out.write("    </aside>\n");
      out.write("\n");
      out.write("    <!-- =============================================== -->\n");
      out.write("\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <div style=\"width: 100%; height: 350px; background: #357ca5;\" id=\"titre\">\n");
      out.write("                <img src='Image/Ban_Commande.png'>\n");
      out.write("            </div> \n");
      out.write("            <hr class=\"separator2\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                        \n");
      out.write("                <!-- Modal ajout commande -->\n");
      out.write("                <div class=\"modal fade\" id=\"exampleModalCenter\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                      <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h7><b class=\"modal-title\" id=\"exampleModalCenterTitle\">NOUVEAU COMMANDE</b></h7>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body ajout\" style=\"height: 350px;\">\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <div class=\"box box-widget widget-user-2 slide1\">\n");
      out.write("                                <div class=\"widget-user-header ajoutHeader\" style=\"border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);\">\n");
      out.write("                                  <h3 style=\"color: white\">C L I E N T</h3>\n");
      out.write("                                  <img style=\"float: right; top: -50px; position: relative;\" src=\"Image/client.png\" width=\"80\" height=\"80\">\n");
      out.write("                                  <h5 style=\"color: white; font-size: 0.8em\">Les informations concernant le client</h5>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box-footer\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label><b>Nom :</b></label><em style=\"color: red;\">*</em>\n");
      out.write("                                        <input class=\"form-control form-control-sm nom\" type=\"text\" placeholder=\"Nom du client\">\n");
      out.write("                                        <small>Veuillez saisir le nom du client en <b>Majuscule</b></small>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label><b>Prénoms :</b></label><em style=\"color: red;\">*</em>\n");
      out.write("                                        <input class=\"form-control form-control-sm prenom\" type=\"text\" placeholder=\"Prénoms du client\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col\">\n");
      out.write("                                            <label><b>Adresse :</b></label><em style=\"color: red;\">*</em>\n");
      out.write("                                            <input class=\"form-control form-control-sm adresse\" type=\"text\" placeholder=\"Adresse du client\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col\">\n");
      out.write("                                            <label><b>Téléphone :</b></label><em style=\"color: red;\">*</em>\n");
      out.write("                                            <input class=\"form-control form-control-sm tel\" type=\"text\" placeholder=\"+261 3(2/3/4)\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <div class=\"box box-widget widget-user-2 slide2\" style=\"display: none;\">\n");
      out.write("                                <div class=\"widget-user-header ajoutHeader\" style=\"border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);\">\n");
      out.write("                                    <h6 style=\"color: white\"><b>Appartenant au client :</b></h6>\n");
      out.write("                                    <img style=\"float: right; top: -20px; position: relative;\" src=\"Image/client.png\" width=\"100\" height=\"100\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Numero : <b style=\"color: white; font-size: 1em;\" class=\"numCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Nom : <b style=\"color: white; font-size: 1em;\" class=\"nomCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Prénoms : <b style=\"color: white; font-size: 1em;\" class=\"prenomCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Adresse : <b style=\"color: white; font-size: 1em;\" class=\"adresseCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Téléphone : <b style=\"color: white; font-size: 1em;\" class=\"telCom\"></b></h5></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box-footer\">\n");
      out.write("                                    <div class=\"form-group chooseProd\">\n");
      out.write("                                        <center>\n");
      out.write("                                            <h3><b>Credit :</b></h3>\n");
      out.write("                                            <label><em style=\"color: red;\">*</em><small>Veuillez <b>cochez</b> le credit que ce client souhaite commandé</small></label>\n");
      out.write("                                        </center>\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <label class=\"form-check-label\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"form-check-input\" value=\"tab1\" id=\"airtel\">Aitel\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-check disabled\">\n");
      out.write("                                            <label class=\"form-check-label\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"form-check-input\" value=\"tab2\" id=\"orange\">Orange\n");
      out.write("                                            </label>\n");
      out.write("                                        </div> \n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <label class=\"form-check-label\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"form-check-input\" value=\"tab3\" id=\"telma\">Telma\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <div class=\"box box-widget widget-user-2 slide3\" style=\"display: none\">\n");
      out.write("                                <div class=\"widget-user-header ajoutHeader\" style=\"border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);\">\n");
      out.write("                                    <h6 style=\"color: white\"><b>Appartenant au client :</b></h6>\n");
      out.write("                                    <img style=\"float: right; top: -20px; position: relative;\" src=\"Image/client.png\" width=\"100\" height=\"100\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Numero : <b style=\"color: white; font-size: 1em;\" class=\"numCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Nom : <b style=\"color: white; font-size: 1em;\" class=\"nomCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Prénoms : <b style=\"color: white; font-size: 1em;\" class=\"prenomCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Adresse : <b style=\"color: white; font-size: 1em;\" class=\"adresseCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Téléphone : <b style=\"color: white; font-size: 1em;\" class=\"telCom\"></b></h5></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box-footer\">\n");
      out.write("                                    <div class=\"form-group ajoutQuantite\">\n");
      out.write("                                        <hr class=\"separator1\">\n");
      out.write("                                        <div style=\"overflow-y: scroll; height: 170px;\">\n");
      out.write("                                            <div class=\"tab1\" style=\"display: none;\">\n");
      out.write("                                                <center><h5>Credit Airtel</h5></center>\n");
      out.write("                                                <table class=\"table table-bordered\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th>Code</th>\n");
      out.write("                                                            <th>Prix</th>\n");
      out.write("                                                            <th>En stock</th>\n");
      out.write("                                                            <th>Quantité</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"tab2\" style=\"display: none;\">\n");
      out.write("                                                <center><h5>Credit Orange</h5></center>\n");
      out.write("                                                <table class=\"table table-bordered\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th>Code</th>\n");
      out.write("                                                            <th>Prix</th>\n");
      out.write("                                                            <th>En stock</th>\n");
      out.write("                                                            <th>Quantité</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"tab3\" style=\"display: none;\">\n");
      out.write("                                                <center><h5>Credit Telma</h5></center>\n");
      out.write("                                                <table class=\"table table-bordered\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th>Code</th>\n");
      out.write("                                                            <th>Prix</th>\n");
      out.write("                                                            <th>En stock</th>\n");
      out.write("                                                            <th>Quantité</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>  \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- QUATRIEME SLIDE -->\n");
      out.write("                            <div class=\"box box-widget widget-user-2 slide4\" style=\"display: none;\">\n");
      out.write("                                <div class=\"widget-user-header ajoutHeader\" style=\"border: 1px solid rgb(250, 250, 250); background: rgb(136, 14, 79) none repeat scroll 0% 0%; color: rgb(250, 250, 250);\">\n");
      out.write("                                    <h6 style=\"color: white\"><b>Appartenant au client :</b></h6>\n");
      out.write("                                    <img style=\"float: right; top: -20px; position: relative;\" src=\"Image/client.png\" width=\"100\" height=\"100\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Numero : <b style=\"color: white; font-size: 1em;\" class=\"numCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Nom : <b style=\"color: white; font-size: 1em;\" class=\"nomCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Prénoms : <b style=\"color: white; font-size: 1em;\" class=\"prenomCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Adresse : <b style=\"color: white; font-size: 1em;\" class=\"adresseCom\"></b></h5></li>\n");
      out.write("                                        <li><h5 style=\"color: white; font-size: 0.8em\">Téléphone : <b style=\"color: white; font-size: 1em;\" class=\"telCom\"></b></h5></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box-footer\">\n");
      out.write("                                    <div class=\"form-group chooseProd\">\n");
      out.write("                                        <center>\n");
      out.write("                                            <h3><b>Credit :</b></h3>\n");
      out.write("                                            <label><em style=\"color: red;\">*</em><small>Veuillez <b>cochez</b> le credit que ce client souhaite commandé</small></label>\n");
      out.write("                                        </center>\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <label class=\"form-check-label\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"form-check-input\" value=\"tab1\" id=\"airtel\">Aitel\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-check disabled\">\n");
      out.write("                                            <label class=\"form-check-label\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"form-check-input\" value=\"tab2\" id=\"orange\">Orange\n");
      out.write("                                            </label>\n");
      out.write("                                        </div> \n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <label class=\"form-check-label\">\n");
      out.write("                                                <input type=\"checkbox\" class=\"form-check-input\" value=\"tab3\" id=\"telma\">Telma\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- loading page -->\n");
      out.write("                            <div id=\"panelLoading\" style=\"overflow-x: hidden;overflow-y: auto;background: rgba(0, 0, 0, 0.8);position:absolute;top: 0;right: 0;bottom: 0;left: 0;z-index: 1050;overflow: hidden;outline: 0;color: white; display: none;\">\n");
      out.write("                                <div style=\"position: absolute; width: 80px; right: 100px;\" class=\"loading\">\n");
      out.write("                                <div class=\"obj1\"></div>\n");
      out.write("                                <div class=\"obj2\"></div>\n");
      out.write("                                <div class=\"obj3\"></div>\n");
      out.write("                                <div class=\"obj4\"></div>\n");
      out.write("                                <div class=\"obj5\"></div>\n");
      out.write("                                <div class=\"obj6\"></div>\n");
      out.write("                                <div class=\"obj7\"></div>\n");
      out.write("                                <div class=\"obj8\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"alert mesFalse1 text-center ajoutHeader\" role=\"alert\" style=\"background-color: #F44336; width: 60%; display: none;\">\n");
      out.write("                                <small style=\"color: white;\"><b>Veuillez completez tous les champs!</b></small>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"alert mesFalse2 text-center ajoutHeader\" role=\"alert\" style=\"background-color: #F44336; width: 60%; display: none;\">\n");
      out.write("                                <small style=\"color: white;\"><b>Vous devez cocher au moins un credit!</b></small>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"alert mesFalse3 text-center ajoutHeader\" role=\"alert\" style=\"background-color: #F44336; width: 60%; display: none;\">\n");
      out.write("                                <small style=\"color: white;\"><b>Entrer au moins un quantité!</b></small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary btn-sm\" data-dismiss=\"modal\">Annuler</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary btn-sm btnSuivant\">Suivant</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- fin Modal ajout commande -->\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <div class=\"box box-widget widget-user-2\">\n");
      out.write("                                        <div class=\"widget-user-header bg-info\">\n");
      out.write("                                          <h3 style=\"color: white\">Vos Commandes</h3>\n");
      out.write("                                          <h5 style=\"color: white; font-size: 0.8em\">Les commandes que vous avez enregistrés</h5>\n");
      out.write("                                          <button type=\"button\" class=\"btn btn-success btn-sm modalAjout float-right\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\" style=\"margin-top: -50px; height: 35px;\"><b>+ Nouveau</b></button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"box-footer\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-6\" style=\"border-right: 3px solid #17a2b8;\">\n");
      out.write("                                                    <h4 class=\"text-center\"><b>T O T A L</b></h4>\n");
      out.write("                                                    <table class=\"table table-bordered table-hover\" style=\"text-align: center;\">\n");
      out.write("                                                        <style>\n");
      out.write("\n");
      out.write("                                                        </style>\n");
      out.write("                                                        <thead style=\"background-color: #17a2b8; color: white;\">\n");
      out.write("                                                            <th>Aujourd'hui</th>\n");
      out.write("                                                            <th>Tous</th>\n");
      out.write("                                                        </thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td><h3 class=\"badge bg-blue\" style=\"font-size: 1.5em;\"><b>");
      out.print( request.getAttribute("totalCommandeVendeurToday") );
      out.write(" / ");
      out.print( request.getAttribute("totalCommandeToday") );
      out.write("</b></h3></td>\n");
      out.write("                                                            <td><h3 class=\"badge bg-blue\" style=\"font-size: 1.5em;\"><b>");
      out.print( request.getAttribute("totalCommandeVendeur") );
      out.write(" / ");
      out.print( request.getAttribute("totalCommande") );
      out.write("</b></h3></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>  \n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <h4 class=\"text-center\"><b>M O N T A N T</b></h4>\n");
      out.write("                                                    <table class=\"table table-bordered table-hover\" style=\"text-align: center;\">\n");
      out.write("                                                        <style>\n");
      out.write("\n");
      out.write("                                                        </style>\n");
      out.write("                                                        <thead style=\"background-color: #17a2b8; color: white;\">\n");
      out.write("                                                            <th>Aujourd'hui</th>\n");
      out.write("                                                            <th>Tous</th>\n");
      out.write("                                                        </thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td><h3><b>");
      out.print( request.getAttribute("totalMontantVendeurToday") );
      out.write("</b><em style=\"color: red;\"> Ar</em></h3></td>\n");
      out.write("                                                            <td><h3><b>");
      out.print( request.getAttribute("totalMontantVendeur") );
      out.write("</b><em style=\"color: red;\"> Ar</em></h3></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>  \n");
      out.write("                                                    <div class=\"float-right\"><small><b><u>NB</u>: </b></small><small style=\"color: red;\">à payer</em></small></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\"border-top: 3px solid #17a2b8; margin-top: 5px;\">\n");
      out.write("                                                <div>\n");
      out.write("                                                    <h4 class=\"text-center\" style=\"margin-top: 5px;\"><b>P R O D U I T S</b></h4>\n");
      out.write("                                                    <center><small class=\"text-center\">Pourcentage des produits les plus commandés<em style=\"color: red;\">*</em></small></center>\n");
      out.write("                                                    <small class=\"float-right\"><b>Airtel</b></small>\n");
      out.write("                                                    <div class=\"progress\" style=\"margin-top: 18px; height: 20px;\">\n");
      out.write("                                                        <div class=\"progress-bar progress-bar-striped bg-danger progress-bar-animated\" style=\"width:");
      out.print( request.getAttribute("pourcentageAirtel") );
      out.write("%;\"><b> ");
      out.print( request.getAttribute("pourcentageAirtel") );
      out.write("% </b></div>\n");
      out.write("                                                    </div> \n");
      out.write("                                                    <small class=\"float-right\"><b>Orange</b></small>\n");
      out.write("                                                    <div class=\"progress\" style=\"margin-top: 18px; height: 20px;\">\n");
      out.write("                                                        <div class=\"progress-bar progress-bar-striped bg-warning progress-bar-animated\" style=\"width:");
      out.print( request.getAttribute("pourcentageOrange") );
      out.write("%\"><b> ");
      out.print( request.getAttribute("pourcentageOrange") );
      out.write("% </b></div>\n");
      out.write("                                                    </div> \n");
      out.write("                                                    <small class=\"float-right\"><b>Telma</b></small>\n");
      out.write("                                                    <div class=\"progress\" style=\"margin-top: 18px; height: 20px;\">\n");
      out.write("                                                        <div class=\"progress-bar progress-bar-striped bg-success progress-bar-animated\" style=\"width:");
      out.print( request.getAttribute("pourcentageTelma") );
      out.write("%\"><b> ");
      out.print( request.getAttribute("pourcentageTelma") );
      out.write("% </b></div>\n");
      out.write("                                                    </div> \n");
      out.write("                                                    <!--\n");
      out.write("                                                    <table class=\"table table-bordered table-hover\" style=\"text-align: center;\">\n");
      out.write("                                                        <style>\n");
      out.write("\n");
      out.write("                                                        </style>\n");
      out.write("                                                        <thead style=\"background-color: #17a2b8; color: white;\">\n");
      out.write("                                                            <th>Airtel</th>\n");
      out.write("                                                            <th>Orange</th>\n");
      out.write("                                                            <th>Telma</th>\n");
      out.write("                                                        </thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td><h3 class=\"badge bg-red\" style=\"font-size: 1.5em;\"><b>");
      out.print( request.getAttribute("pourcentageAirtel") );
      out.write("%</b></h3></td>\n");
      out.write("                                                            <td><h3 class=\"badge bg-orange\" style=\"font-size: 1.5em;\"><b>");
      out.print( request.getAttribute("pourcentageOrange") );
      out.write("%</b></h3></td>\n");
      out.write("                                                            <td><h3 class=\"badge bg-green\" style=\"font-size: 1.5em;\"><b>");
      out.print( request.getAttribute("pourcentageTelma") );
      out.write("%</b></h3></td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>  \n");
      out.write("                                                        -->\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <div class=\"box box-widget widget-user-2\">\n");
      out.write("                                        <div class=\"widget-user-header bg-info\">\n");
      out.write("                                          <h3 style=\"color: white\">Stock</h3>\n");
      out.write("                                          <h5 style=\"color: white; font-size: 0.8em\">Les produits disponibles en stock</h5>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"box-footer\">\n");
      out.write("                                            <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                                <ul class=\"carousel-indicators\">\n");
      out.write("                                                    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\" style=\"border: 3px solid red; background-color: red;\"></li>\n");
      out.write("                                                    <li data-target=\"#demo\" data-slide-to=\"1\" style=\"border: 3px solid orange; background-color: orange;\"></li>\n");
      out.write("                                                    <li data-target=\"#demo\" data-slide-to=\"2\" style=\"border: 3px solid green; background-color: green;\"></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                                <div class=\"carousel-inner\">\n");
      out.write("                                                    <div class=\"carousel-item active\" style=\"height: 331px;\">\n");
      out.write("                                                        <center>\n");
      out.write("                                                            <img src=\"Image/air.PNG\" width=\"150\" height=\"auto\" style=\"margin-top: 20px;\">\n");
      out.write("                                                        </center>\n");
      out.write("                                                        <table class=\"table table-\" style=\"font-size: 0.8em; text-align: center; margin-top: 30px;\">\n");
      out.write("                                                            <thead style=\"color: white;\" class=\"bg-red\">\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th scope=\"col\">Code</th>\n");
      out.write("                                                                    <th scope=\"col\">P.U</th>\n");
      out.write("                                                                    <th scope=\"col\">Quantité</th>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            </tbody>\n");
      out.write("                                                        </table>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"carousel-item\" style=\"height: 331px;\">\n");
      out.write("                                                        <center>\n");
      out.write("                                                            <img src=\"Image/or.PNG\" width=\"150\" height=\"auto\" style=\"margin-top: 20px;\">\n");
      out.write("                                                        </center>\n");
      out.write("                                                        <table class=\"table\" style=\"font-size: 0.8em; text-align: center; margin-top: 20px;\">\n");
      out.write("                                                            <thead style=\"color: white;\" class=\"bg-orange\">\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th scope=\"col\">Code</th>\n");
      out.write("                                                                    <th scope=\"col\">P.U</th>\n");
      out.write("                                                                    <th scope=\"col\">Quantité</th>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            </tbody>\n");
      out.write("                                                        </table>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"carousel-item\" style=\"height: 331px;\">\n");
      out.write("                                                        <center>\n");
      out.write("                                                            <img src=\"Image/tel.png\" width=\"150\" height=\"auto\" style=\"margin-top: 20px;\">\n");
      out.write("                                                        </center>\n");
      out.write("                                                        <table class=\"table\" style=\"font-size: 0.8em; text-align: center; margin-top: 30px;\">\n");
      out.write("                                                            <thead style=\"color: white;\" class=\"bg-green\">\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th scope=\"col\">Code</th>\n");
      out.write("                                                                    <th scope=\"col\">P.U</th>\n");
      out.write("                                                                    <th scope=\"col\">Quantité</th>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            </tbody>\n");
      out.write("                                                        </table>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>   \n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"separator1\">\n");
      out.write("                        <h4 style=\"text-align: center;\">Listes des clients qui ont commandés</h4>\n");
      out.write("                        \n");
      out.write("                        <table class=\"table table-bordered table-borderless bg-light\" id=\"mytable\" style=\"width: 100%;\">\n");
      out.write("                            <thead style=\"background-color: #3c8dbc; color: white;\">\n");
      out.write("                                <th scope=\"col\">Numero</th>\n");
      out.write("                                <th scope=\"col\">Nom</th>\n");
      out.write("                                <th scope=\"col\">Prenom</th>\n");
      out.write("                                <th scope=\"col\">Adresse</th>\n");
      out.write("                                <th scope=\"col\">Telephone</th>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"box-footer\" style=\"margin-top: 10px;\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4 col-xs-6\">\n");
      out.write("                            <div class=\"description-block border-right\">\n");
      out.write("                                <h5 class=\"description-header\"><img src=\"Image/air.PNG\" width=\"130\"></h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4 col-xs-6\">\n");
      out.write("                            <div class=\"description-block border-right\">\n");
      out.write("                                <h5 class=\"description-header\"><img src=\"Image/tel.png\" width=\"130\"></h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4 col-xs-6\">\n");
      out.write("                          <div class=\"description-block\">\n");
      out.write("                            <h5 class=\"description-header\"><img src=\"Image/or.PNG\" width=\"130\"></h5>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  <!-- /.row -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <hr class=\"separator2\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ./wrapper -->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <script src=\"js/fastclick.js\"></script>\n");
      out.write("        <script src=\"js/adminlte.min.js\"></script>\n");
      out.write("        <script src=\"js/demo.js\"></script>\n");
      out.write("        <script src=\"js/lobibox.js\"></script>\n");
      out.write("        <script src=\"dataTable/js/jquery.dataTables.js\"></script>\n");
      out.write("        <script src=\"dataTable/js/dataTables.bootstrap4.js\"></script>\n");
      out.write("        <script src=\"js/sweetalert2.all.min.js\"></script>\n");
      out.write("        <script src=\"js/anime.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            var numClient;\n");
      out.write("            /* controle champ numero */\n");
      out.write("            $('.nom').on(\"keyup\", function () {\n");
      out.write("                var nb = $('.nom').length;\n");
      out.write("                if (nb >= 1) {\n");
      out.write("                    $(this).val(($(this).val()).toUpperCase());\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('.prenom').on(\"keyup\", function () {\n");
      out.write("                var nb = $('.prenom').length;\n");
      out.write("                if (nb == 1) {\n");
      out.write("                    $(this).val(($(this)).toUpperCase());\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('.tel').on(\"blur\", function () {\n");
      out.write("                var phone = $(this).val();\n");
      out.write("                if (isNaN(phone) == false) {\n");
      out.write("                    var isa = phone.length;\n");
      out.write("                    if (isa == 10) {\n");
      out.write("                        var cs = phone.substring(0,3);\n");
      out.write("                        if (cs==\"032\" || cs==\"033\" || cs==\"034\" || cs==\"039\") {\n");
      out.write("                            $(this).val(phone.substring(0,3) +\" \"+ phone.substring(3,5) +\" \"+ phone.substring(5,8) +\" \"+ phone.substring(8,10));\n");
      out.write("                        } else {\n");
      out.write("                            $(this).val(\"\");\n");
      out.write("                        }\n");
      out.write("                    } else {\n");
      out.write("                        $(this).val(\"\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('.tel').on(\"keyup\", function(){\n");
      out.write("                var id = $(this).val();\n");
      out.write("                if(isNaN(id) == true){\n");
      out.write("                    var val = id.substring(1,1);\n");
      out.write("                    $(this).val(val);\n");
      out.write("                } else{\n");
      out.write("                  if(id.length > 10){\n");
      out.write("                    var val = id.substring(0,10);\n");
      out.write("                    $(this).val(val);\n");
      out.write("                  }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write(" \n");
      out.write("            \n");
      out.write("            /*\n");
      out.write("            function controletelephone(ajout){\n");
      out.write("                var phon=document.ajout.tel.value;\n");
      out.write("                if(isNaN(phon)==false){\n");
      out.write("                    var isa=phon.length;\n");
      out.write("                    if(isa==10){\n");
      out.write("                        var cs=phon.substring(0,3);\n");
      out.write("                        if(cs==\"032\" || cs==\"033\" || cs==\"034\" || cs==\"039\"){\n");
      out.write("                            document.ajout.tel.value= phon.substring(0,3) +\" \"+ phon.substring(3,5) +\" \"+ phon.substring(5,8) +\" \"+ phon.substring(8,10);\n");
      out.write("                        }else{\n");
      out.write("                            alert(\"Operateur inconnu à M/car\");\n");
      out.write("                        }\n");
      out.write("                    }else{\n");
      out.write("                        alert(\"Numero invalide\");\n");
      out.write("                    }\n");
      out.write("                }else{\n");
      out.write("                    alert(\"Le numero doit être un chiffre\");\n");
      out.write("                }\n");
      out.write("            } */\n");
      out.write("            \n");
      out.write("            var qteProdCom = new Array();\n");
      out.write("            var idProdCom = new Array();\n");
      out.write("            var colors = new Array();\n");
      out.write("            colors[1] = \"#E91E63\";\n");
      out.write("            colors[2] = \"#880E4F\";\n");
      out.write("            colors[3] = \"#D32F2F\";\n");
      out.write("            colors[4] = \"#7B1FA2\";\n");
      out.write("            colors[5] = \"#6A1B9A\";\n");
      out.write("            colors[6] = \"#5E35B1\";\n");
      out.write("            colors[7] = \"#0D47A1\";\n");
      out.write("            colors[8] = \"#006064\";\n");
      out.write("            colors[9] = \"#2E7D32\";\n");
      out.write("            colors[10] = \"#455A64\";\n");
      out.write("            $('.modalAjout').click(function(){\n");
      out.write("                var random = Math.floor((Math.random()*10)+1);\n");
      out.write("                var randomColorBg = colors[random];\n");
      out.write("                $('.ajoutHeader').css(\"background\", randomColorBg);\n");
      out.write("            });\n");
      out.write("     \n");
      out.write("            btnDec = $('#btnDeconnexion');\n");
      out.write("            table1 = $('#mytable');\n");
      out.write("            spin = $('#panelLoading');\n");
      out.write("            btnDec.click(function() {\n");
      out.write("                Swal.fire({\n");
      out.write("                  title: 'Deconnexion',\n");
      out.write("                  text: \"Voulez vous vraiment se deconnectez?\",\n");
      out.write("                  type: 'warning',\n");
      out.write("                  showCancelButton: true,\n");
      out.write("                  confirmButtonColor: '#3085d6',\n");
      out.write("                  cancelButtonColor: '#d33',\n");
      out.write("                  cancelButtonText: 'Annuler',\n");
      out.write("                  confirmButtonText: 'Oui'\n");
      out.write("                }).then((result) => {\n");
      out.write("                  if (result.value) {\n");
      out.write("                    window.location.href = \"Deconnexion\";\n");
      out.write("                  }\n");
      out.write("                });             \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            state = false;\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('#mytable').dataTable({\n");
      out.write("                    \"language\": {\"url\": \"dataTable/dataTables.french.lang\"}\n");
      out.write("                }); \n");
      out.write("                AfficheComande();\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('[data-toggle=\"collapse\"]').click(function() {\n");
      out.write("                if (state == false) {\n");
      out.write("                    $('.box-body').toggle('slide', {direction: 'up'}, 900);\n");
      out.write("                    $('[data-toggle=\"collapse\"] img').attr(\"src\", \"Image/up.png\");\n");
      out.write("                    state = true;\n");
      out.write("                } else {\n");
      out.write("                    $('.box-body').toggle('slide', {direction: 'up'}, 900);\n");
      out.write("                    state = false;\n");
      out.write("                    $('[data-toggle=\"collapse\"] img').attr(\"src\", \"Image/down.png\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             // ajax\n");
      out.write("            function AfficheComande() {\n");
      out.write("                var operation = \"afficherCommande\";\n");
      out.write("                $('#mytable tbody').on('click', 'a', function() {\n");
      out.write("                    var numCli = $(this).text();\n");
      out.write("                    $.ajax({\n");
      out.write("                        async: false,\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        url: \"ListeCommande\",\n");
      out.write("                        dataType: 'html',\n");
      out.write("                        data: {numClient: numCli, operation: operation},\n");
      out.write("                        success: function (data) {\n");
      out.write("                            $('#'+numCli).html(data);\n");
      out.write("                        },\n");
      out.write("                        error: function (error) {\n");
      out.write("                            console.log(error.responseText);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            var clickAjoutCommande = 0;\n");
      out.write("            var nomCli = $('.nom');\n");
      out.write("            var prenomCli = $('.prenom');\n");
      out.write("            var adresseCli = $('.adresse');\n");
      out.write("            var telCli = $('.tel');\n");
      out.write("            var btnSuivant = $('.btnSuivant');\n");
      out.write("            btnSuivant.click(function() {\n");
      out.write("                switch(clickAjoutCommande) {\n");
      out.write("                    case 0 : {\n");
      out.write("                        if (nomCli.val() == \"\" || adresseCli.val() == \"\") {\n");
      out.write("                            $('.mesFalse1').show();\n");
      out.write("                            anime({\n");
      out.write("                                targets: '.mesFalse1',\n");
      out.write("                                scale: [0,1],\n");
      out.write("                                opacity: [0,1],\n");
      out.write("                                duration: 800\n");
      out.write("                            });\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                $('.mesFalse1').toggle('slide', {direction: 'down'}, 600);\n");
      out.write("                            }, 3000);\n");
      out.write("                        } else {\n");
      out.write("                            nom = nomCli.val();\n");
      out.write("                            prenom = prenomCli.val();\n");
      out.write("                            adresse = adresseCli.val();\n");
      out.write("                            tel = telCli.val();\n");
      out.write("                            var operation = \"verifierClient\";\n");
      out.write("                            $.ajax({\n");
      out.write("                                async: false,\n");
      out.write("                                type: \"POST\",\n");
      out.write("                                url: \"ListeCommande\",\n");
      out.write("                                dataType: 'json',\n");
      out.write("                                data: {operation: operation, nom: nom, prenom: prenom, adresse: adresse, tel: tel},\n");
      out.write("                                success: function (data) {\n");
      out.write("                                    $('.numCom').text(data.num);\n");
      out.write("                                    numClient = data.num;\n");
      out.write("                                    $('.nomCom').text(data.nom);\n");
      out.write("                                    $('.prenomCom').text(data.prenom);\n");
      out.write("                                    $('.adresseCom').text(data.adresse);\n");
      out.write("                                    $('.telCom').text(data.tel);\n");
      out.write("                                    var message = data.prenom+' fait déjà partie de notre client';\n");
      out.write("                                    spin.show();\n");
      out.write("                                    setTimeout(function () {\n");
      out.write("                                        spin.hide();\n");
      out.write("                                        if (data.etat == \"true\") {\n");
      out.write("                                            Lobibox.notify('info', {\n");
      out.write("                                                size: 'mini',\n");
      out.write("                                                msg: message\n");
      out.write("                                            });\n");
      out.write("                                        } else {\n");
      out.write("                                            Lobibox.notify('success', {\n");
      out.write("                                                size: 'mini',\n");
      out.write("                                                msg: 'Un nouveau client vient d\\'etre ajouté'\n");
      out.write("                                            });\n");
      out.write("                                        }\n");
      out.write("                                        $('.slide1').toggle('slide', {direction: 'left'}, 850);\n");
      out.write("                                        setTimeout(function () {\n");
      out.write("                                            $('.slide2').toggle('slide', {direction: 'right'}, 900);\n");
      out.write("                                            clickAjoutCommande++;\n");
      out.write("                                        }, 890); \n");
      out.write("                                    }, 2500);\n");
      out.write("                                },\n");
      out.write("                                error: function (error) {\n");
      out.write("                                    console.log(error.responseText);\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    } break;\n");
      out.write("                    \n");
      out.write("                    case 1: {\n");
      out.write("                        var i = 1;\n");
      out.write("                        var allChoose = new Array();\n");
      out.write("                        $('.chooseProd input:checked').each(function(){\n");
      out.write("                            allChoose[i] = $(this).val();\n");
      out.write("                            $('.'+allChoose[i]).show();\n");
      out.write("                            i++;\n");
      out.write("                        });\n");
      out.write("                        if (allChoose.length == 0) {\n");
      out.write("                            $('.mesFalse2').show();\n");
      out.write("                            anime({\n");
      out.write("                                targets: '.mesFalse2',\n");
      out.write("                                scale: [0,1],\n");
      out.write("                                opacity: [0,1],\n");
      out.write("                                duration: 800\n");
      out.write("                            });\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                $('.mesFalse2').toggle('slide', {direction: 'down'}, 600);\n");
      out.write("                            }, 3000);   \n");
      out.write("                        } else {\n");
      out.write("                            spin.show();\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                spin.hide();\n");
      out.write("                                $('.slide2').toggle('slide', {direction: 'left'}, 850);\n");
      out.write("                                $('.ajout').animate({height: '450px'}, 600);\n");
      out.write("                                setTimeout(function () {\n");
      out.write("                                    $('.slide3').toggle('slide', {direction: 'right'}, 900);\n");
      out.write("                                    clickAjoutCommande++;\n");
      out.write("                                }, 890); \n");
      out.write("                            }, 2500);\n");
      out.write("                        }\n");
      out.write("                    } break;\n");
      out.write("                    \n");
      out.write("                    case 2: {\n");
      out.write("                        var error = 0;\n");
      out.write("                        var champs = 0;\n");
      out.write("                        var champsVide = 0;\n");
      out.write("                        var success = 0;\n");
      out.write("                        var i = 0;\n");
      out.write("                        $('.ajoutQuantite input').each(function() {\n");
      out.write("                            champs++;\n");
      out.write("                            if ($(this).val() != 0 && $(this).val() != \"\") {\n");
      out.write("                                var id = $(this).attr('id');\n");
      out.write("                                var qte = $(this).val();\n");
      out.write("                                var operation = \"verifProduit\";\n");
      out.write("                                $.ajax({\n");
      out.write("                                    async: false,\n");
      out.write("                                    type: \"POST\",\n");
      out.write("                                    url: \"ListeCommande\",\n");
      out.write("                                    dataType: \"json\",\n");
      out.write("                                    data: {operation: operation, idProdCom: id, qteProdCom: qte},\n");
      out.write("                                    success: function (data) {\n");
      out.write("                                        if (data.Quantité_disponible == \"true\") {\n");
      out.write("                                            idProdCom[i] = id;\n");
      out.write("                                            qteProdCom[i] = qte;\n");
      out.write("                                            i++; \n");
      out.write("                                        } else {\n");
      out.write("                                            $('#'+id).css('border', '1px solid red');\n");
      out.write("                                            error++;\n");
      out.write("                                        }\n");
      out.write("                                    },\n");
      out.write("                                    error: function (error) {\n");
      out.write("                                        Console.log(error.responseText);\n");
      out.write("                                    }\n");
      out.write("                                    \n");
      out.write("                                });\n");
      out.write("                            } else {\n");
      out.write("                                champsVide++;\n");
      out.write("                            }\n");
      out.write("                        }); \n");
      out.write("                        if (champs == champsVide) {\n");
      out.write("                            $('.mesFalse3').show();\n");
      out.write("                            anime({\n");
      out.write("                                targets: '.mesFalse3',\n");
      out.write("                                scale: [0,1],\n");
      out.write("                                opacity: [0,1],\n");
      out.write("                                duration: 800\n");
      out.write("                            });\n");
      out.write("                            setTimeout(function () {\n");
      out.write("                                $('.mesFalse3').toggle('slide', {direction: 'down'}, 600);\n");
      out.write("                            }, 3000);\n");
      out.write("                        } else {\n");
      out.write("                            if (error == 0) {\n");
      out.write("                                var operation = \"ajouterNouveauCommande\";\n");
      out.write("                                for (i=0; i<idProdCom.length; i++) {\n");
      out.write("                                    $.ajax({\n");
      out.write("                                        async: false,\n");
      out.write("                                        type: \"POST\",\n");
      out.write("                                        url: \"ListeCommande\",\n");
      out.write("                                        dataType: \"json\",\n");
      out.write("                                        data: {operation: operation, idProdCom: idProdCom[i], qteProdCom: qteProdCom[i], numClient: numClient},\n");
      out.write("                                        success: function (data) {\n");
      out.write("                                            if (data.Etat == \"success\") {\n");
      out.write("                                                success++;\n");
      out.write("                                                alert(data.Etat);\n");
      out.write("                                            } else {\n");
      out.write("                                                alert(data.Etat);\n");
      out.write("                                            }\n");
      out.write("                                        },\n");
      out.write("                                        error: function (error) {\n");
      out.write("                                            Console.log(error.responseText);\n");
      out.write("                                        } \n");
      out.write("                                    });\n");
      out.write("                                    i++;\n");
      out.write("                                }\n");
      out.write("                                \n");
      out.write("                                if (success == idProdCom.length) {\n");
      out.write("                                    spin.show();\n");
      out.write("                                    setTimeout(function () {\n");
      out.write("                                        spin.hide();\n");
      out.write("                                        $('.slide3').toggle('slide', {direction: 'left'}, 850);\n");
      out.write("                                        $('.ajout').animate({height: '450px'}, 600);\n");
      out.write("                                        setTimeout(function () {\n");
      out.write("                                            $('.slide4').toggle('slide', {direction: 'right'}, 900);\n");
      out.write("                                            clickAjoutCommande++;\n");
      out.write("                                        }, 890); \n");
      out.write("                                    }, 2500);\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    } break;\n");
      out.write("                    \n");
      out.write("                    case 3: {\n");
      out.write("                        \n");
      out.write("                    } \n");
      out.write("                }\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("air");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodAirtel}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <tr>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td><input class=\"form-control\" type=\"text\" placeholder=\"Entrer Quantité\" id=\"");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\"></td>\n");
          out.write("                                                            </tr>\n");
          out.write("                                                        ");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${air.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${air.prix}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${air.qte}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${air.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("orange");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodOrange}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <tr>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td><input class=\"form-control\" type=\"text\" placeholder=\"Entrer Quantité\" id=\"");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\"></td>\n");
          out.write("                                                            </tr>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orange.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orange.prix}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orange.qte}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orange.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("tel");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodTelma}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <tr>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_c_out_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("</td>\n");
          out.write("                                                                <td><input class=\"form-control\" type=\"text\" placeholder=\"Entrer Quantité\" id=\"");
          if (_jspx_meth_c_out_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\"></td>\n");
          out.write("                                                            </tr>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tel.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tel.prix}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_c_out_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tel.qte}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }

  private boolean _jspx_meth_c_out_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_11.setPageContext(_jspx_page_context);
    _jspx_th_c_out_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_out_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tel.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("air");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Airtel}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                    <tr>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</a></td>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</td>\n");
          out.write("                                                                        <td class=\"badge bg-red\" style=\"font-size: 1.0em\">");
          if (_jspx_meth_c_out_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("</td>\n");
          out.write("                                                                    </tr>\n");
          out.write("                                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_12.setPageContext(_jspx_page_context);
    _jspx_th_c_out_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${air.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
    if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
    return false;
  }

  private boolean _jspx_meth_c_out_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_13.setPageContext(_jspx_page_context);
    _jspx_th_c_out_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${air.prix}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
    if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
    return false;
  }

  private boolean _jspx_meth_c_out_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_14.setPageContext(_jspx_page_context);
    _jspx_th_c_out_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_out_14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${air.qte}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
    if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("orange");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Orange}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                    <tr>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</a></td>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</td>\n");
          out.write("                                                                        <td class=\"badge bg-orange\" style=\"font-size: 1.0em\">");
          if (_jspx_meth_c_out_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</td>\n");
          out.write("                                                                    </tr>\n");
          out.write("                                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_15.setPageContext(_jspx_page_context);
    _jspx_th_c_out_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orange.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
    if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
    return false;
  }

  private boolean _jspx_meth_c_out_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_16.setPageContext(_jspx_page_context);
    _jspx_th_c_out_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orange.prix}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
    if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
    return false;
  }

  private boolean _jspx_meth_c_out_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_17.setPageContext(_jspx_page_context);
    _jspx_th_c_out_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_out_17.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orange.qte}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
    if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setVar("telma");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Telma}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                    <tr>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("</a></td>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("</td>\n");
          out.write("                                                                        <td class=\"badge bg-green\" style=\"font-size: 1.0em\">");
          if (_jspx_meth_c_out_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("</td>\n");
          out.write("                                                                    </tr>\n");
          out.write("                                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_18.setPageContext(_jspx_page_context);
    _jspx_th_c_out_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_18.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${telma.code}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
    if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
    return false;
  }

  private boolean _jspx_meth_c_out_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_19.setPageContext(_jspx_page_context);
    _jspx_th_c_out_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_19.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${telma.prix}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
    if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
    return false;
  }

  private boolean _jspx_meth_c_out_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_20.setPageContext(_jspx_page_context);
    _jspx_th_c_out_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_out_20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${telma.qte}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
    if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setVar("l");
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td scope=\"row\"><a data-toggle=\"collapse\" href=\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" role=\"button\" aria-expanded=\"false\" aria-controls=\"collapseExample\">");
          if (_jspx_meth_c_out_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("</a></td>\n");
          out.write("                                        <td>");
          if (_jspx_meth_c_out_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("</td>\n");
          out.write("                                        <td>");
          if (_jspx_meth_c_out_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("</td>\n");
          out.write("                                        <td>");
          if (_jspx_meth_c_out_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("</td>\n");
          out.write("                                        <td>");
          if (_jspx_meth_c_out_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_21.setPageContext(_jspx_page_context);
    _jspx_th_c_out_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.num}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
    if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
    return false;
  }

  private boolean _jspx_meth_c_out_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_22.setPageContext(_jspx_page_context);
    _jspx_th_c_out_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_22.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.nom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
    if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
    return false;
  }

  private boolean _jspx_meth_c_out_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_23.setPageContext(_jspx_page_context);
    _jspx_th_c_out_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.prenom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
    if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
    return false;
  }

  private boolean _jspx_meth_c_out_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_24.setPageContext(_jspx_page_context);
    _jspx_th_c_out_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_24.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.adresse}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
    if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
    return false;
  }

  private boolean _jspx_meth_c_out_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_25.setPageContext(_jspx_page_context);
    _jspx_th_c_out_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_out_25.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.tel}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
    if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setVar("l");
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <!-- collapse liste commande d'un client -->\n");
          out.write("                                    <div class=\"collapse\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"margin-top: 5px;\">\n");
          out.write("                                        <div class=\"card card-body\">\n");
          out.write("\n");
          out.write("                                            <!-- AJAX SERVLET -->\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <!-- fin collapse liste commande d'un client -->\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }
}
