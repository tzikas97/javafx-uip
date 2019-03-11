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
package bicycles;

/**
 *
 * @author tzikas97
 */
public class Bicycles {
    private int speed;
    private int gear;

    /**
     * 
     * Constructor w/o arguments
     */
    public Bicycles() {
        speed = 0;
        gear = 1;
    }
    
    /**
     *
     * Constructor w/ arguments
     * 
     * @param newSpeed The object's speed
     * @param newGear The object's gear
     */
    public Bicycles(int newSpeed, int newGear) {
        speed = newSpeed;
        gear = newGear;
    }
    
    /**
     *
     * @return The object's speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *
     * @param newSpeed The object's speed
     */
    public void setSpeed(int newSpeed) {
        if (newSpeed < 0) {
            speed = 0;
        } else {
            speed = newSpeed;
        }
    }

    /**
     *
     * @return The object's gear
     */
    public int getGear() {
        return gear;
    }

    /**
     *
     * @param newGear The object's gear
     */
    public void setGear(int newGear) {
        if (newGear < 1) {
            gear = 1;
        } else {
            gear = newGear;
        }
    }

    /**
     *
     * The object's string representation
     */
    public void printDescription() {
        System.out.println("The speed is: " + getSpeed() + " km/h");
        System.out.println("The gear is: " + getGear());
    }
}
