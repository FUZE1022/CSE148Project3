module com.cse.cse148project3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse.cse148project3 to javafx.fxml;
    exports com.cse.cse148project3;
    exports com.cse.cse148project3.controller;
    opens com.cse.cse148project3.controller to javafx.fxml;
}