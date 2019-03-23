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
package assignment3application3;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment3Application3 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment3Application3");

        // Store strings in a list
        List<String> stringsList = new ArrayList<>();

        stringsList.add("Computer Science");
        stringsList.add("Chemistry");
        stringsList.add("Arts");

        // Store colors in a list
        List<Color> colorsList = new ArrayList<>();

        colorsList.add(Color.GREEN);
        colorsList.add(Color.BLUE);
        colorsList.add(Color.YELLOW);

        // 20 -> Padding between items
        HBox hbox = new HBox(20);

        // 20 -> Padding between items
        VBox vbox = new VBox(20);

        for (int i = 0; i < 3; i++) {

            // Append a Button instance with text from stringsList
            // to the hbox
            hbox.getChildren().add(new Button(stringsList.get(i)));

            // Create a Text instance with text from stringsList
            Text text = new Text(stringsList.get(i));

            // Apply styling to the Text instance
            text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
            text.setFill(colorsList.get(i));

            // Append the Text instance to the vbox
            vbox.getChildren().add(text);
        }

        BorderPane pane = new BorderPane();

        // Layout options
        hbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        // Add children to pane
        pane.setTop(hbox);
        pane.setLeft(vbox);

        Scene scene = new Scene(pane, 300, 200);

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
