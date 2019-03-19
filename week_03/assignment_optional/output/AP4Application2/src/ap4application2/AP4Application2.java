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
package ap4application2;

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
public class AP4Application2 extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("AP4Application2");

        // Load text in a list
        List<Text> textList = new ArrayList<>();

        textList.add(new Text("George"));
        textList.add(new Text("Tzikas"));

        for (int i = 0; i < 2; i++) {
            textList.get(i).setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
            textList.get(i).setFill(Color.BLUE);
            textList.get(i).setRotate(45);
        }

        DrawCircle circle1 = new DrawCircle(100, 100, 50, Color.BLUE, Color.RED);
        DrawCircle circle2 = new DrawCircle(100, 100, 50, Color.RED, Color.GREEN);
        DrawCircle circle3 = new DrawCircle(100, 100, 50, Color.GREEN, Color.BLUE);

        FlowPane pane = new FlowPane();

        // Layout options
        pane.setPadding(new Insets(30, 30, 30, 30));
        pane.setHgap(20);
        pane.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(circle1, textList.get(0), circle2, textList.get(1), circle3);

        Scene scene = new Scene(pane, 800, 200);

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
