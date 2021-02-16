package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    static ArrayList<Producto> listaCompra = new ArrayList<>();

    public static void main(String[] args) {
        hacerCompra();
        mostrarTicket();
    }

    private static void mostrarTicket() {
        DecimalFormat df= new DecimalFormat("#.##");
        float total = 0;
        System.out.println("Nombre \t Cantidad \t Precio \t TOTAL");
        for (Producto p : listaCompra) {
            p.imprimir();
            total += p.total();
        }
        System.out.println("El percio final es "+df.format(total));
    }

    private static void hacerCompra() {
        int numProductos = (int) (Math.random() * 8 + 1);

        for (int i = 0; i < numProductos; i++) {
            listaCompra.add(new Producto(i + 1));
        }
    }
}
