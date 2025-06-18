package com.example.vehiculo;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);

        Vehiculo c1 = new Coche("BCD029", "Volkswagen", 4);
        Vehiculo c2 = new Coche("PKL238", "Tesla", 2);
        Vehiculo m3 = new Motocicleta("Moto 1", "Yamaha", true);
        Vehiculo m4 = new Motocicleta("Moto 2", "Suzuki", false);

        garage.estacionar(c1);
        garage.estacionar(c2);
        garage.estacionar(m3);
        garage.estacionar(m4);

        System.out.println("Vehiculo en el garage: " + garage.contarVehiculos());
        garage.retirar("BCD029");

        System.out.println("Vehiculos tras retirar uno: " + garage.contarVehiculos());
    }
}