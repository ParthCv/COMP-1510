/**
 * 
 */

package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Paint- class that drives the program.
 * @author Chaturvedi, Parth
 * @version 2021-01-25
 */
public class Paint {

    /** 
     * Integer Constant Coverage. 
     */
    public static final int COVERAGE = 400;
    
    /**
     * Program to calculate number of paint cans needed.
     * @param args unlisted
     */
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        double lenght;
        double width;
        double height;
        int coats;
        double surfaceArea;
        double coverageNeeded;
        int cansOfPaintNeeded;
        
        System.out.println("Enter the lenght of the room: ");
        lenght = myScanner.nextDouble();
        
        System.out.println("Enter the width of the room: ");
        width = myScanner.nextDouble();
        
        System.out.println("Enter the height of the room: ");
        height = myScanner.nextDouble();
        
        System.out.println("Number of coats: ");
        coats = myScanner.nextInt();
        
        surfaceArea = (2 * lenght * height) + (2 * width * height)
                      + (lenght * height);
       
        System.out.println("The surface area of the room is: " + surfaceArea);
        
        coverageNeeded = surfaceArea * coats;
        cansOfPaintNeeded = (int) (coverageNeeded / COVERAGE); 
        
        System.out.println("User needs to buy: " + cansOfPaintNeeded 
                           + " cans of paints");
        
        myScanner.close();

    }

}
