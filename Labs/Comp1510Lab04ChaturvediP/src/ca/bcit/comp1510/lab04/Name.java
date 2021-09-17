/**
 * 
 */

package ca.bcit.comp1510.lab04;

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
}


