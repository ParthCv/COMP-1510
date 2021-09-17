/**
 * 
 */

package ca.bcit.comp1510.lab09;

/**
 * w.
 * 
 * @author Chaturvedi,Parth
 * @version 01-04-2021
 */
public class CoinRunner {
    
    /**
     * For the number 100.
     */
    
    public static final int HUND = 100;

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    
    public static void main(String[] args) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < HUND; i++) {            
            Coin c = new Coin();
            System.out.println(c);
            if (c.isHeads()) {
                count++;
            } else {
                if (count >= maxCount) {
                    maxCount = count;                    
                }
                count = 0;                
            }
        }
        System.out.print("The longest run of heads is " + maxCount);
    }

}
