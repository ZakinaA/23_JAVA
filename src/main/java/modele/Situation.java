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
public class Situation {
    
    private int id;
    private String libelle;
    private ArrayList<Intervention> lesInterventions;
    private ArrayList<Engin> lesEngins;
    
    public Situation(){
        
    }
    
    public Situation(int id, String libelle){
        this.id=id;
        this.libelle=libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList<Intervention> getLesInterventions() {
        return lesInterventions;
    }

    public void setLesInterventions(ArrayList<Intervention> lesInterventions) {
        this.lesInterventions = lesInterventions;
    }

    public ArrayList<Engin> getLesEngins() {
        return lesEngins;
    }

    public void setLesEngins(ArrayList<Engin> lesEngins) {
        this.lesEngins = lesEngins;
    }

    
}
