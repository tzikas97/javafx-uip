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
package assignment3application5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment3Application5 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment3Application5");

        // Create a Rectangle instance
        Rectangle rect = new Rectangle(0, 0, 180, 180);

        // Apply styling to the Rectangle instance
        // Set white fill color
        // Set green stroke color
        // Set a stroke width
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.GREEN);
        rect.setStrokeWidth(5);

        // Create the blue Line instance
        Line blueLine = new Line(0, 0, 180, 180);

        // Apply styling to the blue Line instance
        blueLine.setStroke(Color.BLUE);
        blueLine.setStrokeWidth(5);

        // Create the red Line instance
        Line redLine = new Line(0, 180, 180, 0);

        // Apply styling to the red Line instance
        redLine.setStroke(Color.RED);
        redLine.setStrokeWidth(5);

        StackPane pane = new StackPane();

        // Append the instances to the pane
        pane.getChildren().addAll(rect, blueLine, redLine);

        // Layout options
        pane.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(pane, 200, 200);

        firstStage.setScene(scene);
        firstStage.show();
    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
