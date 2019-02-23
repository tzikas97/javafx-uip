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

import java.util.Date;

/**
 *
 * @author tzikas97
 */
public abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /**
     *
     * Κατασκευή προεπιλεγμένου γεωμετρικού αντικειμένου. Η ημερομηνία
     * λαμβάνεται από το σύστημα
     */
    public GeometricObject() {
        dateCreated = new Date();
    }

    /**
     *
     * Κατασκευάζει ένα προεπιλεγμένο γεωμετρικό αντικείμενο με καθορισμένο
     * χρώμα και τιμή γεμίσματος. Η ημερομηνία λαμβάνεται από το σύστημα
     *
     * @param color The object's color
     * @param filled Whether the object is filled
     */
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    /**
     *
     * Επιστρέφει χρώμα
     *
     * @return The object's color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * Θέτει νέα τιμή στην color
     *
     * @param color The object's color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * Επιστρέφει την τιμή γεμίσματος filled. Επειδή η filled είναι δυαδική, η
     * μέθοδος λήψης ονομάζεται isFilled
     *
     * @return Whether the object is filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     *
     * Θέτει νέα τιμή στη filled
     *
     * @param filled Whether the object is filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     *
     * Επιστρέφει την ημερομηνία δημιουργίας του αντικειμένου
     *
     * @return The object's creation date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     *
     * Επιστρέφει μια αναπαράσταση του αντικειμένου σε μορφή αλφαριθμητικού
     *
     * @return The object's string representation
     */
    public String toString() {
        return "created on "
                + dateCreated
                + "\ncolor: "
                + color
                + "\nfilled: "
                + filled;
    }

    /**
     *
     * Get the object's area
     */
    public abstract double getArea();

    /**
     *
     * Get the object's perimeter
     */
    public abstract double getPerimeter();

    /**
     *
     * Print the object
     */
    public abstract void printObject();
}
