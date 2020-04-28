package com.mycompany.exercicio1051;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pes = new Pessoa();
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o salário da pessoa: ");
        pes.setSalario(ler.nextDouble());
        if(pes.calculaImposto()==0){
            System.out.println("Isento");
        }else
            System.out.println("R$ "+pes.calculaImposto());
    }
}
