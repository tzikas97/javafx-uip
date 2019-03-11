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
