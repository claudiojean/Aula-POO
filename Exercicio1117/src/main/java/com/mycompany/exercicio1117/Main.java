package com.mycompany.exercicio1117;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double temp;
        Aluno alu = new Aluno();
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        temp=ler.nextDouble();
        while(temp<0 || temp>10){
            System.out.println("nota invalida");
            System.out.println("Informe a primeira nota: ");
            temp=ler.nextDouble();
        }
        alu.setNota1(temp);
        System.out.println("Informe a segunda nota: ");
        temp=ler.nextDouble();
        while(temp<0 || temp>10){
            System.out.println("nota invalida");
            System.out.println("Informe a segunda nota: ");
            temp=ler.nextDouble();
        }
        alu.setNota2(temp);
        System.out.println("Média: "+alu.calculaMedia());
    }
}
