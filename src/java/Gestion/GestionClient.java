/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import Classe.Clients;
import Classe.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Elvestino
 */
public class GestionClient {
    public PreparedStatement ps;
    public ResultSet res;
    
    public GestionClient() {
 
    }
    
    public void insert(Connexion cnx, Clients c){
        try {
            String requete = "INSERT INTO client (NumClient, NomClient, PrenomClient, AdresseClient, TelClient) values ("+c.getNum()+",'"+c.getNom()+"','"+c.getPrenom()+"','"+c.getAdresse()+"','"+c.getTel()+"');";
            cnx.executeSQL(requete);
            System.out.println(requete);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }  
    }
    
    public ResultSet maxClient(Connexion cnx) {
        try {
            String req = "SELECT max(NumClient) from Client";
            res = cnx.executeQuery(req);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return res;
    }
    
    public void modifier(Connexion cnx, Clients c){
        int res = JOptionPane.showConfirmDialog(null, "Voulez vous modifier ce client?");
        if (res == 0) {
            try{  
                String requete = "UPDATE client SET NumClient= "+c.getNum()+", NomClient= '"+c.getNom()+"', PrenomClient= '"+c.getPrenom()+"', AdresseClient= '"+c.getAdresse()+"', TelClient= '"+c.getTel()+"' where NumClient= "+c.getIdentifiant()+";";
                cnx.executeSQL(requete);
                JOptionPane.showMessageDialog(null, "Modification avec succès");
                System.out.println(requete);
            } catch(Exception ex){
                System.out.println(ex.toString());
            }  
        }
    }      
    

    public void supprimer(Connexion cnx, Clients c,int num) throws ClassNotFoundException{
        int res = JOptionPane.showConfirmDialog(null, "Vous etes sur le point de supprimer un client");
        if (res == 0) {
            try{
                String requete = "DELETE FROM client where NumClient=?";
                ps = (PreparedStatement) cnx.connexion().prepareStatement(requete);
                ps.setInt(1, num);
                ps.execute();
                ps.close();
                JOptionPane.showMessageDialog(null, "Suppression avec succès");
            }catch(SQLException ex){
                System.out.println(ex.toString());
            }
        }
    }
    
    public ResultSet affichage(Connexion cnx){
        try {
            String requete="SELECT * FROM client";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery(requete);    
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet totalClient(Connexion cnx) {
        try {
            String requete = "select count(NumClient) as Total from client;";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery(requete);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet verifClient(Connexion cnx, String nom, String adresse) {
        String sql = "SELECT * FROM Client where NomClient = '"+nom+"' and AdresseClient = '"+adresse+"'";
        try {
            ps = cnx.connexion().prepareStatement(sql);
            res = cnx.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
     public ResultSet indicationClient(String nom, Connexion cnx) {
        try {
            String sql = "SELECT distinct * FROM Client where NomClient like '"+nom+"%' limit 10";
            ps = cnx.connexion().prepareStatement(sql);
            res = cnx.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {
            System.out.println("GesClient : findThisUser 48 ==>"+e.getMessage());
        }
        return res;
    } 
}
