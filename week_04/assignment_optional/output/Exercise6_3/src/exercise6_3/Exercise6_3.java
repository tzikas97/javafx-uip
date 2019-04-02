/*
 * Copyright 2019 George Tzikas <tzikas97@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package exercise6_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Exercise6_3 extends Application {

    // Declare STEP value
    private final int STEP = 10;

    // Create a DrawCircle instance
    private Circle circle = new DrawCircle(50, Color.WHITE, Color.BLACK);

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        // Center the DrawCircle instance
        circle.setCenterX(300);
        circle.setCenterY(200);

        HBox hBox = new HBox();

        // Layout options
        hBox.setPadding(new Insets(20, 20, 20, 20));
        hBox.setSpacing(20);
        hBox.setAlignment(Pos.CENTER);

        // Create 6 Button instances
        Button btnEnlarge = new Button("Enlarge");
        Button btnShrink = new Button("Shrink");
        Button btnMoveLeft = new Button("Move Left");
        Button btnMoveRight = new Button("Move Right");
        Button btnMoveUp = new Button("Move Up");
        Button btnMoveDown = new Button("Move Down");

        // Append the instances to the hBox
        hBox.getChildren().addAll(btnEnlarge, btnShrink, btnMoveLeft, btnMoveRight, btnMoveUp, btnMoveDown);

        // Attach event handlers to the Button instances
        btnEnlarge.setOnAction(e -> enlarge());
        btnShrink.setOnAction(e -> shrink());
        btnMoveLeft.setOnAction(e -> moveLeft());
        btnMoveRight.setOnAction(e -> moveRight());
        btnMoveUp.setOnAction(e -> moveUp());
        btnMoveDown.setOnAction(e -> moveDown());

        Pane pane = new Pane();

        // Append the DrawCircle instance to the pane
        pane.getChildren().add(circle);

        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 600, 400);

        firstStage.setTitle("Exercise 6.3");
        firstStage.setScene(scene);
        firstStage.show();
    }

    /**
     *
     * Method that increases the object's radius
     */
    public void enlarge() {
        circle.setRadius(circle.getRadius() + STEP);
    }

    /**
     *
     * Method that decreases the object's radius
     */
    public void shrink() {
        circle.setRadius(circle.getRadius() - STEP);
    }

    /**
     *
     * Method that decreases the object's layout X property
     */
    public void moveLeft() {
        circle.setLayoutX(circle.getLayoutX() - STEP);
    }

    /**
     *
     * Method that increases the object's layout X property
     */
    public void moveRight() {
        circle.setLayoutX(circle.getLayoutX() + STEP);
    }

    /**
     *
     * Method that decreases the object's layout Y property
     */
    public void moveUp() {
        circle.setLayoutY(circle.getLayoutY() - STEP);
    }

    /**
     *
     * Method that increases the object's layout Y property
     */
    public void moveDown() {
        circle.setLayoutY(circle.getLayoutY() + STEP);
    }

    public class DrawCircle extends Circle {

        /**
         *
         * @param radius The object's radius
         * @param fillColor The object's fill color
         * @param strokeColor The object's stroke color
         */
        public DrawCircle(int radius, Color fillColor, Color strokeColor) {

            super(radius, fillColor);
            setStroke(strokeColor);

        }

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
