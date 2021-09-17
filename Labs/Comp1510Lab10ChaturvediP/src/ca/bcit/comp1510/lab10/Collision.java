/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * @author Dell
 *
 */

public class Collision {
    
    private static final int bound = 2000000;
    
    private static final int step = 100000;
    
    private static final int THREE = 3;
    
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return false;
        
    }

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        RandomWalker c1 = new RandomWalker(step, bound, -THREE, 0);
        RandomWalker c2 = new RandomWalker(step, bound, THREE, 0);
        
        
    }

}
