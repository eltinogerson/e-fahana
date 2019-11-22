/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Classe.Login;
import Gestion.GestionUtilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gerson Elvestino
 */
public class loginServlet extends HttpServlet {

    ResultSet res;
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
            out.println("<title>Servlet loginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
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
        int id = 0;
        String user = null;
        String pass = null;
        String nom = null;
        String prenom = null;
        String tel = null;
        
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String util = request.getParameter("utilisateur");
        String mdp = request.getParameter("password");
        
        if (util != null && mdp.trim().length() != 0) {
            Login lg = new Login();
            GestionUtilisateur g = new GestionUtilisateur();
            lg.setUtilisateur(util);
            lg.setMdp(mdp);
            res = g.verifUtilisateur(lg);
            try {
                while (res.next()) {
                    id = res.getInt("Id");
                    user = res.getString("Utilisateur");
                    pass = res.getString("Mdp");
                    nom = res.getString("Nom");
                    prenom = res.getString("Prenoms");
                    tel = res.getString("Tel");
                }
                if (user == null && pass == null) {
                    out.write("false");
                } else {
                    out.write("true");
                    session.setAttribute("id", id);
                    session.setAttribute("Utilisateur", user);
                    session.setAttribute("Mdp", pass);
                    session.setAttribute("Nom", nom);
                    session.setAttribute("Prenoms", prenom);
                    session.setAttribute("Tel", tel);
                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        } else {
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
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
