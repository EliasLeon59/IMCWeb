package com.imc.modelo;

public class IMC {

    public IMC() {
    }

    public double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }

    public String clasificarIMC(double imc) {

        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }

    }
}