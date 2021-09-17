/**
 * 
 */

package ca.bcit.comp1510.lab10;

import java.io.IOException;

/**
 * Class for a name.
 * 
 * @author Chaturvedi,Parth
 * @version 05-04-2021
 */

public class Name implements Comparable<Name> {
    
    /**
     * For the first Name.
     */
    
    private final String firstName;
    
    /**
     * For the middle Name.
     */
    
    private final String middleName;
    
    /**
     * For the last Name.
     */
    
    private final String lastName;
    
    Name(String frstName, String midName, String lstName) throws IOException {
        if (frstName == null || lstName == null || frstName.trim().isEmpty() 
                || lstName.trim().isEmpty()) {
            throw new IOException("Wrong Parameters");
        } else {    
            firstName = frstName;
            middleName = midName;
            lastName = lstName;
        }
    }
    
    Name(String frstName, String lstName) throws IOException {
        if (frstName == null || lstName == null || frstName.trim().isEmpty() 
                || lstName.trim().isEmpty()) {
            throw new IOException("Wrong Parameters");
        } else {        
            firstName = frstName;
            middleName = null;
            lastName = lstName;
        }
    }
    
    /**
     * the first name.
     * @return firstName
     */
    
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * the middle name.
     * @return middleName
     */
    
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * the last name.
     * @return lastName
     */
    
    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Name o) {
        if (lastName.compareTo(o.lastName) == 0) {
            if (firstName.compareTo(o.firstName) == 0) {
                if (middleName.compareTo(o.middleName) == 0) {                
                    return 0;
                } else {
                    return middleName.compareTo(o.middleName); 
                }
            } else {
                return firstName.compareTo(o.firstName);
            }
        } else {
            return lastName.compareTo(o.lastName);
        }        
    }

}
