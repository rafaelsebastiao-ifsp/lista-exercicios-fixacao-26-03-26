package org.example.ex9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String [] args) {

        List<Integer>numeros = new ArrayList<>(List.of(1, 2, 3) );
        List<Pedido>listaPedidos = new ArrayList<>();

        listaPedidos.add(new Pedido(12345, 2500.50) );

        listaPedidos.add(new Pedido(12346, 5432.87) );

        listaPedidos.add(new Pedido(12345, 1250.00) );


        System.out.println("============================");
        System.out.println("Informações do maior pedido:");
        System.out.println("============================\n");

        Pedido maiorPedido = maiorPedido(listaPedidos);

        System.out.printf("Pedido %s:\n", maiorPedido.getCodigo());
        System.out.printf("Valor: R$ %.2f\n", maiorPedido.getValor());

    }

    public static Pedido maiorPedido(List<Pedido> listaPedidos) {
        List<Double> valoresDosPedidos = new ArrayList<>();

        for (Pedido p : listaPedidos) {
            valoresDosPedidos.add(p.getValor());
        }

        double maiorPedido = Collections.max(valoresDosPedidos);


        for (Pedido pedido : listaPedidos) {
            if (pedido.getValor() == maiorPedido) {
                return pedido;
            }
        }

        return null;
    }
}
