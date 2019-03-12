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
package assignment2application4;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment2Application4 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment2Application4");

        // Load labels in a list
        List<Label> labelsList = new ArrayList<>();

        // Load textfields in a list
        List<TextField> textFieldsList = new ArrayList<>();

        labelsList.add(new Label("First Name:"));
        labelsList.add(new Label("Initials:"));
        labelsList.add(new Label("Last Name:"));

        for (int i = 0; i < 3; i++) {
            textFieldsList.add(new TextField());
        }
        textFieldsList.get(0).setPromptText("Μικρό όνομα");
        textFieldsList.get(1).setPromptText("Αρχικά (Mr/Mrs/Miss)");
        textFieldsList.get(2).setPromptText("Επώνυμο");

        Button submitButton = new Button("Submit");

        GridPane pane = new GridPane();

        // Layout options
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setAlignment(Pos.CENTER);
        GridPane.setHalignment(submitButton, HPos.RIGHT);

        for (int i = 0; i < 3; i++) {
            pane.add(labelsList.get(i), 0, i);
            pane.add(textFieldsList.get(i), 1, i);
        }

        pane.add(submitButton, 1, 3);

        Scene scene = new Scene(pane, 350, 350);

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
