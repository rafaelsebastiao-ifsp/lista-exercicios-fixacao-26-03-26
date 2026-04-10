package org.example.ex5;

import java.util.ArrayList;

public class ProdutoLista {
    private ArrayList<Produto>listaPrudutos;

    private int totalProdutosCadastrados;

    public ProdutoLista(){
        this.listaPrudutos = new ArrayList<>();
        this.totalProdutosCadastrados=0;
    }

    public boolean estaVazia(){
        return totalProdutosCadastrados == 0;
    }

    public Produto buscarProdutoporNome(String nomeProduto){
        int inicio=0, fim=listaPrudutos.toArray().length - 1, meio=0;
        boolean foiEncontrado=false;

        Produto produtoBuscado = null;


        while(inicio < fim && !foiEncontrado){
            meio = (inicio + fim) / 2;

            produtoBuscado = listaPrudutos.get(meio);

            if (produtoBuscado.getNome().equals(nomeProduto)){
                foiEncontrado = true;

            }else if (produtoBuscado.getNome().compareTo(nomeProduto) > 0){
                fim = fim -1;

            }else{
                inicio = inicio + 1;
            }
        }

        return produtoBuscado;

    }
    public void adicionar(Produto p){
        listaPrudutos.add(p);
        totalProdutosCadastrados += 1;
    }

    public void listar(){
        if (estaVazia()){
            System.out.println("Lista de produtos vazia!");
            return;
        }

        for(Produto p : listaPrudutos){
            System.out.println(p);
        }
    }

    public void remover(String nome){
        if (estaVazia()){
            System.out.println("Lista de produtos vazia!");
            return;
        }

        Produto produtoRemovido = null;

        int i=0, inicio, fim;

        produtoRemovido = buscarProdutoporNome(nome);

        if (produtoRemovido == null){
            throw new RuntimeException(String.format("Produto: %s, não encontrado!", nome) );

        }

        listaPrudutos.remove(produtoRemovido);

        System.out.printf("\nProduto removido: %s", produtoRemovido.getNome());
        totalProdutosCadastrados -= 1;

    }

    @Override
    public String toString() {
        return "ProdutoLista{" +
                "listaPrudutos=" + listaPrudutos +
                ", totalProdutosCadastrados=" + totalProdutosCadastrados +
                '}';
    }



    //getters
    public int getTotalProdutosCadastrados() {
        return totalProdutosCadastrados;
    }
}
