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
public class GestionProduit {
    ResultSet res;
    
    public int pU(Connexion cnx, String code) {
        int pU = 0;
        String req = "SELECT Prix_En_Ar as pU from credit where CodeCredit='"+code+"'";
        try {
            res = cnx.executeQuery(req);
            while (res.next()) {
                pU = res.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return pU;
    }
    
    public int produit(Connexion cnx) {
        int p = 0;
        String req = "select count(CodeCredit) from credit;";
        try {
            res = cnx.executeQuery(req);
            while (res.next()) {                
                p = res.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return p;
    }
}
