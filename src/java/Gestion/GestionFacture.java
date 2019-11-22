/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Gerson Elvestino
 */
public class GestionFacture {
    ResultSet res;
    PreparedStatement ps;
    
    public void insert(Connexion cnx, int num , String date, int numCli) {
        String sql = "INSERT INTO facture values ('"+num+"', '"+date+"', '"+numCli+"')";
        try {
            cnx.executeSQL(sql);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    public ResultSet maxFacture(Connexion cnx) {
        String sql = "SELECT max(NumFacture) from facture";
        try {
            res = cnx.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public void supprimer(Connexion cnx, String date, String num) {
        try{
            String requete = "DELETE FROM facture where DateFacture = '"+date+"' and numClient = '"+num+"'";
            ps = (PreparedStatement) cnx.connexion().prepareStatement(requete);
            ps.execute();
            ps.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}

