package com.cse.cse148project3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterNewUserSceneController {

    @FXML
    private GridPane root;

    @FXML
    private TextField regsiterUserUsernameTextField;
    @FXML
    private TextField registerUserPasswordTextField;

    @FXML
    private TextField registerUserConfirmPasswordTextField;

    @FXML
    private Button registerUserSceneCreateAccountButton;

    @FXML
    private Button registerUserCancelButton;

    public void registerUserCreateAccountButtonOnAction() {
        System.out.println("btn pressed");
    }

    @FXML
    private void registerUserCancelButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/cse/cse148project3/views" +
                "/mainLoginScene-view.fxml"));
        Stage stage = new Stage();
        Scene newScene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setTitle("Login");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();

        stage.setScene(newScene);
        stage.show();
    }
}
