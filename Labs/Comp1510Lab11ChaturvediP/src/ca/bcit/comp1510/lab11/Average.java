/**
 * 
 */

package ca.bcit.comp1510.lab11;

/**
 * Uses the command line arguments, displays them and calculates average. 
 * 
 * @author Chaturvedi,Parth
 * @version 17-04-2021
 */

public class Average {

    /**
     * Drives the program.
     * 
     * @param args used
     */
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        
        if (args.length > 0) {
            
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
                sum += Integer.parseInt(args[i]);
            }
            
            System.out.println("Sum of the numbers ->\t" + sum);
            
            avg = sum / args.length;
            System.out.println("Average of the numbers ->\t" + avg);
        } else {        
            System.out.println("No arguments!");
        }
    }

}
