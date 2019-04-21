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
package assignment4application5;

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
public class Assignment4Application5 extends Application {

    // Store textfields in a list
    private List<TextField> textFieldsList = new ArrayList<>();

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Assignment4Application5");

        // Create 5 TextField instances
        // 0 -> Initial Capital
        // 1 -> Years
        // 2 -> Annual Interest Rate
        // 3 -> Future Value
        // 4 -> Future Earnings
        for (int i = 0; i < 5; i++) {
            textFieldsList.add(new TextField());
        }

        // Set the TextField instances'
        // text alignment property to CENTER_RIGHT
        for (int i = 0; i < textFieldsList.size(); i++) {
            textFieldsList.get(i).setAlignment(Pos.CENTER_RIGHT);
        }

        // Set the last 2 TextField instances as read-only
        for (int i = textFieldsList.size() - 2; i < textFieldsList.size(); i++) {
            textFieldsList.get(i).setEditable(false);
        }

        // Store labels in a list
        List<Label> labelsList = new ArrayList<>();

        // Create 5 Label instances
        labelsList.add(new Label("Initial Capital:"));
        labelsList.add(new Label("Years:"));
        labelsList.add(new Label("Annual Interest Rate:"));
        labelsList.add(new Label("Future Value:"));
        labelsList.add(new Label("Future Earnings:"));

        // Create 2 Button instances
        Button btnCalculate = new Button("Calculate");
        Button btnClear = new Button("Clear");

        HBox hBox = new HBox();

        // Append the instances to the hBox
        hBox.getChildren().addAll(btnCalculate, btnClear);

        GridPane gPane = new GridPane();

        // Append the Label, TextField instances to the gPane
        for (int i = 0; i < 5; i++) {
            gPane.add(labelsList.get(i), 0, i);
            gPane.add(textFieldsList.get(i), 1, i);
        }

        // Append the hBox instance to the gPane
        gPane.add(hBox, 1, 5);

        // Attach OnAction event handlers to the Button instances
        btnCalculate.setOnAction(e -> performCalculation());
        btnClear.setOnAction(e -> clearInputFields());

        // Layout options
        gPane.setPadding(new Insets(10, 10, 10, 10));
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);

        Scene scene = new Scene(gPane);

        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     *
     * Method that performs the calculations
     */
    private void performCalculation() {

        // Store input in a list
        List<Double> inputList = new ArrayList<>();

        // Get & convert input values from String to double
        for (int i = 0; i < textFieldsList.size() - 2; i++) {
            inputList.add(Double.parseDouble(textFieldsList.get(i).getText()));

        }

        // Display the results in the last 2 TextField instances
        textFieldsList.get(textFieldsList.size() - 2).setText(String.format("%.2f", calcFutureValue()));
        textFieldsList.get(textFieldsList.size() - 1).setText(String.format("%.2f", calcFutureEarnings()));

    }

    /**
     *
     * Method that calculates the monthly interest rate
     *
     * @return The monthly interest rate result value
     */
    private double calcMonthlyInterestRate() {

        return Double.parseDouble(textFieldsList.get(2).getText()) / 1200;

    }

    /**
     *
     * Method that calculates the monthly payment
     *
     * @return The monthly payment result value
     */
    private double calcMonthlyPayment() {

        return Double.parseDouble(textFieldsList.get(0).getText())
                * (calcMonthlyInterestRate()
                / (1
                + (1
                / Math.pow(1
                        + calcMonthlyInterestRate(),
                        Double.parseDouble(textFieldsList.get(1).getText())
                        * 12))));

    }

    /**
     *
     * Method that calculates the future value
     *
     * @return The future value result value
     */
    private double calcFutureValue() {

        return Double.parseDouble(textFieldsList.get(0).getText())
                + calcMonthlyPayment() * 12;

    }

    /**
     *
     * Method that calculates the future earnings
     *
     * @return The future earnings result value
     */
    private double calcFutureEarnings() {

        return calcFutureValue()
                - Double.parseDouble(textFieldsList.get(0).getText());

    }

    /**
     *
     * Method that clears the text fields
     */
    private void clearInputFields() {

        for (int i = 0; i < textFieldsList.size(); i++) {
            textFieldsList.get(i).clear();
        }

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
