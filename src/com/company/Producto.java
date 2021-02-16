package com.company;

import java.text.DecimalFormat;

public class Producto {
    private String nombre;
    private int cantidad;
    private float precio;

    public Producto(int n) {
        this.nombre = "Producto" + n;
        cantidad = (int) (Math.random() * 10 + 1);
        precio = (float) (Math.random() * 10 );

    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void imprimir (){
        DecimalFormat df= new DecimalFormat("#.##");
        System.out.print(nombre);
        System.out.print("\t"+cantidad);
        System.out.print("\t"+ df.format(precio));
        System.out.print("\t"+ df.format(total()));
    }
    public float total(){
      return  precio*cantidad;
    }
}
