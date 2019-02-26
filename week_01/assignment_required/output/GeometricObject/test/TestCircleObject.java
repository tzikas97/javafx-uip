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
     * @param args Input arguments
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