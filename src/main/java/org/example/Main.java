package org.example;

    public class Main {

        public static void main(String[] args) {

            // Criando o gerente
            Gerente gerente = new Gerente("Carlos", 5000);


            // Criando o projeto
            Projeto projeto = new Projeto(
                    "Sistema de Vendas",
                    gerente,
                    3
            );


            // Criando funcionários
            Funcionario funcionario1 = new Funcionario("Ana", 3000);
            Funcionario funcionario2 = new Funcionario("João", 3500);
            Funcionario funcionario3 = new Funcionario("Maria", 2800);


            // Adicionando funcionários ao projeto
            projeto.adicionarFuncionario(funcionario1);
            projeto.adicionarFuncionario(funcionario2);
            projeto.adicionarFuncionario(funcionario3);


            // Calculando custo antes da finalização
            System.out.println("Custo do projeto antes de finalizar:");
            System.out.println("R$ " + projeto.calcularCustoTotal());


            // Finalizando projeto
            projeto.finalizarProjeto();


            // Calculando custo depois da finalização
            System.out.println("\nCusto do projeto após finalizar:");
            System.out.println("R$ " + projeto.calcularCustoTotal());

        }
    }

