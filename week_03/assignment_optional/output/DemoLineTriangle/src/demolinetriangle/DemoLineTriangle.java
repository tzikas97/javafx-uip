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
package demolinetriangle;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class DemoLineTriangle extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("AP5Application1");

        // Store Line instances in a list
        List<Line> lineList = new ArrayList<>();

        lineList.add(new Line(50, 50, 50, 400));
        lineList.add(new Line(50, 400, 200, 400));
        lineList.add(new Line(200, 400, 50, 50));

        // Apply styling to the Line instances
        for (int i = 0; i < 3; i++) {
            lineList.get(i).setStroke(Color.BLUE);
            lineList.get(i).setStrokeWidth(5);
        }

        Pane pane = new Pane();

        // Append the instances to the pane
        pane.getChildren().addAll(lineList);

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
