package com.example.empleado;

public class EmpleadoTiempoCompleto extends Empleado{
    private String beneficios;
    
    public EmpleadoTiempoCompleto(String id, String nombre, double SalarioBase, 
     String beneficios) {
        super(id, nombre, SalarioBase);
        this.beneficios = beneficios;
    }
    
    @Override
    public double calcularSalario() {
        double getSalarioBase;
        return getSalarioBase();

    }
}
