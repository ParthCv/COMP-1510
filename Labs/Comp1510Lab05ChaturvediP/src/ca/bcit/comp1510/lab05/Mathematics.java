/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Mathematics.
 * 
 * @author Chaturvedi,Parth
 * @version 16-02-2021
 */

public class Mathematics {
    
    /**
     * For the constant PI.
     */
    
    public static final double PI = Math.PI;
           
    /**
    * Returns the area of the circle with the specified radius.
    *
    * @param radius
    *     of the circle.
    * @return area as a double
    */
    
    public double getCircleArea(double radius) {
        
        double area = PI * Math.pow(radius, 2);
        return area;
    }
    
    /**
    * Returns the sum of the positive integers between 0 and the specified
    * number inclusive. If the specified number is negative, returns zero.
    *
    * @param number
    *     upper bound
    * @return sum as an integer
    */

    public int sumOfInts(int number) {
        int sum = 0;
        while (number > 0) {
            
            sum += number;
            number--;
        }
        
        return sum;
    }
    
    /**
    * Returns true if the specified value is positive, else false.
    *
    * @param number
    *     to test
    * @return true if number is positive, else false.
    */

    public boolean isPositive(int number) {
        
        if (number > 0) {
            
            return true;
        }
        
        return false;
        
    }
    
    /**
    * Returns true if the specified value is even, else false.
    *
    * @param number
    *     to test
    * @return true if number is even, else false.
    */

    public boolean isEven(int number) {
        
        if (number % 2 == 0) {
            
            return true;
        }
        
        return false;
    }
    
    /**
    * Returns sum of the even numbers between 0 and the specified value,
    * inclusive. The value can be positive, negative, or zero.
    *
    * @param number
    *     upper bound
    * @return sum of the even numbers between 0 and number
    */

    public int sumOfEvens(int number) {
        int sum = 0;
        while (number > 0) {
            if (isEven(number)) {
                sum += number;
            }
            number--;
        }
        while (number < 0) {
            if (isEven(number)) {
                sum += number;
            }
            number++;
        }
        return sum;
    }
}
