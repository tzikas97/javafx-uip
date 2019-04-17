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
package assignment4application2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment4Application2 extends Application {

    // Create a Rectangle instance
    private Rectangle rect = new Rectangle(200, 80);

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment4Application2");

        // Apply styling to the Rectangle instance
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLUE);
        rect.setStrokeWidth(2);

        // Create a Button instance
        Button button = new Button("Rotate");

        HBox hBox = new HBox();

        // Append the Button instance to the hBox
        hBox.getChildren().add(button);

        BorderPane bPane = new BorderPane();

        // Append the rect, hBox instances to the bPane
        bPane.setCenter(rect);
        bPane.setBottom(hBox);

        // Attach OnAction event handler to the Button instance
        button.setOnAction(e -> incrementRotationAngle());

        // Layout options
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(bPane, 400, 400);

        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     *
     * Method that increments the rotation angle
     */
    private void incrementRotationAngle() {

        // Set rotation angle incremented by 45deg
        rect.setRotate(rect.getRotate() + 45);

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
