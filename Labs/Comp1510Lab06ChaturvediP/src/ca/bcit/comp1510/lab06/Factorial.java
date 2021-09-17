/**
 * 
 */

package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Factorial - calculates the factorial of non-negative number.
 * 
 * @author Chaturvedi,Parth
 * @version 03-03-2021
 */

public class Factorial {
    
    /**
     * factorial of the the number. 
     * 
     * @param n the non negative number
     * @return the factorial of the number.
     */
    
    public static String factorial(int n) {
    
        int sum = 1;
        int i = 1;
        while (n >= i) {
            sum *= i;
            i++;
        }
        return "The factorial of " + n + " is " + sum;
    }
            
    /**
     * Driver the program.
     * 
     * @param args (unused)
     */
    
    public static void main(String[] args) {
        
        int n = 1;
        boolean f = true;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number");
        
        while (f) {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n > 0) {
                    f = false;
                    System.out.println(factorial(n));
                }
                else {
                    System.out.println("!!You entered a negative number!!");
                    System.out.println("Try again");
                }
            }
            else {
                System.out.println("!!You entered a string!!");
                System.out.println("Try again");
                scan.next();
            }            
        }
        scan.close();
        
    }
}
