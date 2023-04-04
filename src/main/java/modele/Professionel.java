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
public class Professionel extends Pompier{
    
    private int indiceTraitement;
    private String dateObtentionIndice;
    
    public Professionel(){
        super();
    }
    
    public Professionel(int indiceTraitement,String dateObtentionIndice){
        super();
        this.indiceTraitement=indiceTraitement;
        this.dateObtentionIndice=dateObtentionIndice;
    }

    public int getIndiceTraitement() {
        return indiceTraitement;
    }

    public void setIndiceTraitement(int indiceTraitement) {
        this.indiceTraitement = indiceTraitement;
    }

    public String getDateObtentionIndice() {
        return dateObtentionIndice;
    }

    public void setDateObtentionIndice(String dateObtentionIndice) {
        this.dateObtentionIndice = dateObtentionIndice;
    }
            
    
}
