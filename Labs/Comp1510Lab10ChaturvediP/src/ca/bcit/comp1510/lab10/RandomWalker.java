/**
 * 
 */

package ca.bcit.comp1510.lab10;

/**
 * Random Walker simulates a walker.
 * 
 * @author Chaturvedi,Parth
 * @version 07-09-2021
 */
public class RandomWalker {
    
    /**
     * For the number three.
     */
    
    public static final int THREE = 3;
    
    /**
     * For the number four.
     */
    
    public static final int FOUR = 4;
    
    /**
     * the x coordinate.
     */
    
    private int xcord;
    
    /**
     * the y coordinate.
     */
    
    private int ycord;
    
    /**
     * Maximum number of steps.
     */
    
    private int maxStep;
    
    /**
     * the current steps taken.
     */
    
    private int steps;
    
    /**
     * the boundary of the 2d plane.
     */
    
    private int boundary;
    
    /**
     * how far object is from origin.
     */
    
    private int maximunDistance;
    
    RandomWalker(int maxS, int maxB) {
        maxStep = maxS;
        boundary = maxB;
        steps = 0;
        xcord = 0;
        ycord = 0;
        maximunDistance = 0;
    }
    
    RandomWalker(int maxS, int maxB, int x, int y) {
        maxStep = maxS;
        boundary = maxB;
        steps = 0;
        xcord = x;
        ycord = y;
        maximunDistance = 0;
    }
    
    /**
     * the toString method.
     * 
     * @return the xcord,the ycord and the steps
     */
    
    public String toString() {
        String str = "x-cord = " + getXcord() + " y-cord = " + getYcord() + "\n"
                + "Current steps = " + steps + "\n" + "Maximun Distance = "
                + getMaximunDistance() + "\n------------------------";
        return str;
        
    }

    /**
     * the getter for max steps.
     * 
     * @return the maxStep
     */
    public int getMaxStep() {
        return maxStep;
    }

    /**
     * the getter for steps.
     * 
     * @return the steps
     */
    public int getSteps() {
        return steps;
    }

    /**
     * the getter for boundary.
     * 
     * @return the boundary
     */
    public int getBoundary() {
        return boundary;
    }
    
    /**
     * Take a step in a random direction.
     */
    
    public void takeStep() {
        int x;
        x = (int) Math.round(Math.random() * FOUR); 
        switch (x) {
            case 0: xcord = getXcord() + 1;
                    steps++;
                    break;
            case 1: ycord = getYcord() + 1;
                    steps++;
                    break;
            case 2: xcord = getXcord() - 1;
                    steps++;
                    break;
            case THREE: ycord = getYcord() - 1;
                    steps++;
                    break;
            default: break;
        }
        maximunDistance = max(getXcord(), getYcord());
    }
    
    /**
     * Check if the step are more than max steps or not.
     * @return true if step are less
     */
    
    public boolean moreSteps() {
        return maxStep > steps ? true : false;
    }
    
    /**
     * Check if the walker is in bounds.
     * @return true if is in bounds
     */
    
    public boolean inBounds() {
        return !(getXcord() > boundary || getXcord() < -boundary 
                || getYcord() > boundary || getYcord() < -boundary);       
    }
    
    /**
     * takes a step until max Steps or out of bound.
     */
    
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
            System.out.println(toString());
        }
        
    }
    
    private int max(int a, int b) {
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        return Math.abs(Math.max(a1, b1));
    }

    /**
     * Return the maximun distance form origin.
     * 
     * @return the maximunDistance
     */
    public int getMaximunDistance() {
        return maximunDistance;
    }

    /**
     * Retunrs the x coordinate.
     * 
     * @return the xcord
     */
    public int getXcord() {
        return xcord;
    }

    /**
     * Returns the y coordinate.
     * 
     * @return the ycord
     */
    public int getYcord() {
        return ycord;
    }
}
