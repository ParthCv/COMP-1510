/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.io.IOException;

/**
 * @author Chaturvedi,Parth
 * @version 17-04-2021
 */
public class LockableTest {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        Coin cc = new Coin();        
        cc.setKey(1);
        cc.unlock(1);
        cc.flip();
        System.out.println(cc);
        cc.lock(1);
        System.out.println(cc);
        cc.unlock(2);
        System.out.println(cc);

    }

}
