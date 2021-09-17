/**
 * 
 */
package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import ca.bcit.comp1510.lab07.TestThis;

/**
 * @author Dell
 *
 */
class TestThisTest {
    
    private TestThis tThis;
    
    @BeforeEach
    public void setUp() throws Exception {
        tThis = new TestThis();
    }

    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(int, int, int)}.
     */
    @Test
    void testLargestIntIntInt() {
        assertEquals(5,tThis.largest(5, 4, 3));
        assertEquals(7,tThis.largest(2, 7, 4));
        assertEquals(6,tThis.largest(2, 4, 6));
        
    }

    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(java.util.List)}.
     */
    @Test
    void testLargestListOfInteger() {
        List<Integer> t1 = new ArrayList<Integer>();
        t1.add(2);
        t1.add(7);
        t1.add(4);
        assertEquals(7,tThis.largest(t1));
        
    }

}
