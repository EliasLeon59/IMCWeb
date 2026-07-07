package com.imc.dao;

import com.imc.modelo.HistorialIMC;
import com.imc.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class HistorialDAO {


    public boolean guardarHistorial(HistorialIMC historial) {

        String sql = "INSERT INTO historial_imc(usuario_id, peso, imc) VALUES (?, ?, ?)";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, historial.getIdUsuario());
            ps.setDouble(2, historial.getPeso());
            ps.setDouble(3, historial.getImc());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al guardar historial: " + e.getMessage());
            return false;

        }

    }


    public List<HistorialIMC> obtenerHistorial() {

        List<HistorialIMC> lista = new ArrayList<>();

        String sql = "SELECT * FROM historial_imc";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {

                HistorialIMC historial = new HistorialIMC();

                historial.setIdHistorial(rs.getInt("id"));
                historial.setIdUsuario(rs.getInt("usuario_id"));
                historial.setPeso(rs.getDouble("peso"));
                historial.setImc(rs.getDouble("imc"));
                historial.setFechaMedicion(rs.getDate("fecha"));

                lista.add(historial);

            }

        } catch (SQLException e) {

            System.out.println("Error al consultar historial: " + e.getMessage());

        }

        return lista;

    }
    public List<HistorialIMC> obtenerHistorialPorUsuario(int idUsuario) {

    List<HistorialIMC> lista = new ArrayList<>();

    String sql = "SELECT * FROM historial_imc WHERE usuario_id = ?";

    try (
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql)
    ) {

        ps.setInt(1, idUsuario);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            HistorialIMC historial = new HistorialIMC();

            historial.setIdHistorial(rs.getInt("id"));
            historial.setIdUsuario(rs.getInt("usuario_id"));
            historial.setPeso(rs.getDouble("peso"));
            historial.setImc(rs.getDouble("imc"));
            historial.setFechaMedicion(rs.getDate("fecha"));

            lista.add(historial);

        }

    } catch (SQLException e) {

        System.out.println("Error al consultar historial del usuario: " + e.getMessage());

    }

    return lista;

}

}