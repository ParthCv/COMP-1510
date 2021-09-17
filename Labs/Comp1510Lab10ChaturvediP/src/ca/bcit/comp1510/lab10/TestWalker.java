/**
 * 
 */

package ca.bcit.comp1510.lab10;

/**
 * @author Dell
 *
 */
public class TestWalker {

    /**
     * @param args
     */
    public static void main(String[] args) {       
        
        RandomWalker w1 = new RandomWalker(200,10);     
        
        System.out.println(w1);
        
        w1.walk(); 
        
    }

}
