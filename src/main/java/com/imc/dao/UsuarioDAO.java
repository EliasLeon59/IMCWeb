package com.imc.dao;

import com.imc.modelo.Usuario;
import com.imc.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean registrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO usuarios(nombre_completo, usuario, password, edad, sexo, estatura) VALUES (?, ?, ?, ?, ?, ?)";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, usuario.getNombreCompleto());
            ps.setString(2, usuario.getNombreUsuario());
            ps.setString(3, usuario.getPassword());
            ps.setInt(4, usuario.getEdad());
            ps.setString(5, usuario.getSexo());
            ps.setDouble(6, usuario.getEstatura());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;

        }

    }


    public Usuario login(String usuario, String password) {

        Usuario user = null;

        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND password = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                user = new Usuario();

                user.setIdUsuario(rs.getInt("id"));
                user.setNombreCompleto(rs.getString("nombre_completo"));
                user.setNombreUsuario(rs.getString("usuario"));
                user.setPassword(rs.getString("password"));
                user.setEdad(rs.getInt("edad"));
                user.setSexo(rs.getString("sexo"));
                user.setEstatura(rs.getDouble("estatura"));

            }

        } catch (SQLException e) {

            System.out.println("Error en login: " + e.getMessage());

        }

        return user;
    }

}