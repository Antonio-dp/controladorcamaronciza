package org.example;

import commodelo.FachadaPersistenciaPedido;
import dominio.Pedido;

public class Main {
    public static void main(String[] args) {
        FachadaPersistenciaPedido fpp = new FachadaPersistenciaPedido();
        Pedido p = new Pedido(1);
        System.out.println(fpp.consultarPedido(p).getId());
    }
}