package com.mycompany.exercicio1012;

public class Trapezio {
    private double base1;
    private double base2;
    private double altura;

    public Trapezio() {
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double areaTrapezio(){
        double area;
        area = (this.base1+this.base2)/2*this.altura;
        return area;
    }
}
