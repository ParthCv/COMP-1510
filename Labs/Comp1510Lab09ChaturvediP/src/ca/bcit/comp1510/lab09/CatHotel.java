/**
 * 
 */

package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CatHotel.
 * 
 * @author Chaturvedi,Parth
 * @version 01-04-2021
 */
public class CatHotel {
    
    /**
     * List for storing all cats.
     */
    
    private List<Cat> guestCats;
    
    /**
     * String to store hotel name.
     */
    
    private String hotelName;
    
    CatHotel(String name) {
        hotelName = name;
        guestCats = new ArrayList<Cat>();
    }
    
    /**
     * Returns the hotel name.
     * @return hotelName
     */
    
    public String getHotelName() {
        return hotelName;
    }
    
    /**
     * Adds Cats to the guests at the hotel.
     * @param c cat object
     */
    
    public void addCat(Cat c) {
        guestCats.add(c);
    }
    
    /**
     * Removes all the cats from the hotel.
     */
    
    public void removeAllGuests() {        
        guestCats.clear();        
    }
    
    /**
     * Find the number of cats at the hotel.
     * @return number of cats
     */
    
    public int guestCount() {
        return guestCats.size();
    }
    
    /**
     * Removes the cats with age greater than n. 
     * @param n int for limit of age 
     */
    
    public void removeOldGuest(int n) {
        int count = 0;
        List<Integer> index = new ArrayList<Integer>();
        Iterator<Cat> catIterator = guestCats.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > n) {
                index.add(guestCats.indexOf(temp));
                //guestCats.remove(temp);
                count++;
            }            
        }
        for (int i = 0; i < index.size(); i++) {
            guestCats.remove(i);
        }
        System.out.println("Number of guest removed : " + count);
    }
    
    /**
     * Prints the hotel name and all cats at hotel.
     */
    
    public void printGuestList() {
        System.out.println("The guest at " + hotelName + " are :\n");
        for (Cat c:guestCats) {
            System.out.println(c);
        }        
    }
}
