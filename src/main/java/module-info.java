module com.example.masegroupwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.masegroupwork to javafx.fxml;
    exports com.example.masegroupwork;
}