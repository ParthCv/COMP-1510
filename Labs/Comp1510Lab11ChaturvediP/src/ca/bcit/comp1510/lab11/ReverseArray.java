/**
 * 
 */

package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Program to reverse an array.
 * 
 * @author Chaturvedi,Parth
 * @version 17-04-2021
 */

public class ReverseArray {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        int index;
        int temp;        
        int[] arr;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter The Size Of Array");
        index = scan.nextInt();
        arr = new int[index];
        
        for (int i = 0; i < index; i++) {
            System.out.println("Enter value " + (i + 1));
            arr[i] = scan.nextInt();
        }
        
        scan.close();
        
        System.out.print("Orignal Array\t-> ");
        
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + "\t");            
        }
        
        System.out.print("\nReversed Array\t-> ");
        
        for (int i = 0; i < index / 2; i++) {        
            temp = arr[i];
            arr[i] = arr[index - 1 - i];
            arr[index - 1 - i] = temp;
        }
       
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + "\t");            
        }

    }

}
