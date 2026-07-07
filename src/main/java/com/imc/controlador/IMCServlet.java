package com.imc.controlador;

import com.imc.dao.HistorialDAO;
import com.imc.modelo.HistorialIMC;
import com.imc.modelo.IMC;
import com.imc.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "IMCServlet", urlPatterns = {"/IMCServlet"})
public class IMCServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        double peso = Double.parseDouble(request.getParameter("peso"));
        double estatura = Double.parseDouble(request.getParameter("estatura"));

        // Validación de peso
if (peso <= 0) {

    response.getWriter().println("Error: El peso debe ser mayor a 0 kg.");
    return;

}

        IMC calculadora = new IMC();

        double resultadoIMC = calculadora.calcularIMC(peso, estatura);

        String clasificacion = calculadora.clasificarIMC(resultadoIMC);


        HttpSession session = request.getSession();

        Usuario usuario = (Usuario) session.getAttribute("usuario");


        HistorialIMC historial = new HistorialIMC();

        historial.setIdUsuario(usuario.getIdUsuario());
        historial.setPeso(peso);
        historial.setImc(resultadoIMC);


        HistorialDAO dao = new HistorialDAO();

dao.guardarHistorial(historial);


java.util.List<HistorialIMC> listaHistorial =
        dao.obtenerHistorialPorUsuario(usuario.getIdUsuario());


request.setAttribute("imc", resultadoIMC);
request.setAttribute("clasificacion", clasificacion);
request.setAttribute("historial", listaHistorial);


request.getRequestDispatcher("historial.jsp").forward(request, response);

    }

}