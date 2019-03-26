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
package demoborderpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class DemoBorderPane extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("AP5Application3");

        // Create a Rectangle instance
        Rectangle rect = new Rectangle(200, 200);

        // Apply styling to the Rectangle instance
        rect.setFill(Color.BLACK);

        // Create a Circle instance
        Circle c1 = new Circle(100);

        // Apply styling to the Circle instance
        c1.setFill(Color.WHITE);
        c1.setStroke(Color.BLACK);
        c1.setStrokeWidth(1);

        // Create a Circle instance
        Circle c2 = new Circle(50);

        // Apply styling to the Circle instance
        c2.setFill(Color.WHITE);
        c2.setStroke(Color.BLACK);
        c2.setStrokeWidth(1);

        // Create 2 Button instances
        Button b1 = new Button("Action 1");
        Button b2 = new Button("Action 2");

        StackPane stackPane = new StackPane();

        // Append the instances rect, c1, c2 to the pane
        stackPane.getChildren().addAll(rect, c1, c2);

        HBox hbox = new HBox(20);

        // Append the instances b1, b2 to the pane
        hbox.getChildren().addAll(b1, b2);

        BorderPane pane = new BorderPane();

        // Append the instances stackPane, hbox to the pane
        pane.setCenter(stackPane);
        pane.setBottom(hbox);

        // Layout options
        hbox.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20, 20, 20, 20));

        Scene scene = new Scene(pane, 400, 400);

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
