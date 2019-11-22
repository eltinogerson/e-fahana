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
public class Stock {
    private String code;
    private String design;
    private int prix;
    private int qte;

    public Stock() {
    }

    public Stock(String code, String design, int prix, int qte) {
        this.code = code;
        this.design = design;
        this.prix = prix;
        this.qte = qte;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
    
}
