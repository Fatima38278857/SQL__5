package Proekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {

    public static Connection getConnection() throws SQLException {
        final String user = "postgres";
        final String password = "RAMADAN38278857";
        final String url = "jdbc:postgresql://localhost:5432/skypro2";
        return DriverManager.getConnection(url, user, password);
    }
}
