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
public class Login {
    private int id;
    private String utilisateur;
    private String mdp;
    private String nom;
    private String prenoms;
    private String tel;
    
    public Login() {
    }

    public Login(int id, String utilisateur, String mdp, String nom, String prenoms, String tel) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.mdp = mdp;
        this.nom = nom;
        this.prenoms = prenoms;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
