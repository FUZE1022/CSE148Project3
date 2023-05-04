package com.cse.cse148project3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainSceneController {

    @FXML
    private StackPane stackPane;

    @FXML
    private Button mainSceneAdminButton;

    @FXML
    private Button mainSceneUserButton;

    @FXML
    private Button mainSceneRegisterUserButton;

    @FXML
    private void mainSceneAdminButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/cse/cse148project3/views/adminLoginScreen" +
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

    @FXML
    public void mainSceneUserButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/cse/cse148project3/views/userLoginScene" +
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

    @FXML
    public void mainSceneRegisterUserButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/cse/cse148project3/views/registerNewUserScene" +
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