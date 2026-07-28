package org.example;

public class Projeto {
    private String nome;
    private boolean finalizado;
    private Gerente gerente;
    private Funcionario[] equipe;
    private int qtdFuncionarios = 0;

    public Projeto(String nome, Gerente gerente, int quantidadeFuncionarios) {
        this.nome = nome;
        this.gerente = gerente;
        this.equipe = new Funcionario[quantidadeFuncionarios];
        this.finalizado = false;
    }

    public void adicionarFuncionario(Funcionario funcionario) {

        if (qtdFuncionarios < equipe.length) {
            equipe[qtdFuncionarios] = funcionario;
            qtdFuncionarios++;
        } else {
            System.out.println("Equipe cheia!");
        }
    }


    public void finalizarProjeto() {
        finalizado = true;
    }


    public double calcularCustoTotal() {

        double total = 0;

        total += gerente.calcularSalario(qtdFuncionarios, finalizado);

        for (int i = 0; i < qtdFuncionarios; i++) {
            total += equipe[i].calcularSalario(finalizado);
        }


        return total;
    }
}
