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
package assignment4application4;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class Assignment4Application4 extends Application {

    // Store textfields in a list
    private List<TextField> textFieldsList = new ArrayList<>();

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment4Application4");

        // Create 3 TextField instances
        for (int i = 0; i < 3; i++) {
            textFieldsList.add(new TextField());
        }

        // Initialize the first 2 TextField instances
        for (int i = 0; i < 2; i++) {
            textFieldsList.get(i).setText("0.0");
        }

        // Set the last TextField instance as read-only
        textFieldsList.get(2).setEditable(false);

        // Store labels in a list
        List<Label> labelsList = new ArrayList<>();

        // Create 3 Label instances
        labelsList.add(new Label("Number 1:"));
        labelsList.add(new Label("Number 2:"));
        labelsList.add(new Label("Result:"));

        // Create 4 Button instances
        Button btnAdd = new Button("Add");
        Button btnSub = new Button("Subtract");
        Button btnMul = new Button("Multiply");
        Button btnDiv = new Button("Divide");

        HBox hBox = new HBox();

        // Append the instances to the hBox
        hBox.getChildren().addAll(btnAdd, btnSub, btnMul, btnDiv);

        GridPane gPane = new GridPane();

        // Append the Label, TextField instances to the gPane
        for (int i = 0; i < 3; i++) {
            gPane.add(labelsList.get(i), 0, i);
            gPane.add(textFieldsList.get(i), 1, i);
        }

        // Append the hBox instance to the gPane
        gPane.add(hBox, 1, 3);

        // Attach OnAction event handlers to the Button instances
        btnAdd.setOnAction(e -> performOperation(0));
        btnSub.setOnAction(e -> performOperation(1));
        btnMul.setOnAction(e -> performOperation(2));
        btnDiv.setOnAction(e -> performOperation(3));

        // Layout options
        gPane.setPadding(new Insets(10, 10, 10, 10));
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);

        Scene scene = new Scene(gPane, 350, 200);

        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     *
     * Method that performs the requested operation
     *
     * @param operation The requested operation
     */
    private void performOperation(int operation) {

        // Get & convert input values from String to double
        double num1 = Double.parseDouble(textFieldsList.get(0).getText());
        double num2 = Double.parseDouble(textFieldsList.get(1).getText());

        // Declare a result variable
        double result = 0;

        // Perform the requested operation
        // 0 -> Addition
        // 1 -> Subtraction
        // 2 -> Multiplication
        // 3 -> Division
        switch (operation) {

            case 0:
                result = performAddition(num1, num2);
                break;

            case 1:
                result = performSubtraction(num1, num2);
                break;

            case 2:
                result = performMultiplication(num1, num2);
                break;

            case 3:
                result = performDivision(num1, num2);
                break;

        }

        // Display the result in the last TextField instance
        textFieldsList.get(2).setText(String.format("%.1f", result));

    }

    /**
     *
     * Method that performs addition
     *
     * @param d1 The first input value
     * @param d2 The second input value
     * @return The operation's result value
     */
    private double performAddition(double d1, double d2) {

        return d1 + d2;

    }

    /**
     *
     * Method that performs subtraction
     *
     * @param d1 The first input value
     * @param d2 The second input value
     * @return The operation's result value
     */
    private double performSubtraction(double d1, double d2) {

        return d1 - d2;

    }

    /**
     *
     * Method that performs multiplication
     *
     * @param d1 The first input value
     * @param d2 The second input value
     * @return The operation's result value
     */
    private double performMultiplication(double d1, double d2) {

        return d1 * d2;

    }

    /**
     *
     * Method that performs division
     *
     * @param d1 The first input value
     * @param d2 The second input value
     * @return The operation's result value
     */
    private double performDivision(double d1, double d2) {

        return d1 / d2;

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
