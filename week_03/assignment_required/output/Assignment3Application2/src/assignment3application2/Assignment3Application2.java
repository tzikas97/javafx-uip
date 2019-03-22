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
package assignment3application2;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
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
public class Assignment3Application2 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment3Application2");

        // Store text in a list
        List<Text> textList = new ArrayList<>();

        // Store colors in a list
        List<Color> colorsList = new ArrayList<>();

        colorsList.add(Color.RED);
        colorsList.add(Color.GREEN);
        colorsList.add(Color.GOLD);
        colorsList.add(Color.BLUE);
        colorsList.add(Color.FUCHSIA);

        // Add DrawText instances with color and rotation to the textList
        for (int i = 0; i < 5; i++) {
            textList.add(new DrawText("java", colorsList.get(i), 90));
        }

        // Apply styling to the DrawText instances
        for (int i = 0; i < 5; i++) {
            textList.get(i).setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
        }

        FlowPane pane = new FlowPane();

        // Layout options
        pane.setPadding(new Insets(30, 30, 30, 30));
        pane.setAlignment(Pos.CENTER);

        // Add children to pane
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
