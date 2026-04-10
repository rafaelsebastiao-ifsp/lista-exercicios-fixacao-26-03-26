package org.example.ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        ProdutoLista produtoLista = new ProdutoLista();

        produtoLista.adicionar(new Produto("Celular", 2500));

        produtoLista.adicionar(new Produto("Televisão", 15000));

        produtoLista.adicionar(new Produto("Computador", 8500));

        produtoLista.listar();
        System.out.printf("\nQuantidade de produtos cadastrados: %d", produtoLista.getTotalProdutosCadastrados());

        produtoLista.remover("Celular");

        System.out.println("\n\n");

        produtoLista.listar();
        System.out.printf("\nQuantidade de produtos cadastrados: %d", produtoLista.getTotalProdutosCadastrados());





    }
}
