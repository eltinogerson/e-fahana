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
public class Caisses {
    private int numCaisse;
    private String datePayement;
    private int montant;
    private int numFacture;

    public Caisses() {
    }

    public Caisses(int numCaisse, String datePayement, int montant, int numFacture) {
        this.numCaisse = numCaisse;
        this.datePayement = datePayement;
        this.montant = montant;
        this.numFacture = numFacture;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    public String getDatePayement() {
        return datePayement;
    }

    public void setDatePayement(String datePayement) {
        this.datePayement = datePayement;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(int numFacture) {
        this.numFacture = numFacture;
    }
}
