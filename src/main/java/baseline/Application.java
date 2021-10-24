/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Application extends javafx.application.Application {

    @Override public void start(Stage stage) throws Exception {

        // Load menu.fxml as the root
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));

        // Set the scene with content as the root
        Scene scene = new Scene(root);

        // Set title
        stage.setTitle("Tom's To-Do List Manager [WIP]");

        // Set icon
        stage.getIcons().add(new Image("baseline/icon.png"));

        // Set scene as scene
        stage.setScene(scene);

        // Make it so the window is not resizable
        stage.setResizable(false);

        // Draw the stage
        stage.show();

    }

    public static void main(String[] args) {

        // Call JavaFX launch sequence
        launch(args);

    }

}