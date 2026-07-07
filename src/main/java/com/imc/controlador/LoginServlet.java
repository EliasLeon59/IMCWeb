package com.imc.controlador;

import com.imc.dao.UsuarioDAO;
import com.imc.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        UsuarioDAO dao = new UsuarioDAO();

        Usuario user = dao.login(usuario, password);

        if (user != null) {

            HttpSession session = request.getSession();

            session.setAttribute("usuario", user);

            response.sendRedirect("calcularIMC.jsp");

        } else {

            response.getWriter().println("Usuario o contraseña incorrectos");

        }
    }
}