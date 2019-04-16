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
package exercise7_1;

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
public class Exercise7_1 extends Application {

    // Create 5 TextField instances
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();

    // Create 2 Button instances
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        GridPane gridPane = new GridPane();

        // Layout options
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        // Store labels in a list
        List<Label> labelsList = new ArrayList<>();

        labelsList.add(new Label("Annual Interest Rate:"));
        labelsList.add(new Label("Number of Years:"));
        labelsList.add(new Label("Loan Amount:"));
        labelsList.add(new Label("Monthly Payment:"));
        labelsList.add(new Label("Total Payment:"));

        // Προσθήκη των πεδίων (label, textFields) στη διάταξη
        for (int i = 0; i < labelsList.size(); i++) {
            gridPane.add(labelsList.get(i), 0, i);
        }

        gridPane.add(tfAnnualInterestRate, 1, 0);
        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(tfLoanAmount, 1, 2);
        gridPane.add(tfMonthlyPayment, 1, 3);
        gridPane.add(tfTotalPayment, 1, 4);

        HBox hBox = new HBox(20);

        // Append the Button instances to the hBox
        hBox.getChildren().addAll(btnCalculate, btnClear);

        // Append the hBox instance to the gridPane
        gridPane.add(hBox, 1, 5);

        // Δεξιά στοίχιση των τιμών στα πεδία κειμένου (textFields)
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);

        // Μετατροπή των δύο τελευταίων πεδίων σε read-only
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);

        // Κλήση της calculateLoanPayment() για τη διαχείριση του πατήματος κουμπιού
        btnCalculate.setOnAction(e -> calculateLoanPayment());

        // Attach event handler to the "Clear" Button instance
        btnClear.setOnAction(e -> clearInputFields());

        Scene scene = new Scene(gridPane);

        firstStage.setTitle("LoanCalculator");
        firstStage.setScene(scene);
        firstStage.show();

    }

    /**
     *
     * Method that calculates the loan payment
     */
    private void calculateLoanPayment() {

        // Ανάγνωση των τιμών των πεδίων interest, year, loanAmount
        String interestInput = tfAnnualInterestRate.getText();
        String yearInput = tfNumberOfYears.getText();
        String loanAmountInput = tfLoanAmount.getText();

        // Convert input values from String to double / int
        double interest = Double.parseDouble(interestInput);
        int year = Integer.parseInt(yearInput);
        double loanAmount = Double.parseDouble(loanAmountInput);

        // Δημιουργία αντικειμένου της κλάσης loan και ταυτόχρονη κλήση του constructor
        // με τα κατάλληλα ορίσματα
        Loan loan = new Loan(interest, year, loanAmount);

        // Κλήση των getMonthlyPayment(), getTotalPayment() για την εξαγωγή της μηνιαίας
        // δόσης και του συνολικού ποσού και τοποθέτηση των τιμών αυτών στα αντίστοιχα πεδία
        Double monthlyPayment = loan.getMonthlyPayment();
        Double totalPayment = loan.getTotalPayment();

        tfMonthlyPayment.setText(String.format("%.2f", monthlyPayment));
        tfTotalPayment.setText(String.format("%.2f", totalPayment));

    }

    /**
     *
     * Method that clears the text fields
     */
    private void clearInputFields() {

        tfAnnualInterestRate.clear();
        tfNumberOfYears.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfTotalPayment.clear();

    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        Application.launch(args);

    }

}
