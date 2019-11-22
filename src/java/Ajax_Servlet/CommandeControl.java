/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajax_Servlet;

import Classe.Clients;
import Classe.Commandes;
import Classe.Connexion;
import Gestion.GestionClient;
import Gestion.GestionCommande;
import Gestion.GestionFacture;
import Gestion.GestionProduit;
import Gestion.GestionStock;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gerson Elvestino
 */
public class CommandeControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet afficheListeCommande</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet afficheListeCommande at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    
    GestionCommande gC = new GestionCommande();
    Gson g = new Gson();
    Map map = new HashMap<>();
    GestionClient gCli = new GestionClient();
    GestionFacture gF = new GestionFacture();
    GestionProduit gP = new GestionProduit();
    GestionStock gS = new GestionStock();
    ResultSet res;
    int numCli = 0;
    int num;
    String nom, prenom, adresse, tel;
    Connexion cnx = new Connexion();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String id = session.getAttribute("id").toString();
        String operation = request.getParameter("operation");
        switch(operation) {
            
            /* afficher commande */
            case "afficherCommande": {
                String numCli = request.getParameter("numClient");
                String Commande = "<div class=\"box box-success\" style=\"overflow-y: scroll; height: 400px;\">";
                Commande += "<div class=\"box-header ui-sortable-handle\" style=\"cursor: move;\">";
                    Commande += "<h2 class=\"box-title\">";
                        Commande += "<div class=\"callout callout-info\" style=\"font-size: 0.8em\">";
                            Commande += "<div class=\"row\">";
                                Commande += "<div class=\"col-4\">";
                                    Commande += "<img src=\"Image/client.png\" width=\"80\" height=\"80\">";
                                Commande += "</div>";
                                Commande += "<div class=\"col-8\">";
                                    
                                    /* affiche options client dans le liste commande */
                                    res = gC.afficheOptionsClient(cnx, Integer.parseInt(numCli));
                                    try {
                                        while (res.next()) {
                                            num = res.getInt(1);
                                            nom = res.getString(2);
                                            prenom = res.getString(3);
                                            adresse = res.getString(4);
                                            tel = res.getString(5);
                                        }
                                    } catch (Exception ex) {
                                        System.out.println(ex.toString());
                                    }
                                
                                    Commande += "<small><b>Numero :</b> "+num+"</small></br>";
                                    Commande += "<small><b>Nom : </b>"+nom+"</small></br>";
                                    Commande += "<small><b>Prenom : </b>"+prenom+"</small></br>";
                                    Commande += "<small><b>Adresse : </b>"+adresse+"</small></br>";
                                    Commande += "<small><b>Telephone : </b>"+tel+"</small></br>";
                                Commande += "</div>";
                            Commande += "</div>";
                        Commande += "</div>";
                    Commande += "</h2>";
                    Commande += "<div class=\"box-tools pull-right\" data-toggle=\"tooltip\" title=\"\" data-original-title=\"Status\">";
                        Commande += "<img src=\"Image/listeCommande.png\">";
                        Commande += "<button class=\"btn btn-success\" onclick=\"return window.location.reload()\">Terminé verification</button>";
                    Commande += "</div><br>";
                    int idT = 1;
                    res = gC.afficheDateCommande(cnx, Integer.parseInt(numCli), Integer.parseInt(id));
                    try {
                        while (res.next()) {
                        /* afficher date de chaque commande */
                        Commande += "<div class=\"tableCommande"+idT+numCli+"\">";
                        Commande += "<h4 style=\"text-align: center;\" class=\"mb-3\"><b>Commande du : <span class=\"badge bg-green mr-5\">"+res.getString(1)+"</span></b></h4>";

                        ResultSet rs = gC.afficheListeCommande(cnx, Integer.parseInt(numCli), res.getString(1), Integer.parseInt(id));
                        /* table */
                        Commande += "<table class=\"table table-borderless bg-light tableCommande"+idT+"\" style=\"width: 100%; text-align: center; font-size : 0.7em;\">";
                        Commande += "<thead style=\"background-color: #3c8dbc; color: white;\">";
                        Commande += "<th scope=\"col\">N° du Commande</th>";
                        Commande += "<th scope=\"col\">Code</th>";
                        Commande += "<th scope=\"col\">Designation</th>";
                        Commande += "<th scope=\"col\">Prix Unitaire</th>";
                        Commande += "<th scope=\"col\">Quantit&eacute;</th>";
                        Commande += "<th scope=\"col\">Montant</th>";
                        Commande += "</thead>";
                        Commande += "<tbody>";
                        
                        /* affiche liste commande */
                        try {
                            while (rs.next()) {
                                Commande += "<tr>";
                                Commande += "<td>"+rs.getInt(1)+"</td>";
                                Commande += "<td>"+rs.getString(2)+"</td>";
                                Commande += "<td>"+rs.getString(3)+"</td>";
                                Commande += "<td>"+rs.getInt(4)+"</td>";
                                Commande += "<td>"+rs.getInt(5)+"</td>";
                                Commande += "<td>"+rs.getInt(6)+"</td>";
                                Commande += "</tr>";
                            }
                        } catch (Exception ex) {
                            System.out.println(ex.toString());
                        }
                        Commande += "<tr style=\"background-color: white; border: none;\">";
                        Commande += "<td></td><td></td><td></td><td></td><td></td>";
                        ResultSet r = gC.afficheTotalCommande(cnx, Integer.parseInt(numCli), res.getString(1), Integer.parseInt(id));
                        try {
                            while (r.next()) {
                                Commande += "<td class=\"suppmultiple\"><h4 class=\"d-inline\"><b>T O T A L : </b></h4><h3 class=\"d-inline\"><span class=\"badge bg-green mr-2\">"+r.getString(1)+" Ar</span></h3><button data-date=\""+res.getString(1)+"\" data-idT=\"tableCommande"+idT+numCli+"\" class=\"btn btn-sm btn-danger mb-2 supTous\"><img src=\"Image/SupOrder.png\"</button><button data-date=\""+res.getString(1)+"\" data-idT=\"tableCommande"+idT+numCli+"\" class=\"btn btn-primary mb-2 ml-3 valideTous\">Valider</button></td>";
                            }
                        } catch (Exception ex) {
                            System.out.println(ex.toString());
                        }
                        Commande += "</tr>";
                        Commande += "</tbody>";
                        Commande += "</table>";   
                        Commande += "<hr class=\"separator2\">";
                        Commande += "</div>";
                        idT++;
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                    
                Commande += "</div>";
                out.print(Commande);
            }
            break;
            
            /* verifier client */
            case "verifierClient": {
                nom = request.getParameter("nom");
                prenom = request.getParameter("prenom");
                adresse = request.getParameter("adresse");
                tel = request.getParameter("tel");
                Clients c = new Clients();
                c.setNom(nom);
                c.setPrenom(prenom);
                c.setAdresse(adresse);
                c.setTel(tel);
                
                res = gCli.verifClient(cnx, nom, adresse);
                try {
                    while (res.next()) {
                        numCli = res.getInt(1);
                        c.setNum(numCli);
                    }                    
                } catch (SQLException e) {
                    System.out.println(e.toString());
                }
                if (numCli == 0) {
                    int maxNumCli = 0;
                    int newNum = 0;
                    ResultSet maxNum = gCli.maxClient(cnx);
                    try {
                        while (maxNum.next()) {
                            maxNumCli = maxNum.getInt("max(NumClient)");
                        }
                        newNum = maxNumCli + 1;
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                    
                    c.setNum(newNum);
                    gCli.insert(cnx, c);
                    map.put("num", c.getNum());
                    map.put("nom", c.getNom());
                    map.put("prenom", c.getPrenom());
                    map.put("adresse", c.getAdresse());
                    map.put("tel", c.getTel());
                    map.put("etat", "false");
                    
                } else {
                    map.put("num", c.getNum());
                    map.put("nom", c.getNom());
                    map.put("prenom", c.getPrenom());
                    map.put("adresse", c.getAdresse());
                    map.put("tel", c.getTel());
                    map.put("etat", "true");
                }
                /* System.out.println(g.toJson(c)); */
                out.print(g.toJson(map));
            }
            break;
            
            case "verifProduit": {
                String codeProd = request.getParameter("idProdCom");
                int qteProd = Integer.parseInt(request.getParameter("qteProdCom"));
                int qteStock = gS.verifQteStock(cnx, codeProd);
                if (qteProd <= qteStock) {
                    map.put("Quantité_disponible", "true");
                } else {
                    map.put("Quantité_disponible", "false");
                }
                out.print(g.toJson(map));
            } break;
            
            case "updateStock": {
                int qteBaseStock = 0;
                int qteNewStock = 0;
                int somme = 0;
                String codeProd = request.getParameter("idProdComStock");
                qteBaseStock = Integer.parseInt(request.getParameter("qteProdStock"));
                qteNewStock = Integer.parseInt(request.getParameter("qteSaisiProd"));
                System.out.println(qteBaseStock+" , "+qteNewStock);
                somme = qteBaseStock + qteNewStock;
                map.clear();
                if (somme != 0) {
                    gS.modifierQteStock(cnx, somme, codeProd);
                    map.put("success", "true");
                } else {
                    map.put("success", "false");
                }
                out.print(g.toJson(map));
            } break;
            
            
            case "ajouterNouveauCommande": {
                int qteStock = 0;
                int newQteStock = 0;
                int maxFact = 0;
                Calendar c = new GregorianCalendar();
                int j = c.get(Calendar.DAY_OF_MONTH);
                int m = c.get(Calendar.MONTH) + 1;
                int a = c.get(Calendar.YEAR);
                String date = a+"-"+m+"-"+j;
                int idVendeur = Integer.parseInt(session.getAttribute("id").toString());
                String codeProd = request.getParameter("idProdCom");
                qteStock = gS.verifQteStock(cnx, codeProd);
                int qteProd = Integer.parseInt(request.getParameter("qteProdCom"));
                int montant = qteProd * gP.pU(cnx, codeProd);
                int numClient = Integer.parseInt(request.getParameter("numClient"));
                /* out.print(idVendeur+", "+codeProd+", "+qteProd); */
                
                int maxCom = gC.maxCom(cnx);
                int newCom = maxCom + 1;
                
                res = gC.verifNumFacture(cnx, numClient, date);
                try {
                    while (res.next()) {                        
                        maxFact = res.getInt(1);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
                
                if (qteStock >= qteProd) {
                    newQteStock = qteStock - qteProd;
                    if (maxFact == 0) {
                        int newNumFact = 0;
                        int maxNumFact = 0;
                        res = gF.maxFacture(cnx);
                        try {
                            while (res.next()) {
                                maxNumFact = res.getInt(1);
                            }
                            newNumFact = maxNumFact + 1;
                            gF.insert(cnx, newNumFact, date, numClient);
                        } catch (Exception ex) {
                            System.out.println(ex.toString());
                        }
                        Commandes com = new Commandes(newCom, date, qteProd, montant, numClient, String.valueOf(newNumFact), codeProd, idVendeur);
                        gC.insert(cnx, com);
                    } else {
                        Commandes com = new Commandes(newCom, date, qteProd, montant, numClient, String.valueOf(maxFact), codeProd, idVendeur);
                        gC.insert(cnx, com);
                    }
                    gS.modifierQteStock(cnx, newQteStock, codeProd);
                    map.clear();
                    map.put("Etat", "success");
                    out.print(g.toJson(map));
                } else {
                    map.put("Etat", "error");
                    out.print(g.toJson(map));
                }
            } break;
            
            case "indication": {
                String result = "";
                String key = request.getParameter("key");
                try {
                    int i = 0;
                    res = gCli.indicationClient(key, cnx);
                    while (res.next()) {
                        i++;
                        result += "<li class=\"p-1\" style=\"font-size:13px;\" data-nom=\""+res.getString("NomClient")+"\" data-prenom=\""+res.getString("PrenomClient")+"\" data-adresse=\""+res.getString("AdresseClient")+"\" data-tel=\""+res.getString("TelClient")+"\"<b class=\"text-white\" style=\"background-color: #00C853;border-radius:5px;\"><small class=\"mr-1 ml-1\">"+res.getString("NomClient")+"</i></small></b><b class=\"text-white\" style=\"background-color: #01579B; border-radius: 3px; font-size: 1.0em;\"><small class=\"mr-1 ml-1\"><i>"+res.getString("PrenomClient")+"</i></small></b><b class=\"float-right\" style=\"background-color: #E0E0E0; border-radius:5px;\"><small class=\"text-muted mr-1 ml-1\">Tel : <i>"+res.getString("TelClient")+"</i></small></b></li>";
                    }
                    map.clear();
                    map.put("html", result);
                    if (i == 0) {
                        map.put("empty", "true");
                    } else {
                        map.put("empty", "false");
                    }
                    out.print(g.toJson(map));
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            } break;
            
            case "tauxProduitAirtel": {
                String pourcent = "";
                GestionCommande gCom = new GestionCommande();
                int totalMontantVendeur = gCom.totalMontantVendeur(cnx, id);
                int montantCommandeCreditAirtel = gCom.montantCommandeCredit(cnx, "Credit Airtel", id);
                int pourcentageAirtel = (montantCommandeCreditAirtel * 100) / totalMontantVendeur;
                
                if (pourcentageAirtel < 25) {
                    pourcent = "<div class=\"progress\" style=\"margin-top: 10px\">";
                    pourcent += "<div class=\"progress-bar progress-bar-striped progress-bar-animated bg-danger\" style=\"width:<%= request.getAttribute(\"pourcentageAirtel\") %>%\"> Airtel </div>";
                    pourcent += "</div>";
                } else if (25 <= pourcentageAirtel || pourcentageAirtel <= 50) {
                    pourcent = "<div class=\"progress\" style=\"margin-top: 10px\">";
                    pourcent += "<div class=\"progress-bar progress-bar-striped progress-bar-animated\" style=\"width:<%= request.getAttribute(\"pourcentageAirtel\") %>%\"> Airtel </div>";
                    pourcent += "</div>";
                } else if (50 <= pourcentageAirtel || pourcentageAirtel <= 75) {
                    pourcent = "<div class=\"progress\" style=\"margin-top: 10px\">";
                    pourcent += "<div class=\"progress-bar progress-bar-striped progress-bar-animated bg-warning\" style=\"width:<%= request.getAttribute(\"pourcentageAirtel\") %>%\"> Airtel </div>";
                    pourcent += "</div>"; 
                } else if (pourcentageAirtel >= 75) {
                    pourcent = "<div class=\"progress\" style=\"margin-top: 10px\">";
                    pourcent += "<div class=\"progress-bar progress-bar-striped progress-bar-animated bg-success\" style=\"width:<%= request.getAttribute(\"pourcentageAirtel\") %>%\"> Airtel </div>";
                    pourcent += "</div>"; 
                }
                out.print(pourcent);
            }
            break;
            
            case "supprimerCommandeDate" : {
                String code = null;
                int qte = 0;
                map.clear();
                String numClient = request.getParameter("numClient");
                String date = request.getParameter("date");
                try {
                    ResultSet r = gC.selectCodeAndQteCredit(cnx, date, Integer.parseInt(numClient));
                    while(r.next()) {
                        code = r.getString(1);
                        qte = r.getInt(2);
                        int qteS = gS.verifQteStock(cnx, code);
                        int newQte = qteS + qte;
                        gS.modifierQteStock(cnx, newQte, code);
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                try {
                    gC.supprimer(cnx, date, numClient, id);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
                map.put("state", "true");
                gF.supprimer(cnx, date, numClient);
                out.write(g.toJson(map));
            }
            break;
            
            default: out.print("error");
            break;
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
