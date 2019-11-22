/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.Connexion;
import Classe.Login;
import java.sql.ResultSet;

/**
 *
 * @author Gerson Elvestino
 */
public class GestionUtilisateur {
    Connexion cnx = new Connexion();
    Login lg = new Login();
    ResultSet rs;
    
    public ResultSet verifUtilisateur(Login lg) {
        try {
            String sql = "SELECT * from vendeur where Utilisateur = '"+lg.getUtilisateur()+"' and Mdp = '"+lg.getMdp()+"'";
            rs = cnx.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }
    
}
