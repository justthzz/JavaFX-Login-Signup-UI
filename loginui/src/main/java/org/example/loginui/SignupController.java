package org.example.loginui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SignupController {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField birthdayTextField;

    @FXML
    private TextField genderTextField;

    @FXML
    private TextField civilTextField;

    @FXML
    private TextField countryTextField;

    @FXML
    private TextField contactTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField compasswordTextField;

    @FXML
    public void onSubmitButtonClick(ActionEvent actionEvent) {
        // Validate the form data
        if (validateForm()) {
            // If validation is successful, show a success message
            showAlert(Alert.AlertType.INFORMATION, "Success", "Form Submitted Successfully!");
        } else {
            // If validation fails, show an error message
            showAlert(Alert.AlertType.ERROR, "Error", "Please fill in all the required fields.");
        }
    }

    public void onClearButtonClick(ActionEvent actionEvent) {
        firstNameTextField.clear();
        lastNameTextField.clear();
        ageTextField.clear();
        birthdayTextField.clear();
        genderTextField.clear();
        civilTextField.clear();
        countryTextField.clear();
        contactTextField.clear();
        emailTextField.clear();
        usernameTextField.clear();
        passwordTextField.clear();
        compasswordTextField.clear();
    }

    private boolean validateForm() {
        if (isEmpty(firstNameTextField) || isEmpty(lastNameTextField) || isEmpty(ageTextField)
                || isEmpty(birthdayTextField) || isEmpty(genderTextField) || isEmpty(civilTextField)
                || isEmpty(countryTextField) || isEmpty(contactTextField) || isEmpty(emailTextField)
                || isEmpty(usernameTextField) || isEmpty(passwordTextField) || isEmpty(compasswordTextField)) {
            return false;
        }
        return true;
    }

    private boolean isEmpty(TextField textField) {
        return textField.getText().trim().isEmpty();
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}