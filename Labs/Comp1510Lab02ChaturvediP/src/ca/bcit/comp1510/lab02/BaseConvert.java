package ca.bcit.comp1510.lab02;

import java.util.Scanner;

import java.text.NumberFormat;

/*** BaseConvert.
* 
* @author Chaturvedi, Parth
* @version 2021-01-25
*/

public class BaseConvert {

    /***
    *  Drives the program.
    *  
    * @param args
    *            arguments
    */

    public static void main(String[] args) {
        int base10number;
        // the number in base 10
        int base;
        // the new base
        int maximumNumber = 0;
        // the maximum number that will fit
        // in 4 digits in the new base
        int place0; 
        // digit in the 1's (base^0) place
        int place1;
        int place2;
        int place3;
        int remainder;
        // to find the remainder in divisions
    
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();
    
        // Assign the user's input to the base variable
    
        // Calculate the correct value to store in maxNumber
        
        maximumNumber = ((base * base * base * base) - 1);
        System.out.println("The max base 10 number to convert for that base is "
                           + maximumNumber);
    
        System.out.print("Please enter a base 10 number to convert: ");
        base10number = scan.nextInt();
        // Assign the user's input to the base10number variable
    
        // Do the conversion
        // First compute place0 --the units place. Remember this comes
        // from the first division so it is the remainder when the
        // base 10 number is divided by the base (HINT %).
        // Then compute the quotient (integer division / will do it!) -
        // You can either store the result back in base10Num or declare a
        // new variable for the quotient
        // Now compute place1 --this is the remainder when the quotient
        // from the preceding step is divided by the base.
        // Then compute the new quotient
        // Repeat the idea from above to compute place2 and the next quotient
        // Repeat again to compute place3
        
        place0 = base10number % base;
        remainder = base10number / base;
                
        place1 = remainder % base;
        remainder = remainder / base;
                
        place2 = remainder % base;
        remainder = remainder / base;
                
        place3 = remainder % base;
        
        // Print the result
        String baseBNumber = new String("The number in base " + base + " is - " 
                                        + place3 + place2 + place1 + place0);
        System.out.println(baseBNumber);
        // the number in the new base
    
        scan.close();
        double total= 0.08;

        NumberFormat fmt1 = NumberFormat.getPercentInstance();

        System.out.println("Total: " + fmt1.format(total));
        
        String s1 = "Java" + "is easy";
    }
}
