package com.cse.cse148project3.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UserLoginSceneController {

    @FXML
    private TextField userLoginSceneUsernameTextField;
    @FXML
    private TextField userLoginScenePasswordTextField;

    @FXML
    private Button userLoginSceneLoginButton;

    @FXML
    private Button userLoginSceneCancelButton;

    public void userLoginSceneLoginButtonOnAction() {
        System.out.println("btn pressed");
    }

    public void userLoginSceneCancelButtonOnAction() {
        System.out.println("btn pressed");
    }
}
