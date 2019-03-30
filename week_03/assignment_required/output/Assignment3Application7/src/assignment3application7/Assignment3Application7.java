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
package assignment3application7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment3Application7 extends Application {

    // Initialize color flag
    private static int colorFlag = 1;

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment3Application7");

        GridPane pane = new GridPane();

        for (int i = 0; i < 8; i++) {

            // Invert the color flag
            // When switching rows
            colorFlag = -colorFlag;

            for (int j = 0; j < 8; j++) {

                // Invert the color flag
                // When switching columns
                colorFlag = -colorFlag;

                // Create a Rectangle instance
                // Append the Rectangle instance to the pane
                pane.add(new Rectangle(30, 30,
                        (1 == colorFlag ? Color.WHITE : Color.BLACK)
                ), j, i);
            }
        }

        // Layout options
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 240, 240);

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
