/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Classe.Clients;
import Classe.Connexion;
import Classe.Produit;
import Classe.Stock;
import Gestion.GestionCommande;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class CommandeServlet extends HttpServlet {

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
            out.println("<title>Servlet CommandeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CommandeServlet at " + request.getContextPath() + "</h1>");
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
    
    
    GestionCommande gCom = new GestionCommande();
    ResultSet res;
    Connexion cnx = new Connexion();

    Calendar c = new GregorianCalendar();
    int j = c.get(Calendar.DAY_OF_MONTH);
    int m = c.get(Calendar.MONTH) + 1;
    int a = c.get(Calendar.YEAR);
    String date = a+"-"+m+"-"+j;
    
    /* affichage commande */
    public ArrayList<Clients> ListCommande(HttpServletRequest request) {
        HttpSession session = request.getSession();
        int id = Integer.parseInt(session.getAttribute("id").toString());
        ArrayList<Clients> listCom = new ArrayList<Clients> ();
        res = gCom.affichage(cnx, id);
        try {
            while (res.next()) {                
                Clients cli = new Clients();
                cli.setNum(res.getInt(1));
                cli.setNom(res.getString(2));
                cli.setPrenom(res.getString(3));
                cli.setAdresse(res.getString(4));
                cli.setTel(res.getString(5));
                listCom.add(cli);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listCom;
    }
    
    /* affichage stock */
    /* AIRTEL */
    public ArrayList<Stock> StockAirtel(HttpServletRequest request) {
        String design = "Credit Airtel";
        ArrayList<Stock> listStockAir = new ArrayList<Stock> ();
        res = gCom.afficheStockCommande(cnx, design);
        try {
            while (res.next()) {                
                Stock s = new Stock();
                s.setCode(res.getString(1));
                s.setPrix(res.getInt(2));
                s.setQte(res.getInt(3));
                listStockAir.add(s);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listStockAir;
    }
    
    /* ORANGE */
    public ArrayList<Stock> StockOrange(HttpServletRequest request) {
        String design = "Credit Orange";
        ArrayList<Stock> listStockOr = new ArrayList<Stock> ();
        res = gCom.afficheStockCommande(cnx, design);
        try {
            while (res.next()) {                
                Stock s = new Stock();
                s.setCode(res.getString(1));
                s.setPrix(res.getInt(2));
                s.setQte(res.getInt(3));
                listStockOr.add(s);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listStockOr;
    }
    
    /* TELMA */
    public ArrayList<Stock> StockTelma(HttpServletRequest request) {
        String design = "Credit Telma";
        ArrayList<Stock> listStockTel = new ArrayList<Stock> ();
        res = gCom.afficheStockCommande(cnx, design);
        try {
            while (res.next()) {                
                Stock s = new Stock();
                s.setCode(res.getString(1));
                s.setPrix(res.getInt(2));
                s.setQte(res.getInt(3));
                listStockTel.add(s);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listStockTel;
    }
    /* fin affichage stock */
    
    /* Affiche produit commandé et son stock */
    /* airtel */
    public ArrayList<Produit> airtel(HttpServletRequest request) {
        ArrayList<Produit> air = new ArrayList<Produit> ();
        res = gCom.afficheProdAirtel(cnx);
        try {
            while (res.next()) {
                Produit p = new Produit();
                p.setCode(res.getString(1));
                p.setPrix(res.getInt(2));
                p.setQte(res.getInt(3));
                air.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return air;
    } 
        
    /* orange */
    public ArrayList<Produit> orange(HttpServletRequest request) {
        ArrayList<Produit> or = new ArrayList<Produit> ();
        res = gCom.afficheProdOrange(cnx);
        try {
            while (res.next()) {
                Produit p = new Produit();
                p.setCode(res.getString(1));
                p.setPrix(res.getInt(2));
                p.setQte(res.getInt(3));
                or.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return or;
    } 
    
    /* telma */
    public ArrayList<Produit> telma(HttpServletRequest request) {
        ArrayList<Produit> tel = new ArrayList<Produit> ();
        res = gCom.afficheProdTelma(cnx);
        try {
            while (res.next()) {
                Produit p = new Produit();
                p.setCode(res.getString(1));
                p.setPrix(res.getInt(2));
                p.setQte(res.getInt(3));
                tel.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return tel;
    } 
    
    /* fin Affiche produit commandé et son stock */
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
            
            /* affichage client commande */
            try {
                request.setAttribute("list", ListCommande(request));
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            /* fin affichage client commande */
            
            /* affichage stock */
            /* AIRTEL */
            try {
                request.setAttribute("Airtel", StockAirtel(request));
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            
            /* ORANGE */
            try {
                request.setAttribute("Orange", StockOrange(request));
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            
            /* TELMA */
            try {
                request.setAttribute("Telma", StockTelma(request));
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            
            /* fin affichage stock */
            
            /* Affiche produit commandé et son stock */
            try {
                request.setAttribute("prodAirtel", airtel(request));
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            
            try {
                request.setAttribute("prodOrange", orange(request));
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            
            try {
                request.setAttribute("prodTelma", telma(request));
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            /* fin Affiche produit commandé et son stock */
            
            int totalCommandeVendeurToday = gCom.totalCommandeVendeurToday(cnx, date, id);
            int totalCommandeToday = gCom.totalCommandeToday(cnx, date);
            int totalCommandeVendeur = gCom.totalCommandeVendeur(cnx, id);
            int totalCommande = gCom.totalCommande(cnx);
            int totalMontantVendeurToday = gCom.totalMontantVendeurToday(cnx, id, date);
            int totalMontantVendeur = gCom.totalMontantVendeur(cnx, id);
            
            /* pourcentage des produits les plus commandes */
                int montantCommandeCreditAirtel = gCom.montantCommandeCredit(cnx, "Credit Airtel", id);
                int montantCommandeCreditOrange = gCom.montantCommandeCredit(cnx, "Credit Orange", id);
                int montantCommandeCreditTelma = gCom.montantCommandeCredit(cnx, "Credit Telma", id);
                
                 
                int pourcentageAirtel = (montantCommandeCreditAirtel * 100) / totalMontantVendeur;
                int pourcentageOrange = (montantCommandeCreditOrange * 100) / totalMontantVendeur;
                int pourcentageTelma = (montantCommandeCreditTelma * 100) / totalMontantVendeur;
            
            /* fin pourcentage des produits les plus commandes */
            
            request.setAttribute("totalCommandeVendeurToday", totalCommandeVendeurToday);
            request.setAttribute("totalCommandeToday", totalCommandeToday);
            request.setAttribute("totalCommandeVendeur", totalCommandeVendeur);
            request.setAttribute("totalCommande", totalCommande);
            request.setAttribute("totalMontantVendeurToday", totalMontantVendeurToday);
            request.setAttribute("totalMontantVendeur", totalMontantVendeur);
            request.setAttribute("pourcentageAirtel", pourcentageAirtel);
            request.setAttribute("pourcentageOrange", pourcentageOrange);
            request.setAttribute("pourcentageTelma", pourcentageTelma);
            
            this.getServletContext().getRequestDispatcher("/Commande.jsp").forward(request, response);
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
        this.getServletContext().getRequestDispatcher("/Commande.jsp").forward(request, response);
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
