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
public class MountainBikes extends Bicycles {

    private int seatHeight;

    /**
     * 
     * Constructor w/o arguments
     */
    public MountainBikes() {
        super();
        seatHeight = 0;
    }

    /**
     *
     * Constructor w/ arguments
     *
     * @param newSeatHeight The object's seat height
     */
    public MountainBikes(int newSeatHeight) {
        super();
        seatHeight = newSeatHeight;
    }

    /**
     *
     * Constructor w/ arguments
     *
     * @param newSpeed The object's speed
     * @param newGear The object's gear
     * @param newSeatHeight The object's seat height
     */
    public MountainBikes(int newSpeed, int newGear, int newSeatHeight) {
        super(newSpeed, newGear);
        seatHeight = newSeatHeight;
    }

    /**
     *
     * @return The object's seat height
     */
    public int getSeatHeight() {
        return seatHeight;
    }

    /**
     *
     * @param newSeatHeight The object's seat height
     */
    public void setSeatHeight(int newSeatHeight) {
        if (newSeatHeight < 1) {
            seatHeight = 1;
        } else {
            seatHeight = newSeatHeight;
        }
    }

    /**
     * 
     * The object's string representation
     */
    @Override
    public void printDescription() {
        System.out.println("The speed is: " + getSpeed() + " km/h");
        System.out.println("The gear is: " + getGear());
        System.out.println("The seat height is: " + getSeatHeight());
    }

}
