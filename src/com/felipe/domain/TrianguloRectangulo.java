package com.felipe.domain;

public class TrianguloRectangulo extends Triangulo{

    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularAreaTriangulo() {
        return (base * altura)/2;
    }
}