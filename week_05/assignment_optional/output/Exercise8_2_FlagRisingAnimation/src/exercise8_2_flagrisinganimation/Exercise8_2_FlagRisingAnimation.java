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
package exercise8_2_flagrisinganimation;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author tzikas97
 */
public class Exercise8_2_FlagRisingAnimation extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        // Create 2 Line instances
        Line line = new Line(100, 200, 100, 0);
        Line line2 = new Line(150, 180, 150, 50);

        // Create an ImageView instance
        ImageView imageView = new ImageView("image/gr.gif");

        Pane pane = new Pane();

        // Append the instances to the pane
        pane.getChildren().addAll(imageView, line);

        // Create a PathTransition instance
        PathTransition pt = new PathTransition();

        pt.setPath(line2);
        pt.setNode(imageView);
        pt.setDuration(Duration.seconds(10));
        pt.setCycleCount(3);
        pt.setAutoReverse(true);
        pt.play();

        Scene scene = new Scene(pane, 400, 200);

        firstStage.setTitle("Exercise 8_2");
        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
