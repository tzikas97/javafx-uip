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
package showflowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class ShowFlowPane extends Application {

    /**
     *
     * @param myStage The application's first stage
     */
    @Override
    public void start(Stage myStage) {
        //Δημιουργία FlowPane
        FlowPane myPane = new FlowPane();
        myPane.setOrientation(Orientation.VERTICAL);  //Θέστε  προσανατολισμό
        myPane.setPadding(new Insets(10, 20, 30, 40)); //Θέστε ανω, κάτω, αριστερό και δεξί περιθώριο
        myPane.setHgap(5);  //θέστε οριζόντιο περιθώριο μεταξύ των εικόνων
        myPane.setVgap(5);  //θέστε κατακόρυφο περιθώριο μεταξύ των εικόνων

        //Δημιουργία control nodes και τοποθέτησή τους εντος του pane
        //Δημιουργία lblName, lblMiddleNameddleName, lblLastName
        Label lblName = new Label("First Name:");
        Label lblMiddleName = new Label("MI:");
        Label lblLastName = new Label("Last Name:");

        //Δημιουργία txtName, txtMiddleName, txtLastName
        TextField txtName = new TextField();
        TextField txtMiddleName = new TextField();
        TextField txtLastName = new TextField();

        //Προσθήκη κόμβων στο pane
        myPane.getChildren().addAll(lblName, txtName, lblMiddleName, txtMiddleName, lblLastName, txtLastName);

        //Δημιουργία σκηνικού διαστάσεων 250 χ 250 και προσθήκη του pane σε αυτό
        Scene scene = new Scene(myPane, 250, 250);

        //Προσθήκη σκηνικού στο παράθυρο
        myStage.setScene(scene);

        //Προσθήκη τίτλου "show Flow pane"
        myStage.setTitle("show Flow pane");

        //Εμφάνιση του παραθύρου
        myStage.show();
    }

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
