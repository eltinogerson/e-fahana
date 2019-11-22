/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestion;

import Classe.Commandes;
import Classe.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gerson Elvestino
 */
public class GestionCommande {
    PreparedStatement ps;
    ResultSet res;
    
    public ResultSet affichage(Connexion cnx, int id) {
        try {
            String requete = "SELECT distinct client.NumClient, client.NomClient, client.PrenomClient, client.AdresseClient, client.TelClient from commande, client, vendeur where commande.NumClient = client.NumClient and commande.Id = vendeur.Id and vendeur.Id = "+id+";";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }   
    
    public ResultSet afficheOptionsClient(Connexion cnx, int id) {
        try {
            String requete = "SELECT NumClient, NomClient, PrenomClient, AdresseClient, TelClient from client where NumClient = "+id+";";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }   
    
    
    public ResultSet afficheStockCommande(Connexion cnx, String design) {
        try {
            String requete = "select credit.CodeCredit, credit.Prix_En_Ar, stock.QteLivre from credit, stock where credit.CodeCredit = stock.CodeCredit and credit.designation = '"+design+"';";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet afficheDateCommande(Connexion cnx, int num, int id) {
        try {
            String requete = "SELECT distinct DateCommande from commande where NumClient = "+num+" and Id = "+id+";";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet afficheListeCommande(Connexion cnx, int num, String date, int id) {
        try {
            String requete = "select commande.NumCommande, credit.CodeCredit, credit.Designation, credit.Prix_En_Ar ,commande.QteCommande, commande.Montant from commande, client, credit, vendeur where commande.CodeCredit = credit.CodeCredit and commande.NumClient = client.NumClient and commande.Id = vendeur.Id and client.NumClient = "+num+" and vendeur.Id = "+id+" and commande.DateCommande = '"+date+"'";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet afficheTotalCommande(Connexion cnx, int num, String date, int id) {
        try {
            String requete = "select sum(Montant) as somme from commande where NumClient = "+num+" and Id = "+id+" and DateCommande = '"+date+"'";
            ps = cnx.connexion().prepareStatement(requete);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    
    public ResultSet afficheProdAirtel(Connexion cnx) {
        String req = "select credit.CodeCredit, credit.Prix_En_Ar, stock.QteLivre from credit, stock where credit.CodeCredit = stock.CodeCredit and credit.Designation = 'Credit Airtel';";
        try {
            ps = cnx.connexion().prepareStatement(req);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public ResultSet afficheProdOrange(Connexion cnx) {
        String req = "select credit.CodeCredit, credit.Prix_En_Ar, stock.QteLivre from credit, stock where credit.CodeCredit = stock.CodeCredit and credit.Designation = 'Credit Orange';";
        try {
            ps = cnx.connexion().prepareStatement(req);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
     
    public ResultSet afficheProdTelma(Connexion cnx) {
        String req = "select credit.CodeCredit, credit.Prix_En_Ar, stock.QteLivre from credit, stock where credit.CodeCredit = stock.CodeCredit and credit.Designation = 'Credit Telma';";
        try {
            ps = cnx.connexion().prepareStatement(req);
            res = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public int maxCom(Connexion cnx) {
        int max = 0;
        String req = "SELECT max(NumCommande) from commande";
        try {
            res = cnx.executeQuery(req);
            while (res.next()) {
                max = res.getInt("max(NumCommande)");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return max;
    }
    
    public ResultSet verifNumFacture(Connexion cnx, int num, String date) {
        String req = "SELECT max(NumFacture) from commande WHERE NumClient="+num+" and DateCommande = '"+date+"'";
        try {
            res = cnx.executeQuery(req);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    
    public void insert(Connexion cnx, Commandes cmd) {
        String requete = "INSERT INTO commande values ("+cmd.getNum()+",'"+cmd.getDate()+"' ,"+cmd.getQuantite()+" ,"+cmd.getMontant()+" ,"+cmd.getNumClient()+", "+cmd.getNumFacture()+", '"+cmd.getCodeCredit()+"', "+cmd.getIdVendeur()+");";
        try {
            cnx.executeSQL(requete);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    public int totalCommandeVendeurToday(Connexion cnx, String date, String id) {
        int total = 0;
        String requete = "SELECT count(NumCommande) from commande where Id = '"+id+"' and DateCommande = '"+date+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int totalCommandeToday(Connexion cnx, String date) {
        int total = 0;
        String requete = "SELECT count(NumCommande) from commande where DateCommande = '"+date+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int totalCommandeVendeur(Connexion cnx, String id) {
        int total = 0;
        String requete = "SELECT count(NumCommande) from commande where Id = '"+id+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int totalCommande(Connexion cnx) {
        int total = 0;
        String requete = "SELECT count(NumCommande) from commande";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int totalMontantVendeurToday(Connexion cnx, String id, String date) {
        int total = 0;
        String requete = "SELECT sum(Montant) from commande where Id = '"+id+"' and DateCommande = '"+date+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int totalMontantVendeur(Connexion cnx, String id) {
        int total = 0;
        String requete = "SELECT sum(Montant) from commande where Id = '"+id+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int totalMontantCommande(Connexion cnx) {
        int total = 0;
        String requete = "SELECT sum(Montant) from commande;";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int totalMontantCommandeToday(Connexion cnx, String date) {
        int total = 0;
        String requete = "SELECT sum(Montant) from commande where DateCommande = '"+date+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int montantCommandeCredit(Connexion cnx, String design, String id) {
        int total = 0;
        String requete = "select sum(commande.Montant) from commande, credit where commande.CodeCredit = credit.CodeCredit and credit.Designation = '"+design+"' and commande.Id = '"+id+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return total;
    }
    
    public int countCommandeAirtel(Connexion cnx) {
        int total = 0;
        String requete = "select sum(QteCommande) from commande where CodeCredit like 'AIR%'";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total;
    }
    
    public int countCommandeTelma(Connexion cnx) {
        int total = 0;
        String requete = "select sum(QteCommande) from commande where CodeCredit like 'TLM%'";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total;
    }
    
    public int countCommandeOrange(Connexion cnx) {
        int total = 0;
        String requete = "select sum(QteCommande) from commande where CodeCredit like 'ORG%'";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total;
    }
    
    public int countCommande(Connexion cnx) {
        int total = 0;
        String requete = "select sum(QteCommande) from commande;";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total;
    }
    
    public int montantTotalAirtel(Connexion cnx) {
       int total = 0;
        String requete = "select sum(Montant) from commande where CodeCredit like 'AIR%';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total; 
    }
    
    public int montantTotalOrange(Connexion cnx) {
       int total = 0;
        String requete = "select sum(Montant) from commande where CodeCredit like 'ORG%';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total; 
    }
    
    public int montantTotalTelma(Connexion cnx) {
       int total = 0;
        String requete = "select sum(Montant) from commande where CodeCredit like 'TLM%';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total; 
    }
    
    public void supprimer(Connexion cnx, String date, String num, String id) throws ClassNotFoundException{
        try{
            String requete = "DELETE FROM commande where DateCommande = '"+date+"' and NumClient = '"+num+"' and Id = '"+id+"'";
            ps = (PreparedStatement) cnx.connexion().prepareStatement(requete);
            ps.execute();
            System.out.println(requete);
            ps.close();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public ResultSet selectCodeAndQteCredit(Connexion cnx, String date, int num) {
        String requete = "select CodeCredit, QteCommande from commande where DateCommande = '"+date+"' and NumClient = '"+num+"';";
        try {
            res = cnx.executeQuery(requete);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return res;
    }
    
    public int caisse(Connexion cnx) {
       int total = 0;
        String requete = "select sum(Montant) from payer;";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total; 
    }
    
    public int caisseVendeur(Connexion cnx, String id) {
       int total = 0;
        String requete = "select sum(Montant) from payer where Id = '"+id+"';";
        try {
            res = cnx.executeQuery(requete);
            while (res.next()) {
                total = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return total; 
    }
}
