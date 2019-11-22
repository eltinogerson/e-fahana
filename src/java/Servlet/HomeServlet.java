/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Classe.Connexion;
import Gestion.GestionClient;
import Gestion.GestionCommande;
import Gestion.GestionProduit;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gerson Elvestino
 */
public class HomeServlet extends HttpServlet {

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
            out.println("<title>Servlet HomeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    GestionClient gCli = new GestionClient();
    GestionCommande gCom = new GestionCommande();
    GestionProduit gP = new GestionProduit();
    ResultSet res;
    Connexion cnx = new Connexion();
    String totalCli = null;
    Calendar c = new GregorianCalendar();
    int j = c.get(Calendar.DAY_OF_MONTH);
    int m = c.get(Calendar.MONTH) + 1;
    int a = c.get(Calendar.YEAR);
    String date = a+"-"+m+"-"+j;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("id") == null) {
            response.sendRedirect(request.getContextPath()+"/Login");
        } else {
            String nom = session.getAttribute("Nom").toString();
            String prenom = session.getAttribute("Prenoms").toString();
            String tel = session.getAttribute("Tel").toString();
            String id = session.getAttribute("id").toString();
            request.setAttribute("nom", nom);
            request.setAttribute("prenoms", prenom);
            request.setAttribute("tel", tel);
            
            try {
                res = gCli.totalClient(cnx);
                while (res.next()) {
                    totalCli = res.getString(1);
                    System.out.println(totalCli);
                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            
            int totalCaisseVendeur = gCom.caisseVendeur(cnx, id);
            request.setAttribute("totalClient", totalCli);
            int totalCommandeToday = gCom.totalCommandeToday(cnx, date);
            int totalCommande = gCom.totalCommande(cnx);
            int totalMontantCommande = gCom.totalMontantCommande(cnx);
            int totalMontantCommandeToday = gCom.totalMontantCommandeToday(cnx, date);
            int caisse = gCom.caisse(cnx);
            request.setAttribute("totalCommande", totalCommande);
            int totalCommandeVendeur = gCom.totalCommandeVendeur(cnx, id);
            int totalMontantVendeur = gCom.totalMontantVendeur(cnx, id);
            int countCommande = gCom.countCommande(cnx);
            int countCommandeAirtel = gCom.countCommandeAirtel(cnx);
            int countCommandeTelma = gCom.countCommandeTelma(cnx);
            int countCommandeOrange = gCom.countCommandeOrange(cnx);
            int produit = gP.produit(cnx);
            int percentAirtel = (countCommandeAirtel * 100) / countCommande;
            int percentOrange = (countCommandeOrange * 100) / countCommande;
            int percentTelma = (countCommandeTelma * 100) / countCommande;
            int montantTotalAirtel = gCom.montantTotalAirtel(cnx);
            int montantTotalOrange = gCom.montantTotalOrange(cnx);
            int montantTotalTelma = gCom.montantTotalTelma(cnx);
            
            /* Compter les commandes */
            request.setAttribute("percentAirtel", percentAirtel);
            request.setAttribute("percentOrange", percentOrange);
            request.setAttribute("percentTelma", percentTelma);
            System.out.println(percentAirtel);
            
            /* Pourcentage des commandes */
            request.setAttribute("countCommande", countCommande);
            request.setAttribute("countCommandeAirtel", countCommandeAirtel);
            request.setAttribute("countCommandeTelma", countCommandeTelma);
            request.setAttribute("countCommandeOrange", countCommandeOrange);
            
            /* Montant total des commandes */
            request.setAttribute("montantTotalAirtel", montantTotalAirtel);
            request.setAttribute("montantTotalOrange", montantTotalOrange);
            request.setAttribute("montantTotalTelma", montantTotalTelma);
            
            request.setAttribute("produit", produit);
            request.setAttribute("totalCommandeVendeur", totalCommandeVendeur);
            request.setAttribute("totalMontantVendeur", totalMontantVendeur);
            request.setAttribute("totalCommandeToday", totalCommandeToday);
            request.setAttribute("totalMontantCommande", totalMontantCommande);
            request.setAttribute("totalMontantCommandeToday", totalMontantCommandeToday);
            request.setAttribute("caisse", caisse);
            request.setAttribute("totalCaisseVendeur", totalCaisseVendeur);
            this.getServletContext().getRequestDispatcher("/Menu.jsp").forward(request, response);
        }
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
        
        this.getServletContext().getRequestDispatcher("/Menu.jsp").forward(request, response);
        
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
