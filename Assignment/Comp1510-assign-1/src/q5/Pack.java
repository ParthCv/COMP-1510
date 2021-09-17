package q5;

import java.util.Scanner;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */

public class Pack {
    
    /**
     * For the number three.
     */
    public static final int THREE = 3;
    
    /**
     * For the number four.
     */
    public static final int FOUR = 4;
    
    /**
     * For the number fifty six.
     */
    public static final int FIFSIX = 56;
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        int c1;
        int c2;
        int c3;
        int c4;
        int c5;
        int code;
        int temp;
        char d1;
        char d2;
        char d3;
        char d4;
        char d5;
        String input;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the code: ");
        input = scan.nextLine();
        
        c1 = input.charAt(0) - 'A' + 1;
        c2 = input.charAt(1) - 'A' + 1;
        c3 = input.charAt(2) - 'A' + 1;
        c4 = input.charAt(THREE) - 'A' + 1;
        c5 = input.charAt(FOUR) - 'A' + 1;
             
        code = (c1 * FIFSIX * FIFSIX * FIFSIX * FIFSIX) + (c2 * FIFSIX * FIFSIX 
                * FIFSIX) + (c3 * FIFSIX * FIFSIX) + (c4 * FIFSIX) + c5;
        
        System.out.println("The encoded MIX code is -> " + code);
        
        c5 = code % FIFSIX;
        temp = code / FIFSIX;
        
        c4 = temp % FIFSIX;
        temp = temp / FIFSIX;
        
        c3 = temp % FIFSIX;
        temp = temp / FIFSIX;
        
        c2 = temp % FIFSIX;
        temp = temp / FIFSIX;
        
        c1 = temp % FIFSIX;
        
        d1 = (char) (c1 - 1 + 'A');
        d2 = (char) (c2 - 1 + 'A');
        d3 = (char) (c3 - 1 + 'A');
        d4 = (char) (c4 - 1 + 'A');
        d5 = (char) (c5 - 1 + 'A');
        
        System.out.println("The decoded MIX code is -> " + d1 + d2 + d3 + d4 
            + d5);
        
        scan.close();
    }

};
