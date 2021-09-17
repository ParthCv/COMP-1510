/**
 * 
 */

package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * IntegerWrapper- showcase the use of methods of Math class. 
 * @author Chaturvedi,Parth
 * @version 09-02-2021
 */
public class IntegerWrapper {

    /**
     * Drives the program.
     * @param args (unused)
     */
    public static void main(String[] args) {
        
        int num;
        String num1;
        String num2;
        int number1;
        int number2;
        int sum;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        num = scan.nextInt();
        
        //Conversion to different bases.
        System.out.println("Number in binary " + Integer.toBinaryString(num));
        System.out.println("Number in octal " + Integer.toOctalString(num));
        System.out.println("Number in hexadecimal " + Integer.toHexString(num));
        
        //Maximum and minimum values.
        System.out.println("Maximum integer value " + Integer.MAX_VALUE);
        System.out.println("Minimum integer value " + Integer.MIN_VALUE);
        
        System.out.println("\nEnter number 1 :");
        num1 = scan.next();
        
        System.out.println("Enter number 2 :");
        num2 = scan.next();
        
        number1 = Integer.parseInt(num1);
        number2 = Integer.parseInt(num2);
        
        sum = number1 + number2;
        
        System.out.println("the summ is : " + sum);
        
        scan.close();
    }

}
