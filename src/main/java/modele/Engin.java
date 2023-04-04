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
public class Engin {
    
    private int id;
    private String nom;
    private ArrayList<Situation> lesSituations;
    private TypeEngin leType;
    private Caserne laCaserne;
    
    public Engin(){
        
    }
    
    public Engin(int id, String nom){
        this.id=id;
        this.nom=nom;
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

    public ArrayList<Situation> getLesSituations() {
        return lesSituations;
    }

    public void setLesSituations(ArrayList<Situation> lesSituations) {
        this.lesSituations = lesSituations;
    }

    public TypeEngin getLeType() {
        return leType;
    }

    public void setLeType(TypeEngin leType) {
        this.leType = leType;
    }

    public Caserne getLaCaserne() {
        return laCaserne;
    }

    public void setLaCaserne(Caserne laCaserne) {
        this.laCaserne = laCaserne;
    }

    
}
