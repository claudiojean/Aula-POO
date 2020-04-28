package com.mycompany.exercicio1173;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,temp;
        int[]v= new int[10];
        Vetor vet = new Vetor();
        Scanner ler = new Scanner(System.in);
 
        System.out.println("Informe o número: ");
        temp=ler.nextInt();
        while(temp>50){
            System.out.println("Número inválido");
            System.out.println("Informe um novo número: ");
            temp=ler.nextInt();
        }
        vet.setNumero(temp);
        for(i=0;i<10;i++){
            v[i]=vet.getNumero();
            System.out.println("N["+i+"] = "+v[i]);
            vet.setNumero(vet.calculaDobro());
        }
        
        
        
        
        
    }
}
