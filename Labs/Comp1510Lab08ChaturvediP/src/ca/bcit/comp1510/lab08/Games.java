/**
 * 
 */

package ca.bcit.comp1510.lab08;

import java.util.Random;
import java.util.Scanner;

/**
 * Game - Plays various games as per the users choice and records the score.
 * 
 * @author Chaturvedi Parth
 * @version 23-03-2021
 */
public class Games {    

    /**
     * THREE - for the number three.
     */
    
    public static final int THREE = 3;
    
    /**
     * FOUR - for the number four.
     */
    
    public static final int FOUR = 4;
    
    /**
     * FIVE - for the number five.
     */
    
    public static final int FIVE = 5;
    
    /**
     * HUND - for the number hundred. 
     */
    
    public static final int HUND = 100;
    
    /**
     * score - to store the users score.
     */
    
    private static int score;
    
    /**
     * userChoice -  to store the input from the menu.
     */
    
    private static Scanner userChoice;
    
    /**
     * randomNum - to store a randomly generated number.
     */
    
    private static Random randomNum;    
    
    /**
     * val - for the while loop to run. 
     */
    
    private boolean val = true;
    
    Games() {
        score = 0;
        userChoice = new Scanner(System.in);
        randomNum = new Random();        
    }
    
    /**
     * play() - Takes the users input and does according to the choice.
     */
    
    public void play() {
        while (val) {
            int n;
            System.out.println("Welcome to the Games program!");
            System.out.println("Make your choice (enter a number):");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            System.out.print(">");
            
            n = userChoice.nextInt();
            
            switch (n) {
                case 1 : System.out.println("Your score is " + score);
                         break;
                case 2  : guessANumber();
                         break;
                case THREE : rockPaperScissors();
                             break;
                case FOUR : return;
                default : System.out.println("That's not a valid choice!");
            }
        }
        
    }
    
    /**
     * guessANumber() - plays the game guess a number.
     */
    
    public void guessANumber() {
        int num = randomNum.nextInt(HUND);
        int userNum = -1;
        int count = 0;
        System.out.println("I've picked a random number between 0 and 100");
        System.out.println("Can you guess it?");
        while (!(num == userNum)) {
            userNum = userChoice.nextInt();
            if (userNum > num) {
                System.out.println("Too high, guess again!"); 
            }
            else {
                System.out.println("Too low, guess again!");                
            }
            count++;
        }
        System.out.println("RIGHT!");
        if (count < FIVE) {
            System.out.println("Five points!");
            score += FIVE;
        }
    }
    
    /**
     * rockPaperScissors() - plays the game rock, paper and scissors.
     */
    
    public void rockPaperScissors() {
        int num = randomNum.nextInt(THREE);
        boolean f = true; 
        String userInput;
        int input = -1;
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS");
        System.out.println("Which one do you choose?");
        while (f) {
            userInput = userChoice.next();
            if (userInput.equalsIgnoreCase("rock")) {
                input = 0;
                f = false;
            }
            else if (userInput.equalsIgnoreCase("paper")) {
                input = 1;
                f = false;
            }
            else if (userInput.equalsIgnoreCase("scissors")) {
                input = 2;
                f = false;
            }
            else {
                System.out.println("That's not a valid choice! Try again!");
            }
        }       
        
        if (input == num) {
            System.out.println("It's a Tie"); 
        }
        else if (input == 0) {
            if (num == 1) {
                System.out.println("Nope, I picked Paper");
                score -= THREE;
            }
            else {
                System.out.println("Yes! rock smashes scissors");
                score += FIVE;
            }
        }
        else if (input == 1) {
            if (num == 0) {
                System.out.println("Yes! Paper wraps rock");
                score += FIVE;
            }
            else {
                System.out.println("Nope, I picked Scissors");
                score -= THREE;
            }
        }
        else {
            if (num == 1) {
                System.out.println("Yes! Scissors cut paper");
                score += FIVE;
            }
            else {
                System.out.println("Nope, I picked Rock");
                score -= THREE;
            }
            
        }
    }

}
