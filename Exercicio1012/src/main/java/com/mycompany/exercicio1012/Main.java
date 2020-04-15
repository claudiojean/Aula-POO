package com.mycompany.exercicio1012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double A, B, C;
        Triangulo tri = new Triangulo();
        Circulo cir = new Circulo();
        Trapezio tra = new Trapezio();
        Retangulo ret = new Retangulo();
        Quadrado qua = new Quadrado();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor de A, B e C");
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        tri.setBase(A);
        tri.setAltura(C);
        cir.setRaio(C);
        ret.setAltura(A);
        ret.setBase(B);
        tra.setBase1(A);
        tra.setBase2(B);
        tra.setAltura(C);
        qua.setBase(B);
        System.out.println("TRIANGULO: "+ tri.areaTriangulo());
        System.out.println("CIRCULO: "+ cir.areaCirculo());
        System.out.println("TRAPEZIO: "+ tra.areaTrapezio());
        System.out.println("QUADRADO: "+ qua.areaQuadrado());
        System.out.println("RETANGULO: "+ ret.areaRetangulo());
    }
    
}
