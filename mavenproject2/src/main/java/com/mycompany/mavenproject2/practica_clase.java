package com.mycompany.mavenproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class practica_clase {

    @FXML
    private CheckBox checkAcepto;

    @FXML
    private Button botonGuardar;

    @FXML
    private void initialize() {
        botonGuardar.setDisable(true);

        checkAcepto.setOnAction(evento ->
            botonGuardar.setDisable(!checkAcepto.isSelected())
        );
    }
}