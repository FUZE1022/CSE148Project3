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

public class RegisterNewUserSceneController {

    @FXML
    private StackPane stackPane;

    @FXML
    private TextField regsiterNewUserSceneUsernameTextField;
    @FXML
    private TextField registerNewUserScenePasswordTextField;

    @FXML
    private TextField registerNewUserSceneReEnterPasswordTextField;

    @FXML
    private Button registerNewUserSceneCreateButton;

    @FXML
    private Button registerNewUserSceneCancelButton;

    public void registerNewUserSceneCreateButtonOnAction() {
        System.out.println("btn pressed");
    }

    @FXML
    private void registerNewUserSceneCancelButtonOnAction(ActionEvent event) throws IOException {
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
