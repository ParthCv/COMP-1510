package q3;

import java.util.Scanner;

/**
 * Class to test the methods of Student and Address class.
 *
 * @author Chaturvedi, Parth
 * @version 29-04-2021
 */
public class TestStudent {
    
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
                
        int s1;
        int s2;
        int s3;
        int x;
        int temp;
        
        Scanner scan = new Scanner(System.in);
        
        //Zero parameter constructor.
        Student st = new Student();       
        Address sch = new Address("Ring Road", "Delhi", "New Delhi", "110023");
        Address hom = new Address("123 st", "Noida", "Uttar Pradesh", "201305");
        
        System.out.println("Enter the test scores from (1-3)");
        s1 = scan.nextInt();
        s2 = scan.nextInt();
        s3 = scan.nextInt();
        
        Student st2 = new Student("Parth", "Chaturvedi", hom, sch, s1, s2, s3);
        
        System.out.println("Enter which test score you want to change");
        x = scan.nextInt();        
        
        System.out.println("Current value of test " + x + " = " 
                + st2.getTestScore(x));
        
        System.out.println("Enter the new score : ");
        temp = scan.nextInt();        
        st2.setTestScore(x, temp);
        
        System.out.println(st);        
        System.out.println(st2); 
        
        scan.close();
    }

}
