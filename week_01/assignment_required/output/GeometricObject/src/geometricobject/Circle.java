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
package geometricobject;

/**
 *
 * @author tzikas97
 */
public class Circle extends GeometricObject {

    private double radius = 0;

    /**
     *
     * Constructor w/o arguments
     */
    public Circle() {
    }

    /**
     *
     * Constructor w/ arguments
     *
     * @param radius The object's radius
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     *
     * Constructor w/ arguments
     *
     * @param radius The object's radius
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     *
     * @return The object's radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius The object's radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return The object's area
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     *
     * @return The object's perimeter
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     *
     * @return The object's diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     *
     * Επιστρέφει μια αναπαράσταση του αντικειμένου σε μορφή αλφαριθμητικού
     *
     * @return The object's string representation
     */
    @Override
    public String toString() {
        return "Circle "
                + super.toString()
                + "\nradius: "
                + radius;
    }

    /**
     *
     * Print the object
     */
    public void printObject() {
        System.out.println(toString());
    }
}

/**
 *
 * 1) Η μέθοδος toString της κλάσης Circle καλεί την μέθοδο toString της
 * κληρονομημένης κλάσης GeometricObject με super.toString().
 *
 * 2) Το @Override annotation χρησιμοποιείται για την πληροφόρηση του compiler
 * πως πρόκειται να γίνει παράκαμψη της κληρονομημένης μεθόδου.
 *
 * 3) Το keyword this είναι μεταβλητή αναφοράς (reference variable) που
 * αναφέρεται στο τρέχον αντικείμενο. Χρησιμοποιείται διότι οι τοπικές
 * μεταβλητές εντός των μεθόδων και οι μεταβλητές instance έχουν το ίδιο όνομα.
 */
