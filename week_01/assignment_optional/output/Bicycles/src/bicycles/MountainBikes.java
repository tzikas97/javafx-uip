/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;

/**
 *
 * @author tzikas97
 */
public class MountainBikes extends Bicycles{
    private int seatHeight;

    public void setSeatHeight(int newSeatHeight) {
        if (newSeatHeight < 1) {
            seatHeight = 1;
        } else {
            seatHeight = newSeatHeight;
        }
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    @Override
    public void printDescription() {
        System.out.println("The speed is: " + getSpeed() + " km/h");
        System.out.println("The gear is: " + getGear());
        System.out.println("The seat height is: " + getSeatHeight());
    }

    public MountainBikes() {
        super();
        seatHeight = 0;
    }

    public MountainBikes(int newSpeed, int newGear, int newSeatHeight) {
        super(newSpeed, newGear);
        seatHeight = newSeatHeight;
    }
}





