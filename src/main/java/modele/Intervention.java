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
public class Intervention {
    
    private int id;
    private String lieu;
    private String dateHeureAppel;
    private int duree;
    private String dateHeureArriv;
    private ArrayList<Pompier> lesPompiers;
    private Situation laSituation;
    
    public Intervention(){
        
    }
    
    public Intervention(int id, String lieu, String dateHeureAppel, int duree, String dateHeureArriv){
        this.id=id;
        this.lieu=lieu;
        this.dateHeureAppel=dateHeureAppel;
        this.duree=duree;
        this.dateHeureArriv=dateHeureArriv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDateHeureAppel() {
        return dateHeureAppel;
    }

    public void setDateHeureAppel(String dateHeureAppel) {
        this.dateHeureAppel = dateHeureAppel;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDateHeureArriv() {
        return dateHeureArriv;
    }

    public void setDateHeureArriv(String dateHeureArriv) {
        this.dateHeureArriv = dateHeureArriv;
    }

    public ArrayList<Pompier> getLesPompiers() {
        return lesPompiers;
    }

    public void setLesPompiers(ArrayList<Pompier> lesPompiers) {
        this.lesPompiers = lesPompiers;
    }

    public Situation getLaSituation() {
        return laSituation;
    }

    public void setLaSituation(Situation laSituation) {
        this.laSituation = laSituation;
    }

    
}
