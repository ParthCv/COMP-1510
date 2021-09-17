/**
 * 
 */
package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



/**
 * @author Dell
 *
 */

class ComplexTest {
    
    final Complex c1 = new Complex(3,4);
    final Complex c2 = new Complex(1,1);
    final Complex d1 = new Complex(3.3,4.5);
    final Complex d2 = new Complex(1.5,1.7);
    final Complex add = new Complex(4,5);
    final Complex add2 = new Complex(4.5,4);
    final Complex addD = new Complex(4.8,6.2);
    final Complex sub = new Complex(2,3);
    final Complex subD = new Complex(1.7999999999999998,4.5);
    final double d = 1.5;
    final Complex mul = new Complex(-1,7);
    final Complex mulD = new Complex(4.5,6.0);
    final Complex con = new Complex(3,-4);
    final Complex div = new Complex(2.0,4.0);
    final Complex div2 = new Complex(0.0,0.0);
    final Complex div3 = new Complex(3.5,0.5);
    final double arg = 0.9272952180016122;
    final double abs = 5.0;
    final double hash = 1572864;
    final Complex logC = new Complex(1.6094379124341003, 0.9272952180016122);
    final Complex exp = new Complex(-13.128783081462158, -15.200784463067954);
    
    
    @Test
    void equalsTest() {
        assertEquals(false,c1.equals(c2));
    }
    
    @Test
    void additionTest() {
        assertEquals(add,c1.add(c2));
        assertEquals(add2,c1.add(d));
        assertEquals(addD,d1.add(d2));
    }
    
    @Test
    void subtractionTest() {
        assertEquals(sub,c1.subtract(c2));
        assertEquals(subD,d1.subtract(d));
    }
    
    @Test
    void multiplicationTest() {
        assertEquals(mul,c1.multiply(c2));
        assertEquals(mulD,c1.multiply(d));
    }
    
    @Test
    void conjugateTest() {
        assertEquals(con,c1.conjugate());        
    }
    
    @Test
    void Test() {
        assertThrows(IllegalArgumentException.class, () -> c1.divide(0.0));
        assertEquals(div,c1.divide(d));
        assertThrows(IllegalArgumentException.class, () -> c1.divide(div2));
        assertEquals(div3,c1.divide(c2));
    }
    
    @Test
    void argumentTest() {
        assertEquals(arg,c1.arg());
    }
    
    @Test
    void absoluteTest() {
        assertEquals(abs,c1.abs());
    }
    
    @Test
    void reciprocalTest() {
        assertThrows(IllegalArgumentException.class, () -> div2.reciprocal());
    }
    
    @Test
    void hashCodeTest() {
        assertEquals(hash,c1.hashCode());
    }
    
    @Test
    void logTest() {
        assertEquals(logC,c1.log());
    }
    
    @Test
    void exponentialTest() {
        assertEquals(exp,c1.exp());
    }

}
