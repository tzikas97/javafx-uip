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
package assignment4application1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment4Application1 extends Application {

    private FlowPane fPane = new FlowPane();

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment4Application1");

        Button button = new Button("Refresh");

        HBox hBox = new HBox();

        // Append the Button instance to the hBox
        hBox.getChildren().add(button);

        BorderPane bPane = new BorderPane();

        // Append the fPane, hBox instances to the bPane
        bPane.setCenter(fPane);
        bPane.setBottom(hBox);

        // Attach OnAction event handler to the Button instance
        button.setOnAction(e -> randomizeCards());

        // Layout options
        fPane.setPadding(new Insets(10, 10, 10, 10));
        fPane.setVgap(10);
        fPane.setHgap(10);
        fPane.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setAlignment(Pos.CENTER);

        // Initial cards randomization
        randomizeCards();

        Scene scene = new Scene(bPane, 400, 200);

        firstStage.setScene(scene);
        firstStage.show();
    }

    private void randomizeCards() {

        // Store images in a list
        List<ImageView> imagesList = new ArrayList<>();

        // Create a Random instance
        Random rand = new Random();

        // Append 3 ImageView instances to the imagesList
        for (int i = 0; i < 3; i++) {
            imagesList.add(new ImageView("res/img/" + (rand.nextInt(53 - 1) + 1) + ".png"));
        }

        // Clear the ImageView instances from the fPane
        fPane.getChildren().clear();

        // Append the ImageView instances to the fPane
        fPane.getChildren().addAll(imagesList);
    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
