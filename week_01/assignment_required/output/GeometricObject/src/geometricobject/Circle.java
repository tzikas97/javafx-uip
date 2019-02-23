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
