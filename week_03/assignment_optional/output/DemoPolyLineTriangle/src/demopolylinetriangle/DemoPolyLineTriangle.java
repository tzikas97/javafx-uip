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
package demopolylinetriangle;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class DemoPolyLineTriangle extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("AP5Application2");

        // Create a Polyline instance
        Polyline polyline = new Polyline();

        ObservableList<Double> list = polyline.getPoints();

        // Add points to the Polyline instance
        list.add(50.0);
        list.add(50.0);
        list.add(50.0);
        list.add(400.0);
        list.add(50.0);
        list.add(400.0);
        list.add(200.0);
        list.add(400.0);
        list.add(200.0);
        list.add(400.0);
        list.add(50.0);
        list.add(50.0);

        // Apply styling to the Polyline instance
        polyline.setStroke(Color.BLUE);
        polyline.setStrokeWidth(5);

        Pane pane = new Pane();

        // Append the instance to the pane
        pane.getChildren().addAll(polyline);

        Scene scene = new Scene(pane, 300, 500);

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
