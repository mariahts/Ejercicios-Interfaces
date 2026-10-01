package com.mycompany.alertclase;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class AlertController {

    @FXML
   
    private Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    
    @FXML
    private void initialize(){
        
       
        
        alerta.setHeaderText(null);
        alerta.setContentText("Alerta creada correctamente");
        alerta.showAndWait();
        
        
        
    
    }
    
    
    
    
    
}
