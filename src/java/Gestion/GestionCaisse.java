/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import Classe.Caisses;
import Classe.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Elvestino
 */
public class GestionCaisse {
    PreparedStatement ps;
    ResultSet res;
    Connexion cnx = new Connexion();
    
    
    public ResultSet verifPayement(int fact) {
        try {
            String requete = "Select * from caisse where NumFacture ="+fact+";";      
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet infoCaisse(Connexion cnx, int fact) {
        try {
            String requete = "SELECT commande.DateCommande, commande.Montant from commande, facture where commande.numfacture = facture.numfacture and facture.NumFacture= "+fact+";";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet affichage(Connexion cnx) {
        try {
            String requete = "SELECT* from caisse where 1";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }  
    
    public void insert(Connexion cnx, Caisses c) {
        try {
            PreparedStatement stat;
            String requete = "INSERT INTO caisse values ("+c.getNumCaisse()+", '"+c.getDatePayement()+"', "+c.getMontant()+", "+c.getNumFacture()+");";
            cnx.executeSQL(requete);
            System.out.println(requete);
            JOptionPane.showMessageDialog(null,"Insertion reussie!!!");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        
        
    }
    public ResultSet getAll(Connexion cnx){
            String sql ="SELECT * FROM Caisse WHERE 1;";
            try {
            ps = cnx.connexion().prepareStatement(sql);
            res = ps.executeQuery();
        } catch (Exception e) {
        }
    return res;
    }
}
