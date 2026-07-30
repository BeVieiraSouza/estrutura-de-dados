package org.example.array.testes;

public class ex1{
    static void main(){
        VetorEstatico vetor = new VetorEstatico(3);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");

        vetor.imprimir();
        System.out.println();

        System.out.println(vetor.obterTamanho());

        vetor.removerFinal();

        vetor.imprimir();
        System.out.println();

        System.out.println(vetor.obterTamanho());
    }
}
