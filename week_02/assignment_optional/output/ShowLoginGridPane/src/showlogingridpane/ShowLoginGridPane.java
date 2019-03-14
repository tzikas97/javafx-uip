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
package showlogingridpane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
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
public class ShowLoginGridPane extends Application {

    /**
     *
     * @param myStage The application's first stage
     */
    @Override
    public void start(Stage myStage) {
        GridPane myGrid = new GridPane();
        myGrid.setPadding(new Insets(10, 10, 10, 10));
        myGrid.setVgap(10);
        myGrid.setHgap(10);

        Label lblName = new Label("Username:");
        Label lblPwd = new Label("Password:");

        TextField txtName = new TextField();
        TextField txtPwd = new TextField();

        txtPwd.setPromptText("password");

        Button btnLogin = new Button("Log in");

        GridPane.setHalignment(btnLogin, HPos.RIGHT);

        // πρώτος τρόπος: χρήση μεθόδου add() για προσθήκη control
        // και θέσης ταυτόχρονα στο grid
        myGrid.add(lblName, 0, 0);

        //προσθέστε το lblPwd στο Grid
        myGrid.add(lblPwd, 0, 1);

        //προσθέστε το txtName στο Grid
        myGrid.add(txtName, 1, 0);

        //προσθέστε το txtPwd στο Grid
        myGrid.add(txtPwd, 1, 1);

        //προσθέστε το btnLogin στο Grid
        myGrid.add(btnLogin, 1, 2);

        /*

        // This needs to be commented out because of:
        // java.lang.IllegalArgumentException: Children: duplicate children added:

        // δεύτερος τρόπος: χρήση στατικής μεθόδου setConstraints()
        GridPane.setConstraints(lblName, 0, 0);

        //προσθέστε το lblPwd στο Grid
        GridPane.setConstraints(lblPwd, 0, 1);

        //προσθέστε το txtName στο Grid
        GridPane.setConstraints(txtName, 1, 0);

        //προσθέστε το txtPwd στο Grid
        GridPane.setConstraints(txtPwd, 1, 1);

        //προσθέστε το btnLogin στο Grid
        GridPane.setConstraints(btnLogin, 1, 2);

        //προσθέστε όλα τα controls στο pane
        myGrid.getChildren().addAll(lblName, txtName, lblPwd, txtPwd);

         */
        Scene myScene = new Scene(myGrid, 250, 115);

        myStage.setTitle("Login screen");
        myStage.setScene(myScene);
        myStage.show();
    }

    /**
     * @param args Τhe command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
