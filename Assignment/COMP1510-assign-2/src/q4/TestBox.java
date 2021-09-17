package q4;

/**
 * TestBox - creates objects and tests methods of class Box.
 * 
 * @author Chaturvedi,Parth
 * @version 1.0
 */
public class TestBox {
    
    /**
     * H1 - for height of box 1.
     */
    
    public static final double H1 = 5.3;
    
    /**
     * W1 - for width of box 1.
     */
    
    public static final double W1 = 12.7;
    
    /**
     * D1 - for depth of box 1.
     */
    
    public static final double D1 = 8.9;
    
    //mh
    
    /**
     * MH1 - for modified height of box 1.
     */
    
    public static final double MH1 = 8.3;
    
    /**
     * MW1 - for modified width of box 1.
     */
    
    public static final double MW1 = 11.8;
    
    /**
     * MD1 - for modified depth of box 1.
     */
    
    public static final double MD1 = 7.9;
    
    /**
     * H2 - for height of box 2.
     */
    
    public static final double H2 = 11.5;
    
    /**
     * W2 - for width of box 2.
     */
    
    public static final double W2 = 13.9;
    
    /**
     * D2 - for depth of box 2.
     */
    
    public static final double D2 = 2.8;
    
    /**
     * MH2 - for modified height of box 1.
     */
    
    public static final double MH2 = 4.6;
    
    /**
     * MW2 - for modified width of box 1.
     */
    
    public static final double MW2 = 10.3;
    
    /**
     * MD2 - for modified depth of box 1.
     */
    
    public static final double MD2 = 5.8;
    
    /**
     * C1 - for content of box 1.
     */
    
    public static final double C1 = 34.76;
    
    /**
     * C2 - for content of box 1.
     */
    
    public static final double C2 = 38.9;
    
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
        
        Box b1 = new Box(H1, W1, D1);
        Box b2 = new Box(H2, W2, D2);
               
        b1.setHeight(MH1);
        b1.setWidth(MW1);
        b1.setDepth(MD1);
        
        System.out.println("The updated data of box 1\n");
        System.out.println("height = " + b1.getHeight());
        System.out.println("width = " + b1.getWidth());
        System.out.println("depth = " + b1.getDepth());
        
        b1.setHeight(MH2);
        b1.setWidth(MW2);
        b1.setDepth(MD2);
        
        System.out.println("\nThe updated data of box 2\n");
        System.out.println("height = " + b2.getHeight());
        System.out.println("width = " + b2.getWidth());
        System.out.println("depth = " + b2.getDepth());
        
        
        
        b1.setContents(C1);
        b2.setContents(C2);
        System.out.println("\nThe content of box 1 is = " + b1.getContents());
        System.out.println("The content ob box 2 is = " + b2.getContents());
        
        System.out.println("\nDescription of the box 1\n");
        System.out.println(b1);
        
        System.out.println("\nDescription of the box 2\n");
        System.out.println(b2);
        
        System.out.println("\nThe percentage fill of box 1 = " 
            + b1.percentFull() + " %");
        
        System.out.println("\nThe percentage fill of box 2 = " 
                + b2.percentFull() + " %");
        
        
    }

}
