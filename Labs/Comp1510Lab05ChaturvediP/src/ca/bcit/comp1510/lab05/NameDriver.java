/**
 * 
 */

package ca.bcit.comp1510.lab05;

import java.util.Scanner;

/**
 * NameDriver - uses the methods of Name class.
 * 
 * @author Chaturvedi,Parth
 * @version 18-02-2021
 */

public class NameDriver {

    /**
     * Drives the program.
     * 
     * @param args (unused)
     */
    public static void main(String[] args) {
        
        int x;
        String nam;
        
        Scanner scan = new Scanner(System.in);
        
        Name nm = new Name("Parth", "Kumar", "Chaturvedi");
        Name nm1 = new Name("Pooja", "Kumar", "Chaturvedi");
        
        System.out.println("Formatted name - " + nm.formatName());
        
        System.out.println("The initials are - " + nm.initial());
        
        System.out.println("Lenght of name = " + nm.nameLenght());
        
        System.out.print("Enter the integer = ");
        x = scan.nextInt();
        
        System.out.println("The Character at n is - " + nm.charFind(x - 1)); 
        
        System.out.print("Enter the string = ");
        nam = scan.next();
        
        System.out.println("Is first name same?" + nm.firstNameCompare(nam));
        
        System.out.println("Is name same as second object?" 
            + nm1.nameCompare(nm));
        
        scan.close();
    }

}
