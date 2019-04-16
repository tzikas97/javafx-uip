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
package exercise8_1_pathtransition;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author tzikas97
 */
public class Exercise8_1_PathTransition extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        // Create a Rectangle instance
        Rectangle rectangle = new Rectangle(0, 0, 25, 50);

        rectangle.setFill(Color.ORANGE);

        // Create a Circle instance
        Circle circle = new Circle(125, 100, 50);

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Pane pane = new Pane();

        // Append the instances to the pane
        pane.getChildren().addAll(circle, rectangle);

        // Create a PathTransition instance
        PathTransition pt = new PathTransition();

        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setDuration(Duration.seconds(8));
        pt.setCycleCount(4);
        pt.setAutoReverse(true);
        pt.play();

        // Attach OnMousePressed event handler to the Circle instance
        circle.setOnMousePressed(e -> onMousePressed(pt));

        // Attach OnMouseReleased event handler to the Circle instance
        circle.setOnMouseReleased(e -> onMouseReleased(pt));

        Scene scene = new Scene(pane, 250, 200);

        firstStage.setTitle("Exercise 8.1");
        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     * @param pt The path transition
     */
    private void onMousePressed(PathTransition pt) {

        pt.pause();

    }

    /**
     * @param pt The path transition
     */
    private void onMouseReleased(PathTransition pt) {

        pt.play();

    }

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
