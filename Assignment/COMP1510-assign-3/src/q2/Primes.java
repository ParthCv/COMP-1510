package q2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Program to find the prime numbers between the upper bound and 0 using sieve 
 * of Eratosthenes.
 *
 * @author Chaturvedi,Parth
 * @version 29-03-2021
 */

public class Primes {
    
    /**
     * list for the primes.
     */
    
    private List<Boolean> num = new ArrayList<Boolean>();
    
    /**
     * to store the upper bound.
     */
    
    private int number;
    
    Primes(int n) {
        number = n;
        for (int i = 0; i <= number; i++) {
            num.add(true);
        }
        calculatePrime();
        
    }
    
    /**
     * Calculates the prime and set the non-primes to false.
     */
    
    private void calculatePrime() {
        for (int p = 2; p < Math.sqrt(number); p++) {
            if (num.get(p)) {
                for (int j = p; j * p <= number; j++) {
                    num.set(p * j, false);
                }
            }
        }
    }
    
    /**
     * Prints the primes for 0 to upper bound. 
     */
    
    private void printPrimes() {
        for (int i = 2; i <= number; i++) {
            if (num.get(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    /**
     * Counts the number of primes in the list.
     * 
     * @return count of the primes
     */
    
    private int countPrimes() {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (num.get(i)) {
                count++;
            }
        }
        return count;
    }       
    
    
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("This program uses the sieve of Eratosthenes to "
                + "determine which numbers are prime.");
        System.out.println("Enter an upper bound:");
        
        num = scan.nextInt();
        
        if (num < 0) {
            extracted();
        }       
        
        Primes p = new Primes(num);
        
        System.out.println("There are " + p.countPrimes() + " primes:");
        System.out.println("The prime numbers between 0 and " + num + " are:");
        p.printPrimes();
        
        scan.close();
    }

    private static void extracted() {
        throw new InputMismatchException();
    }

}
