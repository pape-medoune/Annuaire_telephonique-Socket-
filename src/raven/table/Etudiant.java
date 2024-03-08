/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.table;

/**
 *
 * @author vPro
 */
public class Etudiant {

    private String nom;
    private String prenom;
    private String telephone;
    private String mail;
    private String dateNaissance;

    public Etudiant(String nom, String prenom, String telephone, String mail, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    
}
