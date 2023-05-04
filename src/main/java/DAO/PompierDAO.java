/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modele.Intervention;
import modele.Pompier;

public class PompierDAO {

    private Connection connexion;
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    public PompierDAO(Connection connexion) {
        this.connexion = connexion;
    }

    public ArrayList<Intervention> getInterventions(int idPompier) throws SQLException {

        ArrayList<Intervention> interventions = new ArrayList<>();
        try
        {
        requete=connection.prepareStatement("SELECT * FROM Intervention, Intervention_pompier, Pompier WHERE IN_ID = IN_ID_1 AND POM_ID = IN_ID = ? ");
  
        requete.setInt(1,idPompier);
        
        rs=requete.executeQuery();
        
       {

        

        while (rs.next()) {

            Intervention intervention = new Intervention();
            intervention.setId(rs.getInt("id"));
            intervention.setLieu(rs.getString("lieu"));
            intervention.setDateHeureAppel(rs.getString("dateHeureAppel"));
            intervention.setDuree(rs.getInt("duree"));
            intervention.setDateHeureArriv(rs.getString("dateHeureArriv"));

            interventions.add(intervention);
        }
    }

    return interventions;
}
}