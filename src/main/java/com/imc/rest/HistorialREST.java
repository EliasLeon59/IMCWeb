package com.imc.rest;

import com.imc.dao.HistorialDAO;
import com.imc.modelo.HistorialIMC;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("historial")
public class HistorialREST {


    @GET
    @Path("/{idUsuario}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<HistorialIMC> obtenerHistorialPorUsuario(
            @PathParam("idUsuario") int idUsuario) {

        HistorialDAO dao = new HistorialDAO();

        return dao.obtenerHistorialPorUsuario(idUsuario);

    }


}