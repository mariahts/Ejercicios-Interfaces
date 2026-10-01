package com.mycompany.comboboxclase;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ComboBoxController {
       @FXML
    private ComboBox<String> cc;

@FXML 
private Label l;
    
    
    @FXML
    private void initialize(){
       
     
    cc.getItems().addAll("España", "Noruega", "Argentina");
    
 
    
 
    
    }
    
    
    @FXML
    private void accion(){
        
        
    
        String opcion = cc.getValue();
        
        l.setText("Has elegido "+ opcion);
 
    
    
    }
   


    
    
    
}
