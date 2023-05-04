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

    public PompierDAO(Connection connexion) {
        this.connexion = connexion;
    }

    public ArrayList<Intervention> getInterventions(Pompier pompier) throws SQLException {

        ArrayList<Intervention> interventions = new ArrayList<>();

        String requete = "SELECT * FROM intervention WHERE id IN (SELECT INT_ID FROM Intervention_pompier WHERE IN_ID_1 = ?)";

        try (PreparedStatement statement = connexion.prepareStatement(requete)) {

            statement.setInt(1, pompier.getId());
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                Intervention intervention = new Intervention();
                intervention.setId(result.getInt("id"));
                intervention.setLieu(result.getString("lieu"));
                intervention.setDateHeureAppel(result.getString("dateHeureAppel"));
                intervention.setDuree(result.getInt("duree"));
                intervention.setDateHeureArriv(result.getString("dateHeureArriv"));

                interventions.add(intervention);
            }
        }

        return interventions;
    }
}
