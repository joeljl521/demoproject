module joel.demoproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens joel.demoproject to javafx.fxml;
    exports joel.demoproject;
}