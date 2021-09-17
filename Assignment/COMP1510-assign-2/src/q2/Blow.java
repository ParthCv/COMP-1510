/**
 * 
 */

package q2;

import java.util.Scanner;

/**
 * Blow - calls methods from Balloon class.
 * 
 * @author Chaturvedi,Parth
 * @version 1.0
 */
public class Blow {

    /**
     * Drives the program.
     * 
     * @param args (unused)
     */
    public static void main(String[] args) {
        
        double rad;
        
        Balloon b1 = new Balloon();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the radius of the balloon ");
        rad = scan.nextDouble();       
                
        b1.inflate(rad);
        
        System.out.println("The radius of the balloon is " + rad);
        System.out.println("\nThe volume of the balloon is " + b1.getVolume());
        
        scan.close();

    }

}
