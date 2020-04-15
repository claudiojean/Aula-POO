package com.mycompany.exercicio1012;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double areaTriangulo(){
        double area;
        area = (this.base*this.altura)/2;
        return area;
    }
}
