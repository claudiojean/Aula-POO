package com.mycompany.exercicio1040;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double notaRec;

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

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNotaRec() {
        return notaRec;
    }

    public void setNotaRec(double notaRec) {
        this.notaRec = notaRec;
    }
    
    public double mediaAluno (){
        double media;
        media = ((this.nota1*2)+(this.nota2*3)+(this.nota3*4)+(this.nota4*1))/10;
        return media;
    }
    
    public double mediaFinal (){
        double mediaF;
        mediaF = (mediaAluno()+this.notaRec)/2;
        return mediaF;
    }
}
