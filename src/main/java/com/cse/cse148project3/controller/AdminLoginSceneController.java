package com.cse.cse148project3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class AdminLoginSceneController {

    @FXML
    private StackPane stackPane;

    @FXML
    private TextField adminLoginSceneUsernameTextField;
    @FXML
    private TextField adminLoginScenePasswordTextField;

    @FXML
    private Button adminLoginSceneLoginButton;

    @FXML
    private Button adminLoginSceneCancelButton;

    public void adminLoginSceneLoginButtonOnAction() {
        System.out.println("btn pressed");
    }

    @FXML
    private void adminLoginSceneCancelButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/cse/cse148project3/views/main" +
                "-view.fxml"));
        Parent newSceneRoot = loader.load();
        for (Node node : stackPane.getChildren()) {
            if (node != newSceneRoot) {
                node.setVisible(false);
                node.setManaged(false);
            }
        }
        stackPane.getChildren().add(newSceneRoot);
        newSceneRoot.toFront();
    }
}
