package org.example;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(boolean finalizado) {
        double salario = salarioBase;

        if (finalizado) {
            salario += salarioBase * 0.10;
        }

        return salario;
    }
}
