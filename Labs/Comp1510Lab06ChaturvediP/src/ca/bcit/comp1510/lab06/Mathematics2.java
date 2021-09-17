/**
 * 
 */

package ca.bcit.comp1510.lab06;

import java.util.Random;

/**
 * Class for Mathematics methods.
 * 
 * @author Chaturvedi,Parth
 * @version 03-03-2021
 *
 */
public class Mathematics2 {
    
    /**
     * for ratio to convert from foot to kilometer. 
     */

    public static final double FOOT_TO_KILOMETRE_RATIO =  0.0003048;
    
    /**
     * for the number ten. 
     */
    
    public static final int TEN = 10;
    
    /**
     * for the number eleven.
     */
        
    public static final int ELEVEN = 11;
    
    /**
     * for the number fifteen.    
     */
    
    public static final int FIFTEEN = 15;
    
    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param d edgeLength of the square.
    * @return area as a double
    */

    public double getSquareArea(double d) {
        double area = Math.pow(d, 2);
        return area;
    }
    
    /**
    * Returns the sum of the specified values.
    *
    * @param d first operand
    * @param e second operand
    * @return sum of the operands
    */

    public double add(double d, double e) {
        double sum = d + e;
        return sum;
    }
    
    /**
    * Returns the product of the specified values.
    *
    * @param d first operand
    * @param e second operand
    * @return product of the operands
    */

    public double multiply(double d, double e) {
        double product = d * e;
        return product;
    }
    
    /**
    * Returns the difference of the specified values.
    *
    * @param d first operand
    * @param e second operand
    * @return difference of the operands
    */

    public double subtract(double d, double e) {
        double diff = d - e;
        return diff;
    }
    
    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param i first operand
    * @param j second operand
    * @return quotient of the operands
    */

    public double divide(int i, int j) {
        double div = 0.0;
        if (j != 0) {
            div = i / j;            
        }
        return div;
    }
    
    /**
    * Returns the absolute value of the specified integer.
    *
    * @param i number to test
    * @return absolute value of number
    */

    public int absoluteValue(int i) {
        int abs = Math.abs(i);
        return abs;
    }
    
    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return random number in range [10, 20] excluding 15.
    */

    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        Random rand = new Random();
        int n = rand.nextInt(ELEVEN) + TEN;
        while (n == FIFTEEN) {
            n = rand.nextInt(ELEVEN) + TEN;
        }
        return n;
    }
    
    /**
    * Converts the specified number of feet to kilometers.
    * @param d feet to convert
    * @return kilometers in the specified number of feet
    */

    public double convertFeetToKilometres(double d) {
        double km = d * FOOT_TO_KILOMETRE_RATIO;
        return km;
    }
    
    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param i bound the upper bound
    * @param j divisor the divisor
    * @return sum
    */

    public int sumOfProducts(int i, int j) {
        int sum = 0;
        while (i > 0) {
            if (i % j == 0) {
                sum += i;
            }
            i--;
        }    
        while (i < 0) {
            if (i % j == 0) {
                sum += i;                
            }
            i++;
        }        
        return sum;
    }

}
