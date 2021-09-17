package q2;

import java.util.Scanner;

/**
 * SecondsConvert - Takes input in hours, minutes and seconds then converts it
 * into total seconds.
 * 
 * @author Chaturvedi,Parth
 * @version 1.0
 */
public class SecondsConvert {
    
    /**
     * To multipy minutes and hours.
     */
    
    public static final int SIXTY = 60;
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        int hours;
        int minutes;
        int seconds;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Time Conversion\n");
        
        System.out.println("Enter the number of hours ");
        hours = scan.nextInt();
        
        System.out.println("Enter the number of minutes ");
        minutes = scan.nextInt();
        
        System.out.println("Enter the number of seconds ");
        seconds = scan.nextInt();
        
        seconds += (minutes * SIXTY) + (hours * SIXTY * SIXTY);
        
        System.out.println("The time in seconds is : " + seconds + " seconds");
        
        scan.close();
    }

};
