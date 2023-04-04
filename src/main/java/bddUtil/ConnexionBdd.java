/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBdd {

    public static void main(String[] args) {

        Connection conn = null;
        String url = "jdbc:mysql://172.20.177.77/23JAVA";
        String user = "ADM_23JAVA";
        String password = "mpAdm23java";

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connecté à la base");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Deconnécté de la base");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}