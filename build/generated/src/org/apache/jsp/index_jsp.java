package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>E-Fahana | Bienvenue</title>\n");
      out.write("        <link rel=\"icon\" href=\"Image/E-fahana.png\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/loading.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"header\">\n");
      out.write("            <video class=\"video\" autoplay loop muted plays-inline>\n");
      out.write("                <source src=\"Videos/1.mp4\" type=\"video/mp4\">\n");
      out.write("            </video>             \n");
      out.write("        </section>\n");
      out.write("        <div>\n");
      out.write("        <image src=\"Image/E-fahana.png\" style=\"position: absolute; top: 80px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"jumbotron\" style=\"position: absolute; top: 70px; background-color: rgba(0,0,0,0.6); box-shadow: 0 0 50px rgba(0,0,0,1); margin-left: 780px; width: 430px; height: 540px; display: none;\" id=\"slide\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <center>\n");
      out.write("                            <h1 class=\"display-6\" style=\"color: #BDBDBD;\">B I E N V E N U E</h1>\n");
      out.write("                            <small class=\"form-text text-muted\"><b>★ ★ Connectez-vous à votre compte ★ ★</b></small>   \n");
      out.write("                            <form>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputEmail1\">Nom d'utilisateur</label>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <div class=\"input-group-prepend\">\n");
      out.write("                                        <div class=\"input-group-text\"><image src=\"Image/util.png\" width=\"20\" height=\"20\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"text\" id=\"util\" class=\"form-control\" id=\"inlineFormInputGroupUsername\" placeholder=\"Nom d'utilisateur\">\n");
      out.write("                                </div>\n");
      out.write("                                <small class=\"form-text text-muted\">Chaque employer a son propre utilisateur</small>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">Mot de passe</label>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <div class=\"input-group-prepend\">\n");
      out.write("                                        <div class=\"input-group-text\"><image src=\"Image/pass.png\" width=\"20\" height=\"20\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"password\" id=\"mdp\" class=\"form-control\" id=\"inlineFormInputGroupUsername\" placeholder=\"Mot de Passe\">\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                              <div class=\"form-group form-check\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"souvenir\"style=\"margin-left: 170px;\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"exampleCheck1\" style=\"margin-left: 190px;\"><small>Se souvenir de moi<small></label>\n");
      out.write("                              </div>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-outline-light\" id=\"btnCon\" style=\"margin-left: 190px;\">Se connecter<image id=\"suiv\" src=\"Image/right.png\" width=\"18\" heigth=\"18\" style=\"margin-left: 5px; display: none;\"></button></br>\n");
      out.write("                              \n");
      out.write("                              <div class=\"alert alert-danger\" role=\"alert\" id=\"mesDanger\" style=\"display: none; margin-top: 10px; background-color: #F44336; border: 1px solid #F44336; height: 50px;\">\n");
      out.write("                                  <h6 style=\"color: white;\"><b>Veuillez remplir tous les champs!</b></h6>\n");
      out.write("                              </div>\n");
      out.write("                              \n");
      out.write("                              <div class=\"alert alert-danger\" role=\"alert\" id=\"mesFalse\" style=\"display: none; margin-top: 10px; background-color: #F44336; border: 1px solid #F44336; height: 50px;\">\n");
      out.write("                                  <h6 style=\"color: white;\"><b>Utilisateur ou mot de passe incorrecte!</b></h6>\n");
      out.write("                              </div>\n");
      out.write("                              <hr class=\"my-4\">\n");
      out.write("                              <a href=\"#\" style=\"margin-right: 150px; color: white;\">Mot de passe oublié</a>\n");
      out.write("                              <a href=\"#\" style=\"color: white;\">Inscription</a>\n");
      out.write("                            </form>               \n");
      out.write("                        </center>\n");
      out.write("                        <div style=\"margin-left: 200px;\">\n");
      out.write("                            <image src='Image/facebook.png' width='30' heigth='30'>\n");
      out.write("                            <image src='Image/twitter.png' width='30' heigth='30'>\n");
      out.write("                            <image src='Image/mail.png' width='30' heigth='30'>\n");
      out.write("                            <image src='Image/youtube.png' width='30' heigth='30'>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <!-- loading page -->\n");
      out.write("                    <div id=\"panelLoading\" style=\"overflow-x: hidden;overflow-y: auto;background: rgba(0, 0, 0, 0.8);position:absolute;top: 0;right: 0;bottom: 0;left: 0;z-index: 1050;overflow: hidden;outline: 0;color: white; display: none;\">\n");
      out.write("                        <div style=\"position: absolute; width: 80px; right: 100px;\" class=\"loading\">\n");
      out.write("                        <div class=\"obj1\"></div>\n");
      out.write("                        <div class=\"obj2\"></div>\n");
      out.write("                        <div class=\"obj3\"></div>\n");
      out.write("                        <div class=\"obj4\"></div>\n");
      out.write("                        <div class=\"obj5\"></div>\n");
      out.write("                        <div class=\"obj6\"></div>\n");
      out.write("                        <div class=\"obj7\"></div>\n");
      out.write("                        <div class=\"obj8\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            slide = $('#slide');\n");
      out.write("            btn = $('#btnCon');\n");
      out.write("            panel = $('#panelLoading');\n");
      out.write("            util = $('#util');\n");
      out.write("            mdp = $('#mdp');\n");
      out.write("            mesDanger = $('#mesDanger');\n");
      out.write("            mesFalse = $('#mesFalse');\n");
      out.write("            btnSuiv = $('#suiv');\n");
      out.write("            \n");
      out.write("            $(document).ready(function(){\n");
      out.write("               function affiche() {\n");
      out.write("                   slide.toggle('fade', {direction: 'left'}, 4000);\n");
      out.write("                   util.val(\"\");\n");
      out.write("                   mdp.val(\"\");\n");
      out.write("               };\n");
      out.write("               affiche();\n");
      out.write("            \n");
      out.write("               btn.on('mouseover', function(){\n");
      out.write("                   btnSuiv.show(400);\n");
      out.write("               });\n");
      out.write("               btn.on('mouseleave', function(){\n");
      out.write("                   btnSuiv.hide(400);\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            var c = 0;\n");
      out.write("            btn.click(function() {\n");
      out.write("                if(util.val() == \"\" || mdp.val() == \"\") {\n");
      out.write("                    if (c == 0) {\n");
      out.write("                        slide.animate({height:\"590px\"}, 0); \n");
      out.write("                        mesDanger.toggle('shake',  {direction: 'left'}, 250);\n");
      out.write("                        mesFalse.hide();\n");
      out.write("                        c++;\n");
      out.write("                    } else {\n");
      out.write("                        mesDanger.hide();\n");
      out.write("                        mesFalse.hide();\n");
      out.write("                        mesDanger.toggle(\"shake\", 250);\n");
      out.write("                    }\n");
      out.write("                } else {\n");
      out.write("                    panel.toggle('fade', 800);\n");
      out.write("                    utilisateur = util.val();\n");
      out.write("                    password = mdp.val();\n");
      out.write("                    \n");
      out.write("                    // ajax\n");
      out.write("                    $.ajax({\n");
      out.write("                        async: false,\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        url: \"Login\",\n");
      out.write("                        dataType: 'html',\n");
      out.write("                        data: {utilisateur: utilisateur, password: password},\n");
      out.write("                        success: function (data) {\n");
      out.write("                            setTimeout(function(){\n");
      out.write("                                if (data == \"false\") {\n");
      out.write("                                    panel.toggle('fade', 600);\n");
      out.write("                                    util.val(\"\");\n");
      out.write("                                    mdp.val(\"\");\n");
      out.write("                                    if (c == 0) {\n");
      out.write("                                        slide.animate({height:\"590px\"}, 0); \n");
      out.write("                                        mesFalse.toggle('shake',  {direction: 'left'}, 250);\n");
      out.write("                                        mesDanger.hide();\n");
      out.write("                                        c++;\n");
      out.write("                                    } else {\n");
      out.write("                                        mesFalse.hide();\n");
      out.write("                                        mesDanger.hide();\n");
      out.write("                                        mesFalse.toggle(\"shake\", 250);\n");
      out.write("                                    }\n");
      out.write("                                } else {\n");
      out.write("                                    window.location.href = \"Menu\";\n");
      out.write("                                }    \n");
      out.write("                            }, 2000);\n");
      out.write("                        },\n");
      out.write("                        error: function (errorThrown) {\n");
      out.write("                            alert(errorThrown);\n");
      out.write("                        }\n");
      out.write("                    });\n");
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
}
