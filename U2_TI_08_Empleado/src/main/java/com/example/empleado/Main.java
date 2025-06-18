package com.example.empleado;

public class Main {
    public static void main(String[] args) {
        Empleado empTiempoCompleto = new EmpleadoTiempoCompleto("L527", "Lizzete", 10000.0, "Seguro médico");
        Empleado empPorHoras = new EmpleadoPorHoras("V280", "Viviana", 100.0, 40);

        System.out.println("Salario Empleado Tiempo Completo: $" + empTiempoCompleto.calcularSalario());
        System.out.println("Salario Empleado por Horas: $" + empPorHoras.calcularSalario());
    }
}