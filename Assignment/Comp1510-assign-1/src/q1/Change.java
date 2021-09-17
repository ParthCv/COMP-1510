package q1;

import java.util.Scanner;

/**
 * Class Change - determine the fewest number of each bill and coin needed to 
 * represent that amount, starting with the highest.
 * 
 * @author Chaturvedi,Parth
 * @version 1.0
 */
public class Change {
    
    /** 
     * For ten dollar bills.
     */
    public static final int TEN = 10;
    
    /** 
     * For five dollar bills.
     */
    public static final int FIVE = 5;
    
    /**
     * For quarters.
     */
    public static final double QUARTER = 0.25;
    
    /** 
     * For dimes.
     */
    public static final double DIME = 0.10;
    
    /** 
     * For nickels.
     */
    public static final double NICKEL = 0.05;
    
    /** 
     * For pennies dividing by 100.
     */
    public static final double PENNY = 100;
    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
        
        int tenDollar;
        int fiveDollar;
        int tonnie;
        int loonie;
        int quarters;
        int dimes;
        int nickels;
        double pennies;
        double amount;
        double remainder;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the monetary amount");
        amount = scan.nextDouble();
        
        tenDollar = (int) (amount / TEN);
        remainder = amount % TEN;
        System.out.println(tenDollar + " ten dollar notes");
        
        fiveDollar = (int) (remainder / FIVE);
        remainder = remainder % FIVE;
        System.out.println(fiveDollar + " five dollar notes");
        
        tonnie = (int) (remainder / 2);
        remainder = remainder % 2;
        System.out.println(tonnie + " tonnies");
        
        loonie = (int) (remainder / 1);
        remainder = remainder % 1;
        System.out.println(loonie + " loonies");
        
        quarters = (int) (remainder / QUARTER);
        remainder = remainder % QUARTER;
        System.out.println(quarters + " quatres");
        
        dimes = (int) (remainder / DIME);
        remainder = remainder % DIME;
        System.out.println(dimes + " dimes");
        
        nickels = (int) (remainder / NICKEL);
        remainder = remainder % NICKEL;
        System.out.println(nickels + " nickels");
        
        pennies =  ((remainder * PENNY));
        System.out.println(remainder);
        System.out.println(pennies + " pennies");
        
        scan.close();
    }

};
