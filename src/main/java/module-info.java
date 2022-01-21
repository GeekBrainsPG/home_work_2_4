module com.example.lesson_2_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson_2_4 to javafx.fxml;
    exports com.example.lesson_2_4;
}