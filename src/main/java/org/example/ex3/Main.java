package org.example.ex3;

public class Main {
    public static void main(String[] args) {
        Caixa<String> caixaDeStrings = new Caixa();

        Caixa<Integer>caixaDeNumeros = new Caixa();

        caixaDeStrings.guardar("Celular");

        System.out.println(caixaDeStrings.obter());

        caixaDeNumeros.guardar(5);

        System.out.println(caixaDeNumeros.obter());

    }



}
