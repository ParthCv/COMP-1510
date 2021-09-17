/**
 * 
 */

package ca.bcit.comp1510.lab10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Driver class for the Name class.
 * 
 * @author Chaturvedi,Parth
 * @version 07-04-2021
 */
public class NameDriver {

    /**
     * Drives the program.
     * 
     * @param args unused.
     * @throws IOException if
     */
    public static void main(String[] args)  {
        ArrayList<Name> names = new ArrayList<Name>();
        
        
        try {
            Name n1 = new Name("Ray", "Rice");
            Name n2 = new Name("Brian", "Jim", "Barret");
            Name n3 = new Name("Rolf", "Becker");
            Name n4 = new Name("Ray", "Aecker");
            Name n5 = new Name("Ashley", "Carter", "Hodgson");
            
            names.add(n1);
            names.add(n2);
            names.add(n3);
            names.add(n4);
            names.add(n5);
            
            System.out.println("Oringnal ArrayList : \n");
            
            for (int i = 0; i < names.size(); i++) {
                System.out.print(names.get(i).getLastName() + " "
                        + names.get(i).getFirstName() + "\t");
            }       
            System.out.println("\n");
            Collections.sort(names);
            System.out.println("Sorted ArrayList : \n");
            
            
            for (int i = 0; i < names.size(); i++) {
                System.out.print(names.get(i).getLastName() + " "
                        + names.get(i).getFirstName() + "\t");
            }
            
            //System.out.println(names);
           
        } catch (IOException e) {            
            e.printStackTrace();
            System.out.println("exception handled");
        }
        
        
        
    }

}
