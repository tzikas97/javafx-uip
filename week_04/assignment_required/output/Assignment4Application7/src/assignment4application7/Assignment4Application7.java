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
package assignment4application7;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment4Application7 extends Application {

    // Store strings in a list
    List<String> stringsList = new ArrayList<>();

    // Create a Label instance
    private Label label = new Label();

    // Create a Rectangle instance
    private Rectangle rect = new Rectangle(100, 50);

    // Store the Label instance's drag deltas in a list
    List<Double> dragDeltas = new ArrayList<>();

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment4Application7");

        stringsList.add("Move the mouse over the rectangle");
        stringsList.add("You entered the rectangle");
        stringsList.add("You exited the rectangle");
        stringsList.add("You dragged the text");

        // Apply styling to the Label instance
        label.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 15));
        label.setLayoutX(50);
        label.setLayoutY(80);

        // Apply styling to the Rectangle instance
        rect.setLayoutX(50);
        rect.setLayoutY(100);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);

        // Attach OnMouseEntered event handler to the Rectangle instance
        rect.setOnMouseEntered(e -> onMouseEntered());

        // Attach OnMouseExited event handler to the Rectangle instance
        rect.setOnMouseExited(e -> onMouseExited());

        // Attach OnMousePressed event handler to the Label instance
        label.setOnMousePressed(e -> onMousePressed(e));

        // Attach OnMouseDragged event handler to the Label instance
        label.setOnMouseDragged(e -> onMouseDragged(e));

        Pane pane = new Pane();

        // Append the instances to the pane
        pane.getChildren().addAll(label, rect);

        // Initial Label instance's text
        label.setText(stringsList.get(0));

        Scene scene = new Scene(pane, 400, 250);

        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     *
     * OnMouseEntered event handler method
     */
    private void onMouseEntered() {

        rect.setFill(Color.RED);
        label.setText(stringsList.get(1));

    }

    /**
     *
     * OnMouseExited event handler method
     */
    private void onMouseExited() {

        rect.setFill(Color.BLUE);
        label.setText(stringsList.get(2));

    }

    /**
     *
     * OnMousePressed event handler method
     *
     * @param e The MouseEvent instance
     */
    private void onMousePressed(MouseEvent e) {

        dragDeltas.add(0, label.getLayoutX() - e.getSceneX());
        dragDeltas.add(1, label.getLayoutY() - e.getSceneY());

    }

    /**
     *
     * OnMouseDragged event handler method
     *
     * @param e The MouseEvent instance
     */
    private void onMouseDragged(MouseEvent e) {

        label.setLayoutX(e.getSceneX() + dragDeltas.get(0));
        label.setLayoutY(e.getSceneY() + dragDeltas.get(1));
        label.setText(stringsList.get(3));

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
