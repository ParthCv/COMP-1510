/**
 * 
 */

package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Circles- lab02 2nd part.
 * @author Chaturvedi, Parth
 * @version 2021-01-25
 */
public class Circle {

    /**
     * Constant for value of pi.
     */
    
    public static final float PI = 3.14159f;
    
    /**
     * Drives the program.
     * @param args unused
     */
        
    public static void main(String[] args) {
        double radius;
        double circumference;
        double area;
        double doubleRadius;
        double doubleCircumference;
        double doubleArea;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = myScanner.nextDouble();
        
        doubleRadius = 2 * radius;
        
        circumference = 2 * PI * radius;
        System.out.println("The circumference is: " + circumference);
        
        area = PI * radius * radius;
        System.out.println("The area is: " + area);    
        
        doubleCircumference = 2 * PI * doubleRadius;
        System.out.println("The Circumference with double radius is: " 
                            + doubleCircumference);
        
        doubleArea = PI * doubleRadius * doubleRadius;
        System.out.println("The area with double radius is:" + doubleArea);
        
        System.out.println("Times the circumference will increase when the"  
                           + "radius is double is " 
                           + (doubleCircumference / circumference)
                           + " times");
        
        System.out.println("Times the area will increase when radius is double "
                           + "is " + (doubleArea / area) + " times");
        
        myScanner.close();      

    }

}
