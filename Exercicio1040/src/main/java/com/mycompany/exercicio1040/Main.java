package com.mycompany.exercicio1040;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
       Aluno alu = new Aluno();
       
       System.out.println("Informe as notas do aluno respectivamente: ");
       Scanner ler = new Scanner(System.in);
       alu.setNota1(ler.nextDouble());
       alu.setNota2(ler.nextDouble());
       alu.setNota3(ler.nextDouble());
       alu.setNota4(ler.nextDouble());
       System.out.println("Media: "+alu.mediaAluno());
       if(alu.mediaAluno()>=7){
           System.out.println("Aluno aprovado.");
       } else if(alu.mediaAluno()<5){
           System.out.println("Aluno reprovado.");     
       } else{
           System.out.println("Aluno em exame. Informe a nota de recuperação:");
           alu.setNotaRec(ler.nextDouble());
           if(alu.mediaFinal()>=5){
               System.out.println("Aluno aprovado");
               System.out.println("Media final: "+alu.mediaFinal());
           }else{
               System.out.println("Aluno reprovado"); 
               System.out.println("Media final: "+alu.mediaFinal());
           }
       }
       
       
       
       
       
    }  
}
