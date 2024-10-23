module com.example.githublearn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.githublearn to javafx.fxml;
    exports com.example.githublearn;
}