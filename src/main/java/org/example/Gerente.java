package org.example;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    public double calcularSalario(int qtdFuncionarios, boolean finalizado) {
        double salario = salarioBase;
        salario += salarioBase * (0.01 * qtdFuncionarios);

        if (finalizado) {
            salario += salarioBase * 0.10;
        }

        return salario;
    }
}
