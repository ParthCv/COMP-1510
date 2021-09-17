/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * Distance - tells the distance between two points in 2D.
 * @author Chaturvedi,Parth
 * @version 2021-02-01
 */
public class Distance {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        double x1;
        double x2;
        double y1;
        double y2;
        double distance;
        
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat fmt1 = new DecimalFormat("#.##");
        
        System.out.println("Enter the x1 coordinate ");
        x1 = scan.nextDouble();
        System.out.println("Enter the y1 coordinate ");
        y1 = scan.nextDouble();
        System.out.println("Enter the x2 coordinate ");
        x2 = scan.nextDouble();
        System.out.println("Enter the y2 coordinate ");
        y2 = scan.nextDouble();
        
        distance = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
        
        System.out.println("The distance between the lines is " +  distance);
        
        System.out.println("Formatted output " + fmt1.format(distance));
        
        scan.close();
    }

}
