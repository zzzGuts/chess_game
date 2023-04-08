module app.chess_game {
    requires javafx.controls;
    requires javafx.fxml;

    opens app.chess_game.View to javafx.fxml;
    exports app.chess_game.View;
}