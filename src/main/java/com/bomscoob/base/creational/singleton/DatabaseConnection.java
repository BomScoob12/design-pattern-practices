package com.bomscoob.base.creational.singleton;

import java.sql.*;

// singleton - handle only db connection
public class DatabaseConnection {
    // just testing user and password
    private static final String URL = "jdbc:mysql://localhost:3306/sample_db";
    private static final String USERNAME = "bomscoob";
    private static final String PASSWORD = "password4me";

    private static Connection connection;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        }

        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }

}
