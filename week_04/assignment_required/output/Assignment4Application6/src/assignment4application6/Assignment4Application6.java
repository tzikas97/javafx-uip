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
package assignment4application6;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment4Application6 extends Application {

    // Store strings in a list
    List<String> stringsList = new ArrayList<>();

    // Create 1 Label instance
    Label label = new Label();

    // Initialize a flag variable
    private static int stringFlag = -1;

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment4Application6");

        stringsList.add("Java is ");
        stringsList.add("fun");
        stringsList.add("powerful");

        // Apply styling to the Label instance
        label.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
        label.setTextFill(Color.BLUE);

        HBox hBox = new HBox();

        // Append the instance to the hBox
        hBox.getChildren().add(label);

        // Attach OnMouseClicked event handler to the Label instance
        label.setOnMouseClicked(e -> swapText());

        // Layout options
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        // Initial text swap
        swapText();

        Scene scene = new Scene(hBox, 350, 150);

        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     *
     * Method that swaps the text in the Label instance
     */
    private void swapText() {

        // Invert the flag variable
        stringFlag = -stringFlag;

        // Set the Label instance's text
        label.setText(stringsList.get(0)
                + (1 == stringFlag ? stringsList.get(1) : stringsList.get(2))
        );

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
