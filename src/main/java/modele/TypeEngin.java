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
public class TypeEngin {
    
    private int id;
    private String type;
    private ArrayList<Engin> lesEngins;
    
    public TypeEngin(){
        
    }
    
    public TypeEngin(int id, String type){
        this.id=id;
        this.type=type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Engin> getLesEngins() {
        return lesEngins;
    }

    public void setLesEngins(ArrayList<Engin> lesEngins) {
        this.lesEngins = lesEngins;
    }

    
}
