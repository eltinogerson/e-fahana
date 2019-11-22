/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Classe.Connexion;
import java.sql.ResultSet;

/**
 *
 * @author Gerson Elvestino
 */
public class GestionStock {
    ResultSet res;
    
    public int verifQteStock(Connexion cnx, String code) {
        int qteStock = 0;
        String sql = "SELECT QteLivre from stock where CodeCredit = '"+code+"'";
        try {
            res = cnx.executeQuery(sql);
            while (res.next()) {
                qteStock = res.getInt("QteLivre");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return qteStock;
    }
    
    public void modifierQteStock (Connexion cnx, int newQte, String code) {
        String sql = "UPDATE stock SET QteLivre = "+newQte+" WHERE CodeCredit = '"+code+"'";
        try {
            cnx.executeSQL(sql);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
