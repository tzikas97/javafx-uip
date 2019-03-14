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
     * @param args The command line arguments
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
