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


