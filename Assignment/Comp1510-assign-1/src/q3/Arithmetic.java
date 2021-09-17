package q3;

import java.util.Scanner;

/**
 * Class Arithmetic- Takes two values a and b, then calculates remainder and 
 * quotient for all combinations of positive and negative value of a an b. 
 *
 * @author Chaturvedi, Parth
 * @version 1.0
 */
public class Arithmetic {
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int r;
        int q;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter value of a ");
        a = scan.nextInt();
        
        System.out.println("Enter value of b ");
        b = scan.nextInt();
        
        System.out.println("Values for +a and +b");
        
        q = a / b;
        r = a % b;
        
        System.out.println("a = " + a + " b = " + b + " q = " + q + " r = " + r
            + " q * b + r = " + (q * b + r));
        
        System.out.println("\nValues for -a and +b");
        
        q = -a / b;
        r = -a % b;
        
        System.out.println("-a = " + -a + " b = " + b + " q = " + q + " r = " 
            + r + " q * b + r = " + (q * b + r));

        System.out.println("\nValues for +a and -b");
        
        q = a / -b;
        r = a % -b;
        
        System.out.println("a = " + a + " -b = " + -b + " q = " + q + " r = " 
            + r + " q * b + r = " + (q * b + r));

        System.out.println("\nValues for -a and -b");
        
        q = -a / -b;
        r = -a % -b;
        
        System.out.println("-a = " + -a + " -b = " + -b + " q = " + q + " r = " 
            + r + " q * b + r = " + (q * b + r));

       scan.close();       
        
    }

}
