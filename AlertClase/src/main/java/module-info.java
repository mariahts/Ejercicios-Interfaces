module com.mycompany.alertclase {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.alertclase to javafx.fxml;
    exports com.mycompany.alertclase;
}
