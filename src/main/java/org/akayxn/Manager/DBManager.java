package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    // Replace with your PostgreSQL credentials and DB name
    private static final String URL = "jdbc:postgresql://localhost:5432/bankmanagementsystem";
    private static final String USER = "akayxn";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        try {
            // Load PostgreSQL JDBC driver (optional for newer versions)
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
