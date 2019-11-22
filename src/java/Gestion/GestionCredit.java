/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import Classe.Connexion;
import Classe.Credits;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Elvestino
 */
public class GestionCredit {
    public PreparedStatement ps;
    public ResultSet res;
    Credits crd = new Credits();
    

    public GestionCredit() {
    }

    public void insert (Connexion cnx, Credits crd){
        try {
            PreparedStatement stat;
            String requete = "INSERT INTO credit (CodeCredit, Designation, Prix_En_Ar) values ('"+crd.getCode()+"','"+crd.getDesignation()+"',"+crd.getPrix()+");";
            cnx.executeSQL(requete);
            JOptionPane.showMessageDialog(null,"Insertion reussie!!!");
            System.out.println(requete);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }  
    }
    
    public void modifier(Connexion cnx, Credits crd){
        int res = JOptionPane.showConfirmDialog(null, "Voulez vous modifier ce données?");
        if (res == 0) {
            try{
                PreparedStatement stat;
                String requete = "UPDATE credit set CodeCredit='"+crd.getCode()+"', Designation='"+crd.getDesignation()+"', Prix_En_Ar="+crd.getPrix()+" where CodeCredit='"+crd.getCodeUpdate()+"';";
                cnx.executeSQL(requete);
                JOptionPane.showMessageDialog(null, "Modification avec succès");        
            } catch(Exception ex){
                  System.out.println(ex.toString());
            }  
        }          
    }
    
    public void supprimer(Connexion cnx, Credits crd, String num) throws ClassNotFoundException{
        int res = JOptionPane.showConfirmDialog(null, "Voulez vous supprimer ce données?");
        if (res == 0) {
        try{
            String requete = "DELETE FROM credit where CodeCredit=?";
            ps = (PreparedStatement) cnx.connexion().prepareStatement(requete);
            ps.setString(1, num);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Suppression réussie");
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        }
    }
    
    public ResultSet recherche(Connexion cnx, String colonne, String elt) {
        try {
            PreparedStatement stat;
            String requete = "SELECT* FROM credit where "+colonne+" = '"+elt+"';";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
}
