package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox root = fxmlLoader.load();
        Scene scene = new Scene(root, 320, 240);

        // Добавляем заголовок
        BorderPane header = new BorderPane();
        header.setPrefHeight(40);
        header.setStyle("-fx-background-color: #336699; -fx-text-fill: white; -fx-font-size: 18px; -fx-alignment: center;");
        header.setTop(new javafx.scene.control.Label("Header"));

        // Объединяем заголовок и контент в корневом макете
        BorderPane rootLayout = new BorderPane();
        rootLayout.setTop(header);
        rootLayout.setCenter(root);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
