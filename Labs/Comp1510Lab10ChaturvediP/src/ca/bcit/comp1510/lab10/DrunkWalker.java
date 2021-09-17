/**
 * 
 */

package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Simulates a drunk walker.
 * 
 * @author Chaturvedi,Parth
 * @version 07-04-2021
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        int bound;
        int step;
        int drunks;
        int success = 0;
        int fail = 0;
           
        Scanner scan = new Scanner(System.in);
           
        System.out.println("Enter the boundary");
        bound = scan.nextInt();
           
        System.out.println("Enter the number of steps");
        step = scan.nextInt();
           
        System.out.println("Enter the number of drunks");
        drunks = scan.nextInt();
        
        scan.close();
           
        for (int i = 1; i <= drunks; i++) {
            System.out.println("Drunk " + i);
            RandomWalker rw = new RandomWalker(step, bound);
            while (rw.moreSteps() && rw.inBounds()) {
                rw.takeStep();
                if (!rw.moreSteps()) {
                    System.out.println("The drunk survived!!");
                    fail++;
                } else if (!rw.inBounds()) {
                    System.out.println("The drunk fell!!");
                    success++;
                } else {
                    System.out.println("x-cord = " + rw.getXcord() 
                        + " y-cord = " + rw.getYcord() + "\nSteps = " 
                            + rw.getSteps());
                    System.out.println("------------------------");
                }
            }
            System.out.println("****************************");
               
        }
        
        System.out.println("\nOut of " + drunks + " " + success + " fell and " 
                + fail + " survived.");
           
    }

}
