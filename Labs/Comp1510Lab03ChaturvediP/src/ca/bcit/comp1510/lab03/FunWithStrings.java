/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * Class FunWithStrings - using various String class methods. 
 * @author Chaturvedi,Parth
 * @version 2021-02-01
 */

public class FunWithStrings {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        String input;
        String temp;
        String trimmedUserInput;
        
        Scanner scan = new Scanner(System.in);
        
        //Using the nextLine() method
        
        System.out.println("Enter your favrite book");
        input = scan.nextLine();
        
        System.out.println(input);
               
        //Using the next() method
        
        //System.out.println("Enter your favrite book");
        //input = scan.next();
        
        //System.out.println(input);   
        
        //nextLine() read input from the input device till the line change.
        //next() reads input from the input device till the space character.
        
        System.out.println("String lenght " + input.length());
        
        System.out.println("Whether the book name starts with \'the\' - " 
                            + input.startsWith("The")); 
        
        System.out.println("Using to toUpperCase() - " + input.toUpperCase());
        
        System.out.println(input);
        
        //As we can see method toUpperCase() does not permanently change the 
        //value of input.
        
        temp = input.toUpperCase();
        System.out.println(temp);
        //Yes it has worked now. Sting is an immutable class so we couldn't 
        //change it's value earlier.
        
        System.out.println(temp.toLowerCase());
        
        trimmedUserInput = "           ";
        System.out.println(trimmedUserInput.trim());
        trimmedUserInput = "     ";
        System.out.println(trimmedUserInput.trim());
        trimmedUserInput = "    word    ";
        System.out.println(trimmedUserInput.trim());
        trimmedUserInput = "    trimmed word     ";
        System.out.println(trimmedUserInput.trim());
        
        String first = input.substring(0, 1);
        String last = input.substring(input.length() - 1);
        String str = input.substring(1, input.length() - 1);
        System.out.println("The formatted string is ");
        System.out.println(first.toUpperCase() + str.trim() 
            + last.toUpperCase());
        
        scan.close();
    }
    

}
