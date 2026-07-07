package com.imc.modelo;

import java.util.Date;

public class HistorialIMC {

    private int idHistorial;
    private int idUsuario;
    private double peso;
    private double imc;
    private Date fechaMedicion;

    public HistorialIMC() {
    }

    public HistorialIMC(int idHistorial, int idUsuario, double peso, double imc, Date fechaMedicion) {
        this.idHistorial = idHistorial;
        this.idUsuario = idUsuario;
        this.peso = peso;
        this.imc = imc;
        this.fechaMedicion = fechaMedicion;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Date getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(Date fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }
}