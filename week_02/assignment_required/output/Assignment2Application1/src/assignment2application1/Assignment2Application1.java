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
package assignment2application1;

import java.util.ArrayList;
import java.util.List;
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
public class Assignment2Application1 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment2Application1");

        // Load images in a list
        List<ImageView> imagesList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            imagesList.add(new ImageView("res/img/flag" + (i + 1) + ".gif"));
        }

        GridPane pane = new GridPane();

        // Layout options
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setAlignment(Pos.CENTER);

        // Add images to pane
        pane.add(imagesList.get(0), 0, 0);
        pane.add(imagesList.get(1), 1, 0);
        pane.add(imagesList.get(2), 0, 1);
        pane.add(imagesList.get(3), 1, 1);

        Scene scene = new Scene(pane, 800, 500);

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
