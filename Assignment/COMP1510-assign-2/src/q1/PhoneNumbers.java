package q1;

import java.util.Scanner;

/**
 * PhoneNumbers - Take a phone number as the input and then prints the formatted
 * phone number.
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */

public class PhoneNumbers {
    
    /**
     * THREE - for the number three.
     */
    
    public static final int THREE = 3;
    
    /**
     * SIX - for the number six.
     */
    
    public static final int SIX = 6;
    
    /**
     * TEN - for the number ten.
     */
    
    public static final int TEN = 10;
    
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        
        String phNum;
        String start;
        String middle;
        String last;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the phone number ");
        phNum = scan.next();
        
        start = phNum.substring(0, THREE);     
        middle = phNum.substring(THREE, SIX);       
        last = phNum.substring(SIX, TEN);        
        
        System.out.println("The formatted number is :-");
        System.out.println(start + ")" + middle + "-" + last);
        
        scan.close();
    }

}
