/*
 * Copyright (C) 2019 George Tzikas <tzikas97@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package javafxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author tzikas97
 */
public class JavaFxBasics extends Application {

    /**
     *
     * @param firstStage The application's first stage
     */
    @Override
    public void start(Stage firstStage) {

        firstStage.setTitle("Μy First JavaFX Application");

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        ImageView flag1 = new ImageView("res/img/flag1.gif");
        ImageView flag2 = new ImageView("res/img/flag2.gif");
        ImageView flag3 = new ImageView("res/img/flag3.gif");

        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(btn1, btn2, btn3, flag1, flag2, flag3);

        Scene scene = new Scene(pane, 1500, 400);

        firstStage.setScene(scene);
        firstStage.show();
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
