package app.chess_game.View;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class LoginLayout extends GridPane {
    public LoginLayout() {
        TextField userNameField = new TextField();
        userNameField.setMaxWidth(212);

        PasswordField passwordField = new PasswordField();
        passwordField.setMaxWidth(212);

        Button loginButton = new Button("Login");
        loginButton.setMinWidth(95);
        loginButton.setFocusTraversable(false);

        Label buttonsLabel = new Label("or");

        Button registerButton = new Button("Register");
        registerButton.setMinWidth(95);
        registerButton.setFocusTraversable(false);

        CheckBox rememberMeCheckbox = new CheckBox("Remember me");
        rememberMeCheckbox.setFocusTraversable(false);

        Hyperlink forgotPassword = new Hyperlink("Forgot Password?");
        forgotPassword.setFocusTraversable(false);
        forgotPassword.setOnAction(e -> {
            System.out.println("IM DUMB");
            forgotPassword.setVisited(false);
        });

        this.add(userNameField, 0, 0, 4, 1);
        this.add(passwordField, 0, 1, 4, 1);
        this.add(loginButton, 0, 2);
        this.add(buttonsLabel, 1, 2);
        this.add(registerButton, 2, 2);
        this.add(rememberMeCheckbox, 0, 3, 2, 1);
        this.add(forgotPassword, 2, 3);

        this.setHgap(5);
        this.setVgap(7);
        this.setAlignment(Pos.CENTER);
    }
}
