package com.mislis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage mainStage) throws IOException {

        Scene rootScene = new Scene(new RootManager(), 1024, 768);

        mainStage.setTitle("Mislis");
        mainStage.setResizable(false);
        mainStage.setScene(rootScene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}