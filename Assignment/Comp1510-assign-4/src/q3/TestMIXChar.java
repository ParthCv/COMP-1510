package q3;

import java.util.Scanner;

/**
 * Class to test MIXChar and Messages Class.
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */

public class TestMIXChar {
    
    /**
     *  delta.
     */
    
    private static final char DELTA = '\u0394';
    
    /**
     *  sigma.
     */
    
    private static final char SIGMA = '\u03A3';
    
    /**
     * PI.
     */
    
    private static final char PI = '\u03A0';
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * runs the program.
     * 
     *  @param args (unused)
     */
    public static void main(String[] args) {
        
   
        //replace next line with your code:
        char[] tired =  {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
            DELTA, 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', SIGMA, PI, 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', 
            '6', '7', '8', '9', '.', ',', '(', ')', '+', '-', '*', '/', '=', 
            '$', '<', '>', '@', ';', ':', '\'' };
        
        MIXChar mx1 = new MIXChar(tired[1]);

        MIXChar mx2 = new MIXChar(tired[2]);
    
        MIXChar mx3 = new MIXChar(tired[2 + 1]);

        MIXChar mx4 = new MIXChar(tired[2 + 2]);

        MIXChar[] name = new MIXChar[]{mx1, mx2, mx3, mx4};
        Message msg = new Message(name);
        System.out.print(msg.toLongs());
        msg.decode();

        Scanner scan  = new Scanner(System.in);
        System.out.println("input a string: ");
        String exp = scan.next();
        Message ya = new Message(exp);
        System.out.println(ya.toLongs());
        ya.decode();
        scan.close();
    }
}
