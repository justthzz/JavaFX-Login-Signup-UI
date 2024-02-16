module org.example.loginui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.loginui to javafx.fxml;
    exports org.example.loginui;
}