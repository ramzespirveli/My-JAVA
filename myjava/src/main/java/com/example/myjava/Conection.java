package com.example.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    private static final String USER = "root";
    private static  final int PORT = 3308;
    private static final String DATABASE_NAME = "student";
    private static  final String PASSWORD = "12345678";
    private  static final  String URL = "jdbc:mysql://localhost:" + PORT + "/" + DATABASE_NAME ;

    private Connection conection;
    public Conection(){
        try {
            conection =  DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConection() {
        return conection;
    }
}
