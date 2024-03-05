package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private BorderPane rootLayout;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void initialize() {
        // Добавляем заголовок
        BorderPane header = new BorderPane();
        header.setPrefHeight(40);
        header.setStyle("-fx-background-color: #336699; -fx-text-fill: white; -fx-font-size: 18px; -fx-alignment: center;");
        header.setTop(new javafx.scene.control.Label("Header"));

        // Заменяем верхний элемент корневого макета на новый макет с заголовком
        rootLayout.setTop(header);
    }
}
