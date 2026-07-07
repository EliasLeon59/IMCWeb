package com.imc.util;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("CONEXIÓN EXITOSA ✔");
        } else {
            System.out.println("ERROR DE CONEXIÓN ❌");
        }
    }
}