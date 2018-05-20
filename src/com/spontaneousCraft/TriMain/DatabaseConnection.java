package com.spontaneousCraft.TriMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {

    static String user = "mc6135";
    static String pass = "7e5e5d6c80";
    static String url = "jdbc:mysql://localhost:3306/mc6135";

    public static void SQLFunction() throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, pass);
        PreparedStatement sampleQueryStatement = conn.prepareStatement("`Votes`.*, `Websites`.*");
        sampleQueryStatement.executeUpdate();
        sampleQueryStatement.close();
        conn.close();
    }

}
