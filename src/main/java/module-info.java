module org.but.feec.bds_project3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.slf4j;
    requires com.zaxxer.hikari;


    opens org.but.feec.bds_project3 to javafx.fxml;
    exports org.but.feec.bds_project3;
}