package com.example.empleado;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;

    public EmpleadoPorHoras(String id, String nombre,
   double SalarioBase, int horasTrabajadas) {
        super(id, nombre, SalarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * horasTrabajadas;
    }
}
