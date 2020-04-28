package com.mycompany.exercicio1173;
public class Vetor {
    private int numero;

    public Vetor() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int calculaDobro(){
        int dobro;
        dobro = this.numero*2;
        return dobro;
    }
   
}
