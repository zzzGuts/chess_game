package app.chess_game.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginLayout extends GridPane {
    public LoginLayout() {
        TextField userNameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Label buttonsLabel = new Label("or");
        Button registerButton = new Button("Register");

        this.add(userNameField, 0, 0, 3, 1);
        this.add(passwordField, 0, 1, 3, 1);
        this.add(loginButton, 0, 2, 1, 1);
        this.add(buttonsLabel, 1, 2, 1, 1);
        this.add(registerButton, 2, 2, 1, 1);

        this.setHgap(5);
        this.setVgap(7);
        this.setAlignment(Pos.CENTER);
    }
}
