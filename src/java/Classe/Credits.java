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
public class Credits {
    private String code;
    private String designation;
    private int prix;
    private String codeUpdate;

    public Credits() {
    }

    public Credits(String code, String designation, int prix, String codeUpdate) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.codeUpdate = codeUpdate;
    }

    public Credits(String code, String designation, int prix) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getCodeUpdate() {
        return codeUpdate;
    }

    public void setCodeUpdate(String codeUpdate) {
        this.codeUpdate = codeUpdate;
    }
}
