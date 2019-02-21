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

/**
 *
 * @author tzikas97
 */
public class TestCircleObject {

    /**
     *
     * @param args Input arguments
     */
    public static void main(String[] args){
        Circle obj1 = new Circle(2.2);
        
        System.out.println("Color: " + obj1.getColor());
        System.out.println("Area: " + obj1.getArea());
        System.out.println("Perimeter: " + obj1.getPerimeter());
        System.out.println("Diameter: " + obj1.getDiameter());                
    }   
}
