package com.example.masegroupwork;

import javafx.geometry.Bounds;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

public class MazeCarController {
    private boolean isPixelCollision(ImageView PlayerCar, ImageView CarMazeMap, Color collisionColor) {
        Image image1 = PlayerCar.getImage();
        Image image2 = CarMazeMap.getImage();

        PixelReader pixelReader1 = image1.getPixelReader();
        PixelReader pixelReader2 = image2.getPixelReader();

        // Get the bounds of the images
        Bounds bounds1 = PlayerCar.getBoundsInParent();
        Bounds bounds2 = CarMazeMap.getBoundsInParent();

        int minX = (int) Math.max(bounds1.getMinX(), bounds2.getMinX());
        int minY = (int) Math.max(bounds1.getMinY(), bounds2.getMinY());
        int maxX = (int) Math.min(bounds1.getMaxX(), bounds2.getMaxX());
        int maxY = (int) Math.min(bounds1.getMaxY(), bounds2.getMaxY());

        for (int x = minX; x < maxX; x++) {
            for (int y = minY; y < maxY; y++) {
                Color color1 = pixelReader1.getColor(x, y);
                Color color2 = pixelReader2.getColor(x, y);

                collisionColor = Color.BLUE;

                if (isPixelCollision(PlayerCar, CarMazeMap, collisionColor)) {
                    // Handle collision here
                    System.out.println("Collision detected!");
                }

                return true;
            }

        }

        return false;
}}
