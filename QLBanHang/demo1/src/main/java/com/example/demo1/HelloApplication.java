package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Parent window;
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(getClass().getResource("menu-view.fxml").toString());
        System.out.println(getClass().toString());
        window = FXMLLoader.load(getClass().getResource("sign-view.fxml"));
        Scene scene = new Scene(window);
        stage.setTitle("Sign");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}