/**
 * 
 */

package q4;

/**
 * Box - Class for calculating how much the box is filled.
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */

public class Box {

    /**
     * HUND - for the number hundred.
     */
    
    public static final int HUND = 100;
    
    /**
     * height - for the height of the box.
     */
    
    private double height;
    
    /**
     * width - for the width of the box.
     */
    
    private double width;
    
    /**
     * depth - for the depth of the box.
     */
    
    private double depth;
    
    /**
     * contents - for the volume of the contents.
     */
    
    private double contents;
    
    /**
     * Constructor for Box class.
     * @param hght (height)
     * @param wth (width)
     * @param dpth (depth)
     */
    
    Box(double hght, double wth, double dpth) {
        
        height = hght;
        width = wth;
        depth = dpth;
        contents = 0;
    }
    
    /**
     * getHeight - returns the height of the box.
     * @return height
     */
    
    public double getHeight() {
        
        return height;
    }
    
    /**
     * getWidth - returns the width of the box.
     * @return width
     */
    
    public double getWidth() {
        
        return width;
    }
    
    /**
     * getDepth -  returns the depth of the box.
     * @return depth
     */
    
    public double getDepth() {
        
        return depth;
    }
    
    /**
     * getContents - returns the content of the box.
     * @return contents
     */
    
    public double getContents() {
        
        return contents;
    }
    
    /**
     * setHeight - sets the height of the box.
     * @param hgt (height)
     */
    
    public void setHeight(double hgt) {
        
        height = hgt;
    }
    
    /**
     * setWidth - sets the width of the box.
     * @param wdth (width)
     */
    
    public void setWidth(double wdth) {
        
        width = wdth;
    }
    
    /**
     * setDepth - sets the depth of the box.
     * @param dpth (depth)
     */
    
    public void setDepth(double dpth) {
        
        depth = dpth;
    }
    
    /**
     * setContents - sets the content of the box.
     * @param conts (contents)
     */
    
    public void setContents(double conts) {
        
        contents = conts;
    }
    
    /**
     * toSring - returns the description of the box.
     * @return height,width,depth,contents
     */
    
    public String toString() {
        
        String info = "Height of box = " + height + " Width of the box = " 
            + width + " Depth of the box = " + depth + " contents of the box = "
            + contents;
        return info;
    }
    
    /**
     * percentFull - calculates the percentage the box is filled.
     * @return percent
     */
    
    public double percentFull() {
        
        double vol = height * width * depth;
        double percent = (contents / vol) * HUND;
        return percent;
    }

}
