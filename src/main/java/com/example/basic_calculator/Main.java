package com.example.basic_calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        //Call the launch() method for JavaFX Application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Include fxml file
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        //Set the title of our window
        Font.loadFont(getClass().getResourceAsStream("/resources/digital-7.ttf"), 14);
        primaryStage.setTitle("Calculator");
        //Create our window and using scene
        Image icon = new Image("icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root, 350, 350));
        //Set visible of our window
        primaryStage.show();
        //Off resizeble
        primaryStage.setResizable(false);
    }
}