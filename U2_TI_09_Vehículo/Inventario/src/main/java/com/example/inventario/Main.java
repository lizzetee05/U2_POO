package com.example.inventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("A1", "Manzanas", 10);
        Producto p2 = new Producto("B2", "Naranjas", 20);
        Producto p3 = new Producto("C3", "Plátanos", 15);
        Producto p4 = new Producto("D4", "Peras", 12);

        System.out.println("Agregar p1: " + inventario.agregarProducto(p1));
        System.out.println("Total ítems: " + inventario.totalItems());

        System.out.println("Agregar p2: " + inventario.agregarProducto(p2));
        System.out.println("Total ítems: " + inventario.totalItems());

        System.out.println("Agregar p3: " + inventario.agregarProducto(p3));
        System.out.println("Total ítems: " + inventario.totalItems());

        System.out.println("agregar p4: " + inventario.agregarProducto(p4));
        System.out.println("Total ítems: " + inventario.totalItems());

        System.out.println("Buscar B2: " + (inventario.buscar("B2") != null));
        System.out.println("Buscar Z9: " + (inventario.buscar("Z9") != null));

        System.out.println("Eliminar B2: " + inventario.eliminarProducto("B2"));
        System.out.println("Total ítems: " + inventario.totalItems());

        System.out.println("Agregar p4: " + inventario.agregarProducto(p4));
        System.out.println("Total ítems: " + inventario.totalItems());
    }
}