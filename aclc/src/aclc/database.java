package aclc;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class database {
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "";

    private Connection connection;

    public database() {
        try {
            
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle connection error
        }
    }

    public Connection getConnection() {
        return connection;
    }
        public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle error while closing connection
            }
        }
    }

    
}
