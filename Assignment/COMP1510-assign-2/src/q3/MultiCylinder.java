package q3;

/**
 * MultiCylinder - Calculates the surface area and volume of the cylinder.
 *
 * @author Chaturvedi,Parth
 * @version 1.0
 */
public class MultiCylinder {
    
    /**
     * R1 - radius of cylinder object 1.
     */
    
    public static final double R1 = 5.8;
    
    /**
     * H1 - height of cylinder object 1.
     */
    
    public static final double H1 = 9.5;
    
    /**
     * R2 - radius of cylinder object 2.
     */
    
    public static final double R2 = 6.2;
    
    /**
     * H2 - height of cylinder object 2.
     */
    
    public static final double H2 = 7.7;
    
    /**
     * MR1 - modified radius of cylinder object 1.
     */
    
    public static final double MR1 = 2.8;
    
    /**
     * MH1 - modified height of cylinder object 1.
     */
    
    public static final double MH1 = 4.9;
    
    /**
     * MR2 - modified radius of cylinder object 2.
     */
    
    public static final double MR2 = 3.5;
    
    /**
     * MH2 - modified height of cylinder object 2.
     */
    
    public static final double MH2 = 5.3;
    
    
    /**
     * Drives the program.
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder(R1, H1);
        Cylinder c2 = new Cylinder(R2, H2);       
        
        System.out.println("Information of first object -\n" + c1);
        System.out.println("\nInformation of second object -\n" + c2);
        
        c1.setRadius(MR1);
        c1.setHeight(MH1);
        
        c2.setRadius(MR2);
        c2.setHeight(MH2);
        
        System.out.println("\nThe details of objects after modification -\n");
        
        System.out.println("Information of first object -\n" + c1);
        System.out.println("\nInformation of second object -\n" + c2);
        
        System.out.println("\nThe Surface Area of first cylinder is " 
            + c1.surfaceArea());
        System.out.println("The Volume of first cylinder is " + c1.volume());
        
        System.out.println("\nThe Surface Area of second cylinder is " 
            + c2.surfaceArea());
        System.out.println("The Volume of second cylinder is " + c2.volume());
    }

}
