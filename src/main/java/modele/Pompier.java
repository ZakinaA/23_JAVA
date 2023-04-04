/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import java.util.ArrayList;
/**
 *
 * @author thomas.bouquet
 */
public class Pompier {
    
        private int id;
        private String nom ;
        private String dateNaissance ;
	private int numeroBip ;
	private String prenom ;
        private ArrayList<Fonction> lesFonctions;
        private Caserne laCaserne ;
        private Grade leGrade;
        private ArrayList<Intervention> lesInterventions;
        
        public Pompier(){
            
        }
        
        public Pompier(int id,String nom,String dateNaissance,int numeroBip,String prenom){
            this.id = id;
            this.nom = nom;
            this.dateNaissance = dateNaissance;
            this.numeroBip = numeroBip;
            this.prenom = prenom;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getNumeroBip() {
        return numeroBip;
    }

    public void setNumeroBip(int numeroBip) {
        this.numeroBip = numeroBip;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Fonction> getLesFonctions() {
        return lesFonctions;
    }

    public void setLesFonctions(ArrayList<Fonction> lesFonctions) {
        this.lesFonctions = lesFonctions;
    }

    public Caserne getLaCaserne() {
        return laCaserne;
    }

    public void setLaCaserne(Caserne laCaserne) {
        this.laCaserne = laCaserne;
    }

    public Grade getLeGrade() {
        return leGrade;
    }

    public void setLeGrade(Grade leGrade) {
        this.leGrade = leGrade;
    }

    public ArrayList<Intervention> getLesInterventions() {
        return lesInterventions;
    }

    public void setLesInterventions(ArrayList<Intervention> lesInterventions) {
        this.lesInterventions = lesInterventions;
    }

    
}

