package com.example.empleado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Empleado {
    private String id;
    private String nombre;
    private double SalarioBase;

    public Empleado(String id, String nombre, double SalarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.SalarioBase = SalarioBase;
    }
    double getSalarioBase() {
        return SalarioBase;
    }

    public abstract double calcularSalario();

}