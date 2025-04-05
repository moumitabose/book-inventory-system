package com.example.book_inventory_system.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresTest {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/book_inventory";
        String user = "postgres";
        String password = "pg260623!";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
