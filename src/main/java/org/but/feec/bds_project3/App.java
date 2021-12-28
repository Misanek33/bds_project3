package org.but.feec.bds_project3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.but.feec.bds_project3.exception.ExceptionHandler;

public class App extends Application {

    private FXMLLoader loader;
    private VBox mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            loader = new FXMLLoader(getClass().getResource("App.fxml"));
            mainStage = loader.load();

            primaryStage.setTitle("Project 3");
            Scene scene = new Scene(mainStage);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception ex) {
            ExceptionHandler.handleException(ex);
        }
    }

}



