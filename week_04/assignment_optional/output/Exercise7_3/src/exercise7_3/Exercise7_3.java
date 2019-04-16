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
package exercise7_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Exercise7_3 extends Application {

    // Create a Circle instance
    private Circle circle = new Circle(50);

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);

        // Attach OnMouseEntered event handler to the Circle instance
        circle.setOnMouseEntered(e -> onMouseEntered());

        // Attach OnMouseDragged event handler to the Circle instance
        circle.setOnMouseDragged(e -> onMouseDragged(e));

        Pane pane = new Pane();

        // Layout options
        pane.setPadding(new Insets(10, 10, 10, 10));

        // Append the Circle instance to the pane
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 400, 400);

        firstStage.setTitle("Circle Mouse Events");
        firstStage.setScene(scene);
        firstStage.show();
    }

    /**
     *
     * OnMouseEntered event handler method
     */
    public void onMouseEntered() {

        circle.setFill(Color.RED);

    }

    /**
     *
     * OnMouseDragged event handler method
     *
     * @param e The MouseEvent instance
     */
    public void onMouseDragged(MouseEvent e) {

        circle.setCenterX(e.getX());
        circle.setCenterY(e.getY());

    }

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
