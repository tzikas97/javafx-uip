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
package bicycles;

/**
 *
 * @author tzikas97
 */
public class TestBicycles {
    public static void main(String[] args) {
        
        Bicycles b1 = new Bicycles(20, 3);
        b1.printDescription();
        
        System.out.println("----------");
        
        MountainBikes b2 = new MountainBikes(40, 5, 2);
        b2.printDescription();
        
    }
}




