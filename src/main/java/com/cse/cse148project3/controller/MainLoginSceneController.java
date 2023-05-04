package com.cse.cse148project3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLoginSceneController {

    @FXML
    private GridPane root;

    @FXML
    private TextField mainLoginScreenUsernameTextField;

    @FXML
    private TextField mainLoginScreenPasswordTextField;

    @FXML
    private Button mainLoginSceneLoginButton;

    @FXML
    private Button adminMainLoginSceneAdminLoginButton;

    private Hyperlink mainLoginSceneRegisterUserHyperlink;

    @FXML
    private void mainLoginSceneLoginButtonOnAction(ActionEvent event) throws IOException {
        System.out.println("Login button pressed");
    }

    @FXML
    private void adminMainLoginSceneAdminLoginButtonOnAction(ActionEvent event) throws IOException {
        System.out.println("Admin Login button pressed");
    }

    @FXML
    private void mainLoginSceneRegisterHyperLinkOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/cse/cse148project3/views" +
                "/registerUserScene-view.fxml"));
        Stage stage = new Stage();
        Scene newScene = new Scene(fxmlLoader.load(), 800, 500);
        stage.setTitle("Register New User");

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();

        stage.setScene(newScene);
        stage.show();
    }
}