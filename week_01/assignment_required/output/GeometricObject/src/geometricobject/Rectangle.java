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
public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    /**
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
    public double getArea(){
        return width * height;
    }
     
    /**
     *
     * @return The object's perimeter
     */
    public double getPerimeter(){
        return 2 * width + 2 * height;
    }
    
    /**
     * 
     * @return The object's string representation
     */
    @Override
    public String toString(){
        return "Rectangle "
                + super.toString()
                + "\nwidth: "
                + width
                + "\nheight: "
                + height;
    }
}
