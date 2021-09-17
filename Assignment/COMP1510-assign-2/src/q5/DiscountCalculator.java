package q5;

import java.util.Scanner;

/**
 * <p>
 * This is where you put your description about what this class does. You don't
 * have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 * </p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class DiscountCalculator {

    /**
     * DIS - for the maximum amount of discount that can be given. 
     */
    
    public static final int DIS = 75;
    
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        int cheese;
        int referral;
        int sum;
        int discount;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Discount Calculator\n");
        
        System.out.println("Enter number of cheese bought - ");
        cheese = scan.nextInt();
        
        System.out.println("Enter number of referrals - ");
        referral = scan.nextInt();
        
        sum = cheese + referral;
        discount = Math.min(sum, DIS);
        
        System.out.println("\nThe discount is " + discount + "%");
        
        scan.close();        
    }

}
