/**
 * 
 */

package ca.bcit.comp1510.lab11;

/**
 * Lock interface.
 * 
 * @author Chaturvedi,Parth
 * @version 17-04-2021
 */

public interface Lockable {
    
    /**
     * sets the key of the lock.
     * @param key int key number
     */
    
    void setKey(int key);
    
    /**
     * locks the object.
     * @param key the key
     * @return true if the object is locked
     */
    
    boolean lock(int key);
    
    /**
     * unlocks the object.
     * @param key the key
     * @return true if the object is unlocked
     */
    
    boolean unlock(int key);
    
    /**
     * checks if the object is locked.
     * @return true if locked
     */
    
    boolean locked();

}
