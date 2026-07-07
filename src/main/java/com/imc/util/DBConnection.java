package com.imc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/imc_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "Imc@2026";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Intentando conectar a MySQL...");

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexion correcta desde GlassFish");

            return con;

        } catch (Exception e) {

            System.out.println("ERROR EN CONEXION:");
            e.printStackTrace();

            return null;
        }
    }
}