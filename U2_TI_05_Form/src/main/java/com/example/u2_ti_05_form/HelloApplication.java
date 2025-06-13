package com.example.u2_ti_05_form;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

import static javafx.application.Application.launch;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //FMXLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view-fxml"));

        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido");
        TextField tfApellido = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        Label lblGrupo = new Label("Grupos");
        ObservableList<String> Grupo = FXCollections.observableArrayList("Alumno", "Maestro", "Admin");
        ComboBox<String> cbGrupo=new ComboBox<>(Grupo);
        Button btnEnviar = new Button("Enviar");
        Button btnResetear = new Button("Resetear");
        Label lblResultado = new Label("");
        GridPane grid = new GridPane();

        btnEnviar.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String comentario = tfEdad.getText();
            String grupo = cbGrupo.getSelectionModel().getSelectedItem();
            //String lblgr
            if (nombre.isEmpty() || apellido.isEmpty() || comentario.isEmpty() || grupo.isEmpty()) {
                lblResultado.setText("Debes llenar todos los campos");
            } else {
                grid.setStyle("-fx-background-color: green;");

                lblResultado.setText("El nombre es " + nombre + " Apellido: " + apellido + " Comentario: "
                        + comentario + " Grupo: " + grupo);
            }
        });
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(lblNombre, 0, 0);
        grid.add(tfNombre, 1, 0);
        grid.add(lblApellido, 0, 1);
        grid.add(tfApellido, 1, 1);
        grid.add(lblEdad, 0, 2);
        grid.add(tfEdad, 1, 2);
        grid.add(lblGrupo, 0, 3);
        grid.add(cbGrupo, 1, 3);
        grid.add(btnEnviar, 0, 4);
        grid.add(btnResetear, 1, 4);
        grid.add(lblResultado, 0, 5);

        //VBox vbox = new VBox(20, label, label2, button, button2);
        //vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(grid, 600, 540);
        stage.setTitle("Form");
        stage.setScene(scene);
        stage.show();

    }
        public static void main (String[] args) {launch();}
    }




