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
public class Caserne {
    
    private int id;
    private String nom;
    private String rue;
    private String corpos;
    private String ville;
    private ArrayList<Pompier> lesPompiers;
    private ArrayList<Engin> lesEngins;
    
    public Caserne(){
    }
    
    public Caserne(int id, String nom, String rue, String corpos, String ville){
        this.id=id;
        this.nom=nom;
        this.rue=rue;
        this.corpos=corpos;
        this.ville=ville;
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

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCorpos() {
        return corpos;
    }

    public void setCorpos(String corpos) {
        this.corpos = corpos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public ArrayList<Pompier> getLesPompiers() {
        return lesPompiers;
    }

    public void setLesPompiers(ArrayList<Pompier> lesPompiers) {
        this.lesPompiers = lesPompiers;
    }

    public ArrayList<Engin> getLesEngins() {
        return lesEngins;
    }

    public void setLesEngins(ArrayList<Engin> lesEngins) {
        this.lesEngins = lesEngins;
    }

    
}
