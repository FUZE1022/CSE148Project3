package com.cse.cse148project3.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterNewUserSceneController {

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

    public void registerNewUserSceneCancelButtonOnAction() {
        System.out.println("btn pressed");
    }
}
