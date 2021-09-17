package q4;

import java.util.InputMismatchException;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Student {
    /**
     * For the number three.
     */
    
    private static final int THREE = 3;
            
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /**
     * score for test 1.
     */
    
    private int score1;
    
    /**
     * score for test 2.
     */
    
    private int score2;
    
    /**
     * score for test 3.
     */
    
    private int score3;

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param scr1 int representing score for test 1
     * @param scr2 int representing score for test 2
     * @param scr3 int representing score for test 3
     */
    public Student(String first, String last, Address home, Address school, 
            int scr1, int scr2, int scr3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        score1 = scr1;
        score2 = scr2;
        score3 = scr3;        
    }
    
    /**
     * Zero parameter constructor for Student class.
     */
    
    public Student() {
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }
    
    /**
     * Sets the test score of the specified test number.
     * 
     * @param testNum an int to represent the test number
     * @param testScore an int to specify the new test score
     */
    
    public void setTestScore(int testNum, int testScore) {
        
        if (testNum > THREE || testNum < 0) {
            throw new InputMismatchException("The number should be between "
                    + "1 and 3");
        }
        switch (testNum) {
            case 1 : score1 = testScore;
                     break;
            case 2 : score2 = testScore;
                     break;
            case THREE : score3 = testScore;
                     break;
            default : System.out.print("Wrong inputs");
        }        
    }
    
    /**
     * returns the test score of the specified test number.
     * 
     * @param testNum an int to represent test number
     * @return the test score
     */
    
    public int getTestScore(int testNum) {
        
        if (testNum > THREE || testNum < 0) {
            throw new InputMismatchException("The number should be between "
                    + "1 and 3");
        }
        switch (testNum) {
            case 1 : return score1;
            case 2 : return score2;
            case THREE : return score3;
            default : return 0;
        }        
    }
    
    /**
     * Average of 3 test score.
     * @return the average
     */
    
    public double average() {
        double avg = (score1 + score2 + score3) / THREE;
        return avg;
    }

    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Score 1:\n" + score1 + "\n";
        result += "Test Score 2:\n" + score2 + "\n";
        result += "Test Score 3:\n" + score3 + "\n";
        result += "Average Test Score:\n" + average();

        return result;
    }
}

