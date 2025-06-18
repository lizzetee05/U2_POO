package com.example.vehiculo;

public class Motocicleta extends Vehiculo {
    private boolean tieneCaja;

    public Motocicleta(String placa, String marca, boolean tieneCaja) {
        super(placa, marca);
        this.tieneCaja = tieneCaja;
    }

    public boolean tieneCaja() {
        return tieneCaja;
    }
}