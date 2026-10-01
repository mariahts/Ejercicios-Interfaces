module com.mycompany.comboboxclase {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.comboboxclase to javafx.fxml;
    exports com.mycompany.comboboxclase;
}
