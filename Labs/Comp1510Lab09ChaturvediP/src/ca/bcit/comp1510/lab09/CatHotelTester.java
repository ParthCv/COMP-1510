/**
 * 
 */

package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * Tests the methods of CatHotel.
 * 
 * @author Chaturvedi,Parth
 * @version 01-04-2021
 */
public class CatHotelTester {

    /**
     * Drives the program.
     * 
     * @param args (unused)
     */
    public static void main(String[] args) {
        
        CatHotel ct = new CatHotel("The Four Paws");
        
        Random rand = new Random();
        
        final int age = 18;
        
        Cat c1 = new Cat("Jennifurr", rand.nextInt(21));
        Cat c2 = new Cat("Meowsie", rand.nextInt(21));
        Cat c3 = new Cat("Purrito", rand.nextInt(21));
        Cat c4 = new Cat("Cindy Clawford", rand.nextInt(21));
        Cat c5 = new Cat("Cat Benatar", rand.nextInt(21));
        
        ct.addCat(c1);
        ct.addCat(c2);
        ct.addCat(c3);
        ct.addCat(c4);
        ct.addCat(c5);
        
        ct.printGuestList();
        
        System.out.println("\nTotal guest are " + ct.guestCount());
        
        System.out.println("\nRemoving guest older than 18");
        ct.removeOldGuest(age);
        
        ct.printGuestList();
        
        System.out.println("Removing all guest\n");
        
        ct.removeAllGuests();
        ct.printGuestList();        
        
    }

}
