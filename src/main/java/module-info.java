module oop.courseprojects.demo5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.courseprojects.demo5 to javafx.fxml;
    exports oop.courseprojects.demo5;
}