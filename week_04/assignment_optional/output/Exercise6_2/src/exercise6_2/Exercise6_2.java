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
package exercise6_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Exercise6_2 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        // Create 2 Button instances
        Button btnOK = new Button("Test");
        Button btnGreeting = new Button("Greeting");

        // Attach event handler to the btnOK instance
        btnOK.setOnAction((ActionEvent e) -> {

            // Invoke createNewWindow
            createNewWindow("Button test pressed!");

        });

        // Attach event handler to the btnGreeting instance
        btnGreeting.setOnAction((ActionEvent e) -> {

            // Invoke createNewWindow
            createNewWindow("Hello George. This is my first interactive program in JavaFX!");

        });

        HBox hBox = new HBox();

        // Layout options
        hBox.setPadding(new Insets(50, 100, 50, 100));
        hBox.setSpacing(20);
        hBox.setAlignment(Pos.CENTER);

        // Append the instances to the hBox
        hBox.getChildren().addAll(btnOK, btnGreeting);

        Scene scene = new Scene(hBox);

        firstStage.setTitle("Exercise 6.2");
        firstStage.setScene(scene);
        firstStage.show();
    }

    /**
     *
     * @param labelText The label's text
     */
    public void createNewWindow(String labelText) {

        StackPane stackPane = new StackPane(new Label(labelText));

        Scene newScene = new Scene(stackPane, 500, 200);

        Stage newStage = new Stage();

        newStage.setTitle("Example window");
        newStage.setScene(newScene);
        newStage.show();

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
