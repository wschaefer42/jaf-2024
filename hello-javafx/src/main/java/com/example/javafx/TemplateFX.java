package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TemplateFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Label title = new Label("Hello JavaFX");
        root.getChildren().add(title);
        // Your JavaFX Code here ...
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
