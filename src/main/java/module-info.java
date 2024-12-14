module com.example.jotirmoymollick {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jotirmoymollick to javafx.fxml;
    exports com.example.jotirmoymollick;
}