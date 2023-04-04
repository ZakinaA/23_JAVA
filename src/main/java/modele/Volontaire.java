/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author thomas.bouquet
 */
public class Volontaire extends Pompier{
    
    private String profession;
    private String lieu;
    
    public Volontaire(){
        super();
    }
    
    public Volontaire(String profession,String lieu){
        super();
        this.profession=profession;
        this.lieu=lieu;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    
    
}
