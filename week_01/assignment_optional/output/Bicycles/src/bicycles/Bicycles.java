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
public class Bicycles {
    private int speed;
    private int gear;

    public void setSpeed(int newSpeed) {
        if (newSpeed < 0) {
            speed = 0;
        } else {
            speed = newSpeed;
        }
    }

    public void setGear(int newGear) {
        if (newGear < 1) {
            gear = 1;
        } else {
            gear = newGear;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void printDescription() {
        System.out.println("The speed is: " + getSpeed() + " km/h");
        System.out.println("The gear is: " + getGear());
    }

    public Bicycles() {
        speed = 0;
        gear = 1;
    }
    
    public Bicycles(int newSpeed, int newGear) {
        speed = newSpeed;
        gear = newGear;
    }
}



