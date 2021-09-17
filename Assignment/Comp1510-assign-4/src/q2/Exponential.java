package q2;

/**
 * Calculates the expansion of exponential function e^x from -ten to ten. 
 *
 * @author Chaturvedi,Parth
 * @version 11-04-2021
 */
public class Exponential {
    
    /**
     * For the number fifty.
     */
    
    public static final int FIFTY = 50;
    
    /**
     * For the number TEN.
     */
    
    public static final int TEN = 10;
    
    /**
     * Calculates the exponential function of e^x.
     * 
     * @param exp the value of x
     * @return value of e^x
     */
    
    public static double exp(int exp) {
        
        double sum = 1;        
        for (int i = FIFTY; i > 0; --i) {
            sum = 1 + exp * sum / i;
        }        
        return sum;
    }
        
    /**
     * Describe what the main method does here.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = -TEN; i <= TEN; i++) {
            System.out.println("x = " + i + "\t" + "e^x = " + exp(i));
            System.out.println("---------------------------------------------");
        }        
    }
}

