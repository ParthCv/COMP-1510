/**
 * 
 */

package ca.bcit.comp1510.lab05;

import java.util.Locale;
import java.util.Scanner;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * GeometryDriver -  uses objects from class Sphere,Cube and Cone to show there
 *                  methods and print information.
 * 
 * @author Chaturvedi,Parth
 * @version 16-02-2021
 */

public class GeometryDriver {
           
    /**
     * Helper method for Sphere class.
     * 
     * @param xc x-coordinate of the sphere
     * @param yc y-coordinate of the sphere
     * @param zc z-coordinate of the sphere
     * @param rad radius of the sphere
     */
    
    public static void sphInfo(double xc, double yc, double zc, double rad) {
        
        // Set Locale as I am in India.
        
        DecimalFormat fmt = new DecimalFormat("#.000");
        NumberFormat fm = NumberFormat.getInstance(Locale.CANADA);
              
        Sphere sph = new Sphere(xc, yc, zc, rad);
        
        System.out.println("(Decimal Format)The Surface Area of Sphere = " 
            + fmt.format(sph.surfaceArea()));
        
        System.out.println("(Number Format)The Volume of Sphere = " 
            + fm.format(sph.volume()));    
    }
    
    /**
     * Helper method for Cube class.
     * 
     * @param xc x-coordinate of the cube
     * @param yc y-coordinate of the cube
     * @param zc z-coordinate of the cube
     * @param rad radius of the cube
     */
    
    public static void cubInfo(double xc, double yc, double zc, double rad) {
                       
        DecimalFormat fmt = new DecimalFormat("#.000");
        NumberFormat fm = NumberFormat.getInstance(Locale.CANADA);
                        
        Cube cub = new Cube(xc, yc, zc, rad);
        
        System.out.println("The Surface Area of cube = " 
            + fmt.format(cub.surfaceArea()));
        
        System.out.println("The Volume of cube = " 
            + fmt.format(cub.volume()));
        
        System.out.println("The Face diagnol of cube = " 
            + fmt.format(cub.fDiagonal()));
        
        System.out.println("(Number Format)The Volume of Sphere of cube = " 
            + fm.format(cub.sDiagonal()));
    }
    
    /**
     * Helper method of Cone class.
     * 
     * @param rad - radius of the cone.
     * @param hgt - height of the cone.
     */
    
    public static void coneInfo(double rad, double hgt) {
        
        DecimalFormat fmt = new DecimalFormat("#.000");
        NumberFormat fm = NumberFormat.getInstance(Locale.CANADA);
                
        Cone con = new Cone(rad, hgt);
        
        System.out.println("The Surface Area of cone = " 
            + fmt.format(con.surfaceArea()));
        
        System.out.println("The Volume of cube = " 
            + fmt.format(con.volume()));
        
        System.out.println("(Number Format)The Slant Height of cube = " 
            + fm.format(con.slantHeight()));
    }
    
    /**
     * Drives the program.
     * 
     * @param args (unused)
     */
    
    public static void main(String[] args) {
        
        double spXcord;
        double spYcord;
        double spZcord;
        double spRadius;
        double cubXcord;
        double cubYcord;
        double cubZcord;
        double cubRadius;
        double conRadius;
        double conHeight;
        
        Scanner scan = new Scanner(System.in);
                    
        //Using Sphere class and its methods.
        
        System.out.println("Enter x , y and z coordinate for Sphere");
        spXcord = scan.nextDouble();
        spYcord = scan.nextDouble();       
        spZcord = scan.nextDouble();
        
        System.out.println("Radius = ");
        spRadius = scan.nextDouble();
        
        sphInfo(spXcord, spYcord, spZcord, spRadius);        
                
        //Using Cube class and its method.     
        
        System.out.println("Enter x , y and z coordinate for Cube");
        cubXcord = scan.nextDouble();
        cubYcord = scan.nextDouble();  
        cubZcord = scan.nextDouble();
        
        System.out.println("Radius = ");
        cubRadius = scan.nextDouble();
        
        cubInfo(cubXcord, cubYcord, cubZcord, cubRadius);
        
        //Using Cone class and its method.
        
        System.out.println("\nEnter the data for Cone\nRadius then Height");
        
        conRadius = scan.nextDouble();    
        conHeight = scan.nextDouble();
        
        coneInfo(conRadius, conHeight);
        
        scan.close();
    }

}
