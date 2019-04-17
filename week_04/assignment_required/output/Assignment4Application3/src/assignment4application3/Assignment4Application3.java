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
package assignment4application3;

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
public class Assignment4Application3 extends Application {

    // Declare STEP value
    private final int STEP = 10;

    // Create a Circle instance
    private Circle circle = new Circle(80);

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment4Application3");

        // Apply styling to the Circle instance
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(2);
        circle.setCenterX(400);
        circle.setCenterY(200);

        Pane pane = new Pane();

        // Append the circle instance to the pane
        pane.getChildren().add(circle);

        // Create 4 Button instances
        Button btnMoveLeft = new Button("Left");
        Button btnMoveRight = new Button("Right");
        Button btnMoveUp = new Button("Up");
        Button btnMoveDown = new Button("Down");

        HBox hBox = new HBox();

        // Append the instances to the hBox
        hBox.getChildren().addAll(btnMoveLeft, btnMoveRight, btnMoveUp, btnMoveDown);

        BorderPane bPane = new BorderPane();

        // Append the pane, hBox instances to the bPane
        bPane.setCenter(pane);
        bPane.setBottom(hBox);

        // Attach OnAction event handlers to the Button instances
        btnMoveLeft.setOnAction(e -> moveLeft());
        btnMoveRight.setOnAction(e -> moveRight());
        btnMoveUp.setOnAction(e -> moveUp());
        btnMoveDown.setOnAction(e -> moveDown());

        // Layout options
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);

        Scene scene = new Scene(bPane, 800, 400);

        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     *
     * Method that decreases the object's layout X property
     */
    private void moveLeft() {

        circle.setLayoutX(circle.getLayoutX() - STEP);

    }

    /**
     *
     * Method that increases the object's layout X property
     */
    private void moveRight() {

        circle.setLayoutX(circle.getLayoutX() + STEP);

    }

    /**
     *
     * Method that decreases the object's layout Y property
     */
    private void moveUp() {

        circle.setLayoutY(circle.getLayoutY() - STEP);

    }

    /**
     *
     * Method that increases the object's layout Y property
     */
    private void moveDown() {

        circle.setLayoutY(circle.getLayoutY() + STEP);

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
