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
public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    /**
     *
     * Constructor w/o arguments
     */
    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    /**
     *
     * Constructor w/ arguments
     *
     * @param width The object's width
     * @param height The object's height
     */
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    /**
     *
     * Constructor w/ arguments
     *
     * @param width The object's width
     * @param height The object's height
     * @param color The object's color
     * @param filled Whether the object is filled
     */
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @return The object's width
     */
    public double getWidth() {
        return width;
    }

    /**
     *
     * @param width The object's width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *
     * @return The object's height
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @param height The object's height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     *
     * @return The object's area
     */
    public double getArea() {
        return width * height;
    }

    /**
     *
     * @return The object's perimeter
     */
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    /**
     *
     * @return The object's string representation
     */
    @Override
    public String toString() {
        return "Rectangle "
                + super.toString()
                + "\nwidth: "
                + width
                + "\nheight: "
                + height;
    }

    /**
     *
     * Print the object
     */
    public void printObject() {
        System.out.println(toString());
    }
}
