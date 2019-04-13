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

/**
 *
 * @author tzikas97
 */
public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate = new java.util.Date();

    /**
     *
     * Constructor w/o arguments
     */
    public Loan() {

        this(2.5, 1, 1000);

    }

    /**
     *
     * Constructor w/ arguments
     *
     * @param annualInterestRate The object's annual interest rate value
     * @param numberOfYears The object's number of years value
     * @param loanAmount The object's loan amount value
     */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;

    }

    /**
     *
     * @return The object's annual interest rate value
     */
    public double getAnnualInterestRate() {

        return annualInterestRate;

    }

    /**
     *
     * @param annualInterestRate The object's annual interest rate value
     */
    public void setAnnualInterest(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;

    }

    /**
     *
     * @return The object's number of years value
     */
    public int getNumberOfYears() {

        return numberOfYears;

    }

    /**
     *
     * @param numberOfYears The object's number of years value
     */
    public void setNumberOfYears(int numberOfYears) {

        this.numberOfYears = numberOfYears;

    }

    /**
     *
     * @return The object's loan amount value
     */
    public double getLoanAmount() {

        return loanAmount;

    }

    /**
     *
     * @param loanAmount The object's loan amount value
     */
    public void setLoanAmount(double loanAmount) {

        this.loanAmount = loanAmount;

    }

    /**
     *
     * @return The object's loan date value
     */
    public java.util.Date getLoanDate() {

        return loanDate;

    }

    /**
     *
     * @return The monthly payment value
     */
    public double getMonthlyPayment() {

        double monthlyInterestRate = annualInterestRate / 1200;
        double mothlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return mothlyPayment;

    }

    /**
     *
     * @return The total payment value
     */
    public double getTotalPayment() {

        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;

    }

}
