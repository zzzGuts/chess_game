package app.chess_game.View;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Window extends Application {
    private static Stage window;
    private static Scene loginScene;

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Chess Game!");
        window.setOnCloseRequest(windowEvent -> {
            Platform.exit();
            System.exit(0);
        });

        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
