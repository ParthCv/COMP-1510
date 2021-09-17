/**
 * 
 */

package q4;

import java.util.ArrayList;
import java.util.List;

/**
 * Course class represents the courses taken at the school.
 * 
 * @author Chaturvedi, Parth
 * @version 29-03-2021
 */
public class Course {
    
    /**
     * For the number five.
     */
    
    public static final int FIVE = 5;
    
    /**
     * For the count of the students in the course.
     */
    
    private int studentCount;
    
    /**
     * For the name of the course.
     */
    
    private String courseName;
    
    /**
     * For the students in the course name.
     */
    
    private List<Student> students = new ArrayList<Student>(FIVE);
    
    
    Course(String name) {
        courseName = name;
    }
    
    /**
     * To add students to the course but no more than 5.
     * 
     * @param stu the Student object.
     */
    
    public void addStudent(Student stu) {
        if (studentCount >= FIVE) {
            throw new ArithmeticException("Only 5 Student can be enrolled"); 
        } else {
            students.add(stu);
            studentCount++;
        }        
    }
    
    /**
     * Calculates the average of all students test average.
     *  
     * @return average score
     */

    public double average() {
        double sumAverage = 0.0;
        double avg = 0.0;
        for (int i = 0; i <= (students.size() - 1); i++) {
            sumAverage += students.get(i).average();
        }
        avg = sumAverage / (students.size());
        return avg;        
    }
    
    /**
     * Prints all the students in the course.
     */
    
    public void role() {
        System.out.println("The Students in course " + courseName + " are -\n");
        for (int i = 0; i <= (students.size() - 1); i++) {
            System.out.println(students.get(i) + "\n\n");
        }                
    }
}
