package com.felipe.domain;

public class TrianguloEquilatero extends Triangulo {

    private double alturaEquilatero;
    private double baseEquilatero;

    public TrianguloEquilatero(double alturaEquilatero, double baseEquilatero) {
        this.alturaEquilatero = alturaEquilatero;
        this.baseEquilatero = baseEquilatero;
    }

    @Override
    public double calcularAreaTriangulo() {
        return (alturaEquilatero * baseEquilatero)/2;
    }
}
