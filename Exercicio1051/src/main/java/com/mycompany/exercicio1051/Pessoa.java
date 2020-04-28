package com.mycompany.exercicio1051;

public class Pessoa {
    private double salario;

    public Pessoa() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calculaImposto(){
        double imposto;
        if(this.salario<=2000){
            imposto=0;
        }else if (this.salario<=3000){
            imposto=0.08*(this.salario-2000);
        }else if (this.salario<=4500){
            imposto=(0.18*(this.salario-3000))+80;
        }else {
            imposto=0.28*(this.salario-4500)+350;
        }    
        return imposto;
    }
    
}
