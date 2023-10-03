package com.example.masegroupwork;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class MazeController implements Initializable {

    @FXML
    private ImageView robo;
    @FXML
    private Button car;
    @FXML
    private Button pause;
    @FXML
    private Button start;
    private Robot roboto;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roboto = new Robot(robo);
        roboto.robotAnimation();


    }

    public void stop(ActionEvent event) {
        roboto.pause();

        pause.setDisable(true);
        pause.setVisible(false);

        start.setDisable(false);
        start.setVisible(true);

    }

    public void start(ActionEvent event) {
        roboto.unpause();

        start.setDisable(true);
        start.setVisible(false);

        pause.setDisable(false);
        pause.setVisible(true);
    }

    /**
     * VroomVroom(KeyEvent event):
     * Uses keyboard inputs to move the car within the maze.
     *
     * @param event keyboard inputs (W, A, S, D)
     *
     * @author guzmjo
     */
    public void VroomVroom(KeyEvent event) {

        //car's current pixel position (x, y)
        double x = car.getLayoutX();
        double y = car.getLayoutY();

        //how many pixels the car moves per every read of input
        double velocity = 4.0;

        /*
            switch(event.getCode()):

            Depending on the key pressed, the car will move either horizontally or vertically.
            Furthermore, the headings of the car will change depending on what direction it is heading in.
            Although, it does not change headings when heading left because the image

         */
        switch (event.getCode()) {
            case W:
                y -= velocity;
                car.setLayoutY(y);
                car.setRotate(270);
                break;

            case A:
                x -= velocity;
                car.setLayoutX(x);
                car.setRotate(0);
                break;

            case S:
                y += velocity;
                car.setLayoutY(y);
                car.setRotate(90);
                break;

            case D:
                x += velocity;
                car.setLayoutX(x);
                car.setRotate(0);
                break;

            default:
                break;
        }

    }
}
