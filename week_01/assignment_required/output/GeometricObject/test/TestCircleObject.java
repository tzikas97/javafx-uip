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
import geometricobject.Circle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tzikas97
 */
public class TestCircleObject {

    /**
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        List<Circle> objects = new ArrayList<>();

        objects.add(new Circle());
        objects.add(new Circle(2.2));
        objects.add(new Circle(5, "red", true));

        for (int i = 0; i < objects.size(); i++) {
            System.out.println("\nObj " + (i + 1) + "\n----------");
            System.out.println(objects.get(i).toString());
            System.out.println("area: " + objects.get(i).getArea());
            System.out.println("perimeter: " + objects.get(i).getPerimeter());
            System.out.println("diameter: " + objects.get(i).getDiameter());
        }
    }
}
