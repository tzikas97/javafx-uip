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
import geometricobject.GeometricObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tzikas97
 */
public class TestGeometricObject extends GeometricObject {

    /**
     *
     * Class GeometricObject is abstract & cannot be instantiated.
     * TestGeometricObject inherits the class GeometricObject, in order to be
     * able to test its methods.
     */
    /**
     *
     * @param args Input arguments
     */
    public static void main(String[] args) {

        List<TestGeometricObject> objects = new ArrayList<>();

        objects.add(new TestGeometricObject());

        for (int i = 0; i < objects.size(); i++) {
            System.out.println("\nObj " + (i + 1) + "\n----------");
            System.out.println(objects.get(i).toString());
        }
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printObject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
