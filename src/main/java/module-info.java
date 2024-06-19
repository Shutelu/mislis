module com.mislis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;
    // requires transitive;

    opens com.mislis to javafx.fxml;
    exports com.mislis;
}
