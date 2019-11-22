/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Classe.Clients;
import Classe.Connexion;
import Gestion.GestionClient;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gerson Elvestino
 */
public class ClientServlet extends HttpServlet {
    GestionClient gcli = new GestionClient();
    Clients cli = new Clients();
    Connexion cnx = new Connexion();
    String Client = "Client";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String nom = session.getAttribute("Nom").toString();
        String prenom = session.getAttribute("Prenoms").toString();
        String tel = session.getAttribute("Tel").toString();
        
        String acces = "";
        String action = request.getParameter("action");
        
        // inserer client
        if(action.equalsIgnoreCase("save")){
            String Num = request.getParameter("Numero");
            String Nom = request.getParameter("Nom");
            String Prenom = request.getParameter("Prenom");
            String Tel = request.getParameter("Tel");
            String Adresse = request.getParameter("Adresse");
           
            try {  
                cli.setNum(Integer.parseInt(Num));
                cli.setNom(Nom);
                cli.setPrenom(Prenom);
                cli.setAdresse(Adresse);
                cli.setTel(Tel);
                gcli.insert(cnx, cli);
                acces = Client;
            }
             catch (Exception ex) {
                 System.out.println(ex.toString());
            }
        }
        
        // modifier client
        else if(action.equalsIgnoreCase("up")){ 
            try{
                String Num = request.getParameter("Numero");
                String Nom = request.getParameter("Nom");
                String Prenom = request.getParameter("Prenom");
                String Adresse = request.getParameter("Adresse");
                String Tel = request.getParameter("Tel");
                String Id = request.getParameter("id");
                
                cli.setNum(Integer.parseInt(Num));
                cli.setNom(Nom);
                cli.setPrenom(Prenom);
                cli.setAdresse(Adresse);
                cli.setTel(Tel);
                cli.setIdentifiant(Integer.parseInt(Id));
                gcli.modifier(cnx, cli);
                acces = Client;
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
        
        else if(action.equalsIgnoreCase("suppr")){
            try {
                int Num = Integer.parseInt(request.getParameter("Numero"));
                cli.setNum(Num);
                gcli.supprimer(cnx, cli, Num);
                acces = Client;
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            
         }
        int id = Integer.parseInt(session.getAttribute("id").toString());
        if (id == 0) {
            response.sendRedirect(request.getContextPath()+"/Login");
        } else {
            request.setAttribute("nom", nom);
            request.setAttribute("prenoms", prenom);
            request.setAttribute("tel", tel);
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
        this.getServletContext().getRequestDispatcher("/Client.jsp").forward(request, response);
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
