package com.example.masegroupwork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MazeRunnerRobot extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MazeRunnerRobot.class.getResource("MazeTabs.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 567, 433);
        stage.setTitle("Robot");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch(); }
}
