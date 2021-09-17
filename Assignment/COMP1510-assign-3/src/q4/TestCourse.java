package q4;

/**
 * Program to test the methods of the Course class.
 *
 * @author Chaturvedi,Parth
 * @version 29-03-2021
 */
public class TestCourse {
    
    /**
     * For score 1.
     */
    
    public static final int SC1 = 76;
    
    /**
     * For score 2.
     */
    
    public static final int SC2 = 67;
    
    /**
     * For score 3.
     */
    
    public static final int SC3 = 89;
    
    /**
     * For score 4.
     */
    
    public static final int SC4 = 59;
    
    /**
     * For score 5.
     */
    
    public static final int SC5 = 83;
    
    /**
     * For score 6.
     */
    
    public static final int SC6 = 76;
    
    /**
     * For score 7.
     */
    
    public static final int SC7 = 92;
    
    /**
     * For score 8.
     */
    
    public static final int SC8 = 87;    
    
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        //School address
        Address sch = new Address("Ring Road", "Delhi", "New Delhi", "110023");
        
        //Student address
        Address hom1 = new Address("123st", "Panaji", "Goa", "201305");
        Address hom2 = new Address("342st", "Tezpur", "Assam", "182732");
        Address hom3 = new Address("234st", "Imphal", "Manipur", "113023");
        Address hom4 = new Address("142st", "Kochi", "Kerala", "110022");
        Address hom5 = new Address("984st", "Patana", "Bihar", "110001");
        
        //Student Objects
        Student st1 = new Student("Dwayne", "Craig", hom1, sch, SC1, SC7, SC3);
        Student st2 = new Student("Gray", "Dittman", hom2, sch, SC2, SC3, SC5);
        Student st3 = new Student("Halsey", "Hines", hom3, sch, SC8, SC3, SC7);
        Student st4 = new Student("Aldrich", "Frost", hom4, sch, SC5, SC4, SC4);
        Student st5 = new Student("Claire", "Blair", hom5, sch, SC6, SC1, SC8);
        
        //Course Object
        Course cr = new Course("COMP-1510");
        
        cr.addStudent(st1);
        cr.addStudent(st2);
        cr.addStudent(st3);
        cr.addStudent(st4);
        cr.addStudent(st5);
        
        //To check if only 5 students can be added to the course
        //cr.addStudent(st3);
        
        cr.role();
        
        System.out.println("The Course Average is : " + cr.average());
    }

}
