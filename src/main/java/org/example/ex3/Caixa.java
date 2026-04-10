package org.example.ex3;

public class Caixa<T>{
    private T valor;


    public void guardar(T valor){
        this.valor = valor;
    }

    public T obter(){
        return valor;
    }

}