/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classe;

/**
 *
 * @author Gerson Elvestino
 */
public class Commandes {
    private int num;
    private String date;
    private int quantite;
    private int montant;
    private int numClient;
    private String NumFacture;
    private String CodeCredit;
    private int idVendeur;

    public Commandes() {
    }

    public Commandes(int num, String date, int quantite, int montant, int numClient, String NumFacture, String CodeCredit, int idVendeur) {
        this.num = num;
        this.date = date;
        this.quantite = quantite;
        this.montant = montant;
        this.numClient = numClient;
        this.NumFacture = NumFacture;
        this.CodeCredit = CodeCredit;
        this.idVendeur = idVendeur;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getCodeCredit() {
        return CodeCredit;
    }

    public void setCodeCredit(String CodeCredit) {
        this.CodeCredit = CodeCredit;
    }

    public String getNumFacture() {
        return NumFacture;
    }

    public void setNumFacture(String NumFacture) {
        this.NumFacture = NumFacture;
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }
}
