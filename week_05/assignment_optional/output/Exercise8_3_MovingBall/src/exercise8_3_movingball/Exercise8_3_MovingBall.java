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
package exercise8_3_movingball;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author tzikas97
 */
public class Exercise8_3_MovingBall extends Application {

    static final double RADIUS = 20;
    private double x = RADIUS;
    static double y = RADIUS;
    private double dx = 1;
    private double dy = 1;
    static final int STEP = 10;

    Pane pane = new Pane();
    private DrawCircle circle = new DrawCircle(RADIUS);
    Timeline animation;
    Label animationRateLabel = new Label();

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        // Append the DrawCircle instance to the pane
        pane.getChildren().add(circle);

        // Attach OnMousePressed event handler to the Pane instance
        pane.setOnMousePressed(e -> animation.pause());

        // Attach OnMouseReleased event handler to the Pane instance
        pane.setOnMouseReleased(e -> animation.play());

        // Attach OnKeyPressed event handler to the Pane instance
        pane.setOnKeyPressed(e -> onKeyPressed(e));

        // Create 2 Button instances
        Button button1 = new Button("Up");
        Button button2 = new Button("Down");

        // Attach OnAction event handlers to the Button instances
        button1.setOnAction(e -> increaseSpeed());
        button2.setOnAction(e -> decreaseSpeed());

        // Apply styling to the Label instance
        animationRateLabel.setFont(new Font("Arial", 15));
        animationRateLabel.setTextFill(Color.BLUE);

        HBox hbox = new HBox(20);

        // Append the instances to the hbox
        hbox.getChildren().addAll(button1, animationRateLabel, button2);

        BorderPane bPane = new BorderPane();

        // Append the instances to the bPane
        bPane.setTop(pane);
        bPane.setBottom(hbox);

        // Layout options
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setPrefHeight(170);
        hbox.setAlignment(Pos.CENTER);
        HBox.setHgrow(button1, Priority.ALWAYS);
        HBox.setHgrow(button2, Priority.ALWAYS);
        button1.setMaxWidth(Double.MAX_VALUE);
        button2.setMaxWidth(Double.MAX_VALUE);

        // Create a Timeline instance
        animation = new Timeline(
                new KeyFrame(Duration.millis(50), e -> moveBall()));

        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        updateAnimationRateLabel();

        Scene scene = new Scene(bPane, 400, 200);

        firstStage.setScene(scene);
        firstStage.setTitle("Exercise 8_3");
        firstStage.show();

    }

    public class DrawCircle extends Circle {

        public DrawCircle(double radius) {

            super(x, y, radius);

            setFill(Color.WHITE);
            setStroke(Color.BLUE);
            setStrokeWidth(5);

        }

    }

    private void onKeyPressed(KeyEvent e) {

        if (KeyCode.UP == e.getCode()) {

            increaseSpeed();

        } else if (KeyCode.DOWN == e.getCode()) {

            decreaseSpeed();

        }

    }

    private void updateAnimationRateLabel() {

        animationRateLabel.setText("Animation Rate: " + String.format("%.1f", animation.getRate()));

    }

    public void increaseSpeed() {

        animation.setRate(animation.getRate() + 0.1);
        updateAnimationRateLabel();

    }

    public void decreaseSpeed() {

        animation.setRate(
                animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        updateAnimationRateLabel();

    }

    public void moveBall() {

        // Εκτός ορίων στον άξονα x
        if (x < RADIUS || x > (pane.getWidth() - RADIUS)) {

            // Αλλαγή κατεύθυνσης
            dx *= -1;
        }

        // Εκτός ορίων στον άξονα y
        if (y < RADIUS || y > (pane.getHeight() - RADIUS)) {

            // Αλλαγή κατεύθυνσης
            dy *= -1;
        }

        // Μεταβολή της τιμής του x κατά dx
        x += dx;

        // Μεταβολή της τιμής του y κατά dy
        y += dy;

        // Νέα θέση του κύκλου στον οριζόντιο άξονα
        circle.setCenterX(x);

        // Νέα θέση του κύκλου στον κάθετο άξονα
        circle.setCenterY(y);

    }

    public static void main(String[] args) {

        Application.launch(args);

    }

}
