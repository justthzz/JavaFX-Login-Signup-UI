package org.example.loginui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;

    @FXML
    private TextField userNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    public void goToSignUp(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onSignInButtonClick(ActionEvent actionEvent) {
        if (validateLogin()) {
            showAlert(Alert.AlertType.INFORMATION, "Success", "Login Successful!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Error", "Invalid credentials. Please try again.");
        }
    }

    private boolean validateLogin() {
        return !userNameTextField.getText().isEmpty() && !emailTextField.getText().isEmpty();
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}