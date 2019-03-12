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
package assignment2application3;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment2Application3 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment2Application3");

        GridPane pane = new GridPane();

        // Layout options
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setAlignment(Pos.CENTER);

        Random rand = new Random();
        Integer randInt;

        // Add images to pane
        // 0 -> o.gif
        // 1 -> x.gif
        // 2 -> w/o image
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                randInt = rand.nextInt(3);
                if (0 == randInt) {
                    pane.add(new ImageView("res/img/o.gif"), i, j);
                } else if (1 == randInt) {
                    pane.add(new ImageView("res/img/x.gif"), i, j);
                }
            }
        }

        Scene scene = new Scene(pane, 350, 350);

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
