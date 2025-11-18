module com.example.wintertime {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wintertime to javafx.fxml;
    exports com.example.wintertime;
}