package org.example.ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        exibirTodos(numeros);

        List<String>nomes = new ArrayList<>();

        nomes.add("Rafael");
        nomes.add("Juca");
        nomes.add("Astolfo");

        exibirTodos(nomes);

    }

    public static <T> void exibirTodos(List<T> listaGenerica){
        for(Object o : listaGenerica){
            System.out.println(o);
        }

    }

}
