/**
 * 
 */

package ca.bcit.comp1510.lab06;

/**
 * Driver class for Name class.
 * 
 * @author Chaturvedi,Parth
 * @version 03-03-2021
 */

public class NameDriver {
    
    /**
     * For the number five.
     */

    public static final int FIVE = 5;
    
    /**
     * Drives the program.
     * 
     * @param args (unused)
     */
    public static void main(String[] args) {
        int n;
        int m;
        Name n1 = new Name("", "Jhonathan", "");
        
        System.out.println("Name stored in object");
        System.out.println(n1.getFirstName() + " " + n1.getMiddleName() + " " 
                + n1.getLastName());
        
        n1.setFirstName("");
        n1.setMiddleName("    ");
        n1.setLastName("cray");
        
        System.out.println("Name after modification");
        System.out.println(n1.getFirstName() + " " + n1.getMiddleName() + " " 
                + n1.getLastName());
        
        n = n1.nameLenght() + FIVE;
        m = n1.nameLenght() - FIVE;        
        
        System.out.println("When the input is more than the lenght");
        System.out.println(n1.charFind(n));
        System.out.println("When the input is less than the lenght");
        System.out.println(n1.charFind(m));
    }

}
