package com.mycompany.exercicio1012;

public class Quadrado {
    private double base;

    public Quadrado() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double areaQuadrado(){
        double area;
        area = Math.pow(this.base,2);
        return area;
    }
}
