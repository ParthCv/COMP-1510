/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Name - .
 * @author Chaturvedi,Parth
 * @version 11-02-2021
 */
public class Name {
    
    /**
     * For the first name.
     */
    
    private String firstName;
    
    /**
     * For middle name.
     */
    
    private String middleName;
    
    /**
     * For last name.
     */
    
    private String lastName;
    
    /**
     * Name- Constructor for Name class.
     * @param fst (first name)
     * @param mid (middle name)
     * @param lst (last name)
     */

    public Name(String fst, String mid, String lst) {
        
        firstName = fst;
        middleName = mid;
        lastName = lst;
    }
    
    /**
     * setFirstName - Setter for first name.
     * @param frstName (first name)
     */
    
    public void setFirstName(String frstName) {
        
        firstName = frstName;
    }
    
    /**
     * setMiddleName - Setter for middle name.
     * @param mdleName (middle name)
     */
    
    public void setMiddleName(String mdleName) {
        
        middleName = mdleName;
    }
    
    /**
     * setLastName - Setter for last name.
     * @param lstName (last name)
     */
    
    public void setLastName(String lstName) {
        
        lastName = lstName;
    }
    
    /**
     * getFirstName - returns first name.
     * @return firstName
     */
    
    public String getFirstName() {
        
        return firstName;
    }
    
    /**
     * getMiddleName - returns middle name.
     * @return middleName
     */
    
    public String getMiddleName() {
        
        return middleName;
    }
    
    /**
     * getLastName - returns last name.
     * @return lastName
     */
    
    public String getLastName() {
        
        return lastName;
    }
    
    /**
     * Calculates the total lenght of the three parts of the name.
     * @return the lenght of three parts of the name
     */
    
    public int nameLenght() {
        
        int nmLgth = firstName.length() + middleName.length() 
            + lastName.length();
        return nmLgth;
    }
    
    /**
     * returns the three initials in upper case.
     * @return the upper case initial
     */
    
    public String initial() {
        
        String init;
        init = firstName.substring(0, 1) + middleName.substring(0, 1) 
            + lastName.substring(0, 1);
        return init.toUpperCase();
    }
    
    /**
     * return the character at the position input by the user. 
     * @param n the position of the character
     * @return the character at the position n.
     */
    
    public char charFind(int n) {
        
        String nam = firstName + middleName + lastName;
        char str = nam.charAt(n);
        return str;
    }
    
    /**
     * formats the three parts of the name.
     * @return the formatted name 
     */
    
    public String formatName() {
        
        String str;
        str = lastName + " , " + firstName + " " + middleName;
        return str;
    }
    
    /**
     * Checks whether the first name and the passed string are the same.
     * @param nm the string passed be the user to compare
     * @return true if the first name is equal to the passed string
     */
    
    public boolean firstNameCompare(String nm) {
        
        return nm.equals(firstName);
    }
    
    /**
     * Compares the three parts of name of two objects.
     * @param ob the Name class object
     * @return true if the names are same
     */
    
    public boolean nameCompare(Name ob) {
        
        return (ob.firstName.equals(firstName))
            && (ob.middleName.equals(middleName)) 
            && (ob.lastName.equals(lastName));
    }
     
}


