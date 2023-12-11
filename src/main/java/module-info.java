module es.ieslosmontecillos.checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.checkbox to javafx.fxml;
    exports es.ieslosmontecillos.checkbox;
}