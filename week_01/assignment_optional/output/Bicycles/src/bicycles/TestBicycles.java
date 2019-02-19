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
public class TestBicycles {
    public static void main(String[] args) {
        
        Bicycles b1 = new Bicycles(20, 3);
        b1.printDescription();
        
        System.out.println("----------");
        
        MountainBikes b2 = new MountainBikes(40, 5, 2);
        b2.printDescription();
        
    }
}



