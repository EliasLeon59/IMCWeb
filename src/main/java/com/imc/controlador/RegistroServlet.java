package com.imc.controlador;

import com.imc.dao.UsuarioDAO;
import com.imc.modelo.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RegistroServlet", urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String sexo = request.getParameter("sexo");
        double estatura = Double.parseDouble(request.getParameter("estatura"));

        Usuario nuevoUsuario = new Usuario();

        nuevoUsuario.setNombreCompleto(nombre);
        nuevoUsuario.setNombreUsuario(usuario);
        nuevoUsuario.setPassword(password);
        nuevoUsuario.setEdad(edad);
        nuevoUsuario.setSexo(sexo);
        nuevoUsuario.setEstatura(estatura);
        
        // Validaciones
if (edad < 15) {

    response.getWriter().println("Error: La edad mínima permitida es de 15 años.");
    return;

}

if (estatura < 1.0 || estatura > 2.5) {

    response.getWriter().println("Error: La estatura debe estar entre 1.00 y 2.50 metros.");
    return;

}

        UsuarioDAO dao = new UsuarioDAO();

        boolean registrado = dao.registrarUsuario(nuevoUsuario);

        if (registrado) {

            response.sendRedirect("login.jsp");

        } else {

            response.getWriter().println("Error al registrar usuario");

        }
    }
}