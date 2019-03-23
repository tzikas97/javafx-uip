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
package assignment3application4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment3Application4 extends Application {

    // Initialize rotation angle
    static double rotationAngle = -45;

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment3Application4");

        StackPane pane = new StackPane();

        for (int i = 0; i < 4; i++) {

            // Create a Rectangle instance
            Rectangle rect = new Rectangle(100, 50, 100, 30);

            // Apply styling to the Rectangle instance
            // Set white fill color
            // Set random stroke color
            // Set a stroke width
            // Set rotation angle incremented by 45deg
            rect.setFill(new Color(1, 1, 1, 1));
            rect.setStroke(new Color(Math.random(), Math.random(), Math.random(), 1));
            rect.setStrokeWidth(2);
            rotationAngle += 45;
            rect.setRotate(rotationAngle);

            // Append the Rectangle instance to the pane
            pane.getChildren().add(rect);
        }

        // Layout options
        pane.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(pane, 300, 200);

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
