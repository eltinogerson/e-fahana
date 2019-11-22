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
public class Factures {
    private int numero;
    private String date;
    private int numCli;

    public Factures() {
    }

    public Factures(int numero, String date) {
        this.numero = numero;
        this.date = date;
    }

    public Factures(int numero, String date, int numCli) {
        this.numero = numero;
        this.date = date;
        this.numCli = numCli;
    }

    public int getNumCli() {
        return numCli;
    }

    public void setNumCli(int numCli) {
        this.numCli = numCli;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}
