package com.felipe.domain;

public class TrianguloIsosceles extends Triangulo {

    private double alturaIsosceles;
    private double baseIsosceles;

    public TrianguloIsosceles(double alturaIsosceles, double baseIsosceles) {
        this.alturaIsosceles = alturaIsosceles;
        this.baseIsosceles = baseIsosceles;
    }

    @Override
    public double calcularAreaTriangulo() {
        return (baseIsosceles * alturaIsosceles)/2;

    }
}
