/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Class Dice - outputs dice values.
 * @author Chaturvedi,Parth
 * @version 2021-02-01
 */

public class Dice {
    
    /**
     * For number four.
     */
    public static final int FOUR = 4;
    
    /**
     * For number six.
     */
    public static final int SIX = 6;
    
    /**
     * For number eight.
     */
    public static final int EIGHT = 8;
    
    /**
     * For number ten.
     */
    public static final int TEN = 10;
    
    /**
     * For number twelve.
     */
    public static final int TWELVE = 12;
    
    /**
     * For number twenty.
     */
    public static final int TWENTY = 20;
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Random random = new Random();

        int fourside = random.nextInt(FOUR) + 1;
        int sixside = random.nextInt(SIX) + 1;
        int eightside = random.nextInt(EIGHT) + 1;
        int tenside = random.nextInt(TEN) + 1;
        int twelveside = random.nextInt(TWELVE) + 1;
        int twentyside = random.nextInt(TWENTY) + 1;
        
        System.out.println("The result for each die\n");
        System.out.println("four sided die " + fourside);
        System.out.println("six sided die " + sixside);
        System.out.println("eight sided die " + eightside);
        System.out.println("ten sided die " + tenside);
        System.out.println("twelve sided die " + twelveside);
        System.out.println("twenty sided die " + twentyside);
        
    }

}
