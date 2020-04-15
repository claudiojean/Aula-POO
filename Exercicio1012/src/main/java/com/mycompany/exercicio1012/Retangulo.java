package com.mycompany.exercicio1012;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
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
    
    public double areaRetangulo(){
        double area;
        area = (this.altura*this.base);
        return area;
    }
}
