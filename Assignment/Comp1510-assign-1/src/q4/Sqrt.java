package q4;

import java.util.Scanner;

/**
 * Class Sqrt - Takes a number then estimates the square root of the number ten 
 * times. This done using newtons method. 
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */
public class Sqrt {
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        double a;
        double s;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        a = scan.nextDouble();
        
        s = (a + 1) / 2;        
        System.out.println("Frist estimate = " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Second estimate = " + s);
                
        s = (s + a / s) / 2;
        System.out.println("Third estimate = " + s);
                
        s = (s + a / s) / 2;
        System.out.println("Fourth estimate = " + s);
                
        s = (s + a / s) / 2;
        System.out.println("Fifth estimate = " + s);
                
        s = (s + a / s) / 2;
        System.out.println("Sixth estimate = " + s);
                
        s = (s + a / s) / 2;
        System.out.println("Seventh estimate = " + s);
                
        s = (s + a / s) / 2;
        System.out.println("Eighth estimate = " + s);
                
        s = (s + a / s) / 2;
        System.out.println("Ninth estimate = " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Tenth estimate = " + s);
        
        scan.close();
               
    }

};
