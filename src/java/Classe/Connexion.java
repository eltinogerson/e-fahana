/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gerson Elvestino
 */
public class Connexion {
    
    public Connection con;
    public Statement stat;
    public String SQL;
    Constants consts = new Constants();

    
    
    // Connexion base de donnees
    public Connection connexion() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(consts.url,consts.user,consts.passwords);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return con;
    }
    
    public void executeSQL(String sql) throws ClassNotFoundException{
        PreparedStatement stat;
        connexion();
        try {
           stat = con.prepareStatement(sql);
           stat.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    // Fermer la connexion de la base de données
    public void closeConnexion() {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
        
    // fonction pour l'execution des requetes
    public ResultSet executeQuery(String query) throws Exception {
        connexion();
        ResultSet resultSet = null;
        try {
            stat = con.createStatement();
            resultSet = stat.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return resultSet;
    }
    
    // fonction pour l'excecution des requetes update
    public String excecuteUpdate(String query) throws Exception {
        connexion();
        String result = "";
        try {
            stat = con.createStatement();
            stat.executeUpdate(query);
            result = query;
        } catch (SQLException e) {
            result = e.toString();
        }
        return result;
    }
    
    // requete afficher tous 
    public ResultSet querySelectAll(String nomTable) throws Exception {
        SQL = "SELECT* FROM " + nomTable;
        System.out.println(SQL);
        return this.executeQuery(SQL);
    }
    
    //requete afficher tous avec parametre (etat)
    public ResultSet querySelectAll(String nomTable, String etat) throws Exception {
        SQL = "SELECT* FROM " + nomTable + " WHERE " + etat;
        System.out.println(SQL);
        return this.executeQuery(SQL);
    }
}
