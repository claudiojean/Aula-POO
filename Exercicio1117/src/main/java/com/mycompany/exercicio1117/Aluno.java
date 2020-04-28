package com.mycompany.exercicio1117;

public class Aluno {
    private double nota1;
    private double nota2;

    public Aluno() {
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double calculaMedia(){
        double media;
        media = (this.nota1+this.nota2)/2;
        return media;
    }
}
