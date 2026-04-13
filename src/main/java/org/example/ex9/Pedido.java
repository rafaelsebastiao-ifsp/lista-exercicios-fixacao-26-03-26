package org.example.ex9;

public class Pedido {
    private int codigo;
    private double valor;

    public Pedido(int codigo, double valor){
        this.codigo=codigo;
        this.valor=valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo=" + codigo +
                ", valor=" + valor +
                '}';
    }
}
