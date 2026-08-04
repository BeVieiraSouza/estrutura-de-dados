package org.example.array.testes;

public class ex1{
    static void main(){
        VetorEstatico vetor = new VetorEstatico(3);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("E");
        vetor.inserir("F");

        vetor.imprimir();
        System.out.println();

        System.out.println(vetor.obterTamanho());

        vetor.removerFinal();

        vetor.imprimir();
        System.out.println();

        System.out.println(vetor.obterTamanho());
    }
}
