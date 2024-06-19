module com.mislis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;

    opens com.mislis to javafx.fxml;
    exports com.mislis;
}
