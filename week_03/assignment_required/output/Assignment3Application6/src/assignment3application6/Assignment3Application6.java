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
package assignment3application6;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment3Application6 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment3Application6");

        // Create the horizontal axis Line instance
        Line hLine = new Line(0, 100, 400, 100);

        // Apply styling to the horizontal axis Line instance
        hLine.setStroke(Color.BLACK);
        hLine.setStrokeWidth(2);

        // Create the vertical axis Line instance
        Line vLine = new Line(100, 0, 100, 200);

        // Apply styling to the vertical axis Line instance
        vLine.setStroke(Color.BLACK);
        vLine.setStrokeWidth(2);

        // Create a Polyline instance
        Polyline polyline = new Polyline();

        // Apply styling to the Polyline instance
        polyline.setStroke(Color.BLUE);

        ObservableList<Double> list = polyline.getPoints();

        // Add points to the Polyline instance
        for (int x = 0; x <= 250; x++) {
            list.add(x + 100.0);
            list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
        }

        // Store text in a list
        List<Text> textList = new ArrayList<>();

        textList.add(new Text(390, 120, "X"));
        textList.add(new Text(110, 10, "Y"));
        textList.add(new Text(110, 120, "0"));
        textList.add(new Text(200, 120, "\u03c0"));
        textList.add(new Text(300, 120, "2\u03c0"));

        Pane pane = new Pane();

        // Append the instances to the pane
        pane.getChildren().addAll(hLine, vLine, polyline);
        pane.getChildren().addAll(textList);

        Scene scene = new Scene(pane, 400, 200);

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
