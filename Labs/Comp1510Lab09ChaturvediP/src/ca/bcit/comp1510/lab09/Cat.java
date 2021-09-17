/**
 * 
 */

package ca.bcit.comp1510.lab09;

/**
 * Cat Class.
 * 
 * @author Chaturvedi,Parth
 * @version 01-04-2021
 */
public class Cat {
    
    /**
     * For the name of the cat.
     */
    
    private final String catName;
    
    /**
     * For the age of the cat.
     */
    
    private int catAge;
    
    Cat(String name, int age) {
        catName = name;
        if (age < 0) {
            catAge = 0;
        } else {            
            catAge = age;
        }
    }
    
    Cat(int age) {
        catName = "Cleo";
        if (age < 0) {
            catAge = 0;
        } else {            
            catAge = age;
        }        
    }
    
    /**
     * Returns the name of the cat.
     * @return cat name
     */
    
    public String getName() {
        return catName;
    }
    
    /**
     * Returns the age of the cat.
     * @return cat age
     */
    
    public int getAge() {
        return catAge;
    }
    
    /**
     * Mutator for the cat age.
     * @param age is the new age
     */
    
    public void setAge(int age) {
        catAge = age;
    }
    
    /**
     * To string method of the class.
     * @return the name and age of the cat
     */
    
    public String toString() {
        return catName + " is " + catAge + " years old";
    }

}
