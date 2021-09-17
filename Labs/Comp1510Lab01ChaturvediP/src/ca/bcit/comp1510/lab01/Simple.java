/**
 * 3. program names.
 */

package ca.bcit.comp1510.lab01;

/**
 * Checking if identifiers names are legal.
 * @author ParthChaturvedi
 * @version 19thJanuary2021
 */
public class Simple {

    /**
     * to check if identifiers have right name.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("I love Java");
        
        /*1. simple- No, as a class "Simple" exists, which has same name but 
         *           different case and java is case sensitive.
         *           
         *2. SimpleProgram- Yes it valid and a good choice.
         *
         *3. 1 Simple- No as identifiers can't start with digits.
         *
         *4. _Simple_- Yes it valid and a good choice.
         *
         *5. *Simple*- No as identifiers can't start with special characters 
         *             except $ and _ .
         *             
         *6. $123_45- Yes it is valid but by convention we don't start
         *            identifiers with '$' sign.
         *            
         *7. Simple!- No as identifiers can't have special Characters.
         *  */
    }

}
