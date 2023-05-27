module com.example.tpc8_lenicefonseca {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tpc8_lenicefonseca to javafx.fxml;
    exports com.example.tpc8_lenicefonseca;
}