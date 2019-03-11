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
        super.printDescription();
        System.out.println("The seat height is: " + getSeatHeight());
    }

}
