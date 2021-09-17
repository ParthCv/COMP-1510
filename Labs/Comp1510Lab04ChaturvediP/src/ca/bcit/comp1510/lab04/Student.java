/**
 * 
 */

package ca.bcit.comp1510.lab04;

/**
 * Student - contains student information.
 * @author Chaturvedi,Parth
 * @version 11-02-2021
 */
public class Student {
    
    /**
     * For the first name.
     */
    
    private String firstName;
    
    /**
     * For the last name.
     */
    
    private String lastName;
    
    /**
     * For the birth year.
     */
    
    private int birthYear;
    
    /**
     * For the student number.
     */
    
    private int stuNumber;
    
    /**
     * For the student GPA.
     */
    
    private double gpa;
    
    /**
     * Student - constructor for Student class.
     * @param fstName (firstName)
     * @param lstName (lastName)
     * @param bYr (birthYear)
     * @param sNo (stuNumber)
     * @param d (gpa)
     */
    
    public Student(String fstName, String lstName, int bYr, int sNo, double d) {
       
        firstName = fstName;
        lastName = lstName;
        birthYear = bYr;
        stuNumber = sNo;
        gpa = d;
    }
    
    /**
     * setFirstName - Setter for first name.
     * @param fName (First Name)
     */
    
    public void setFirstName(String fName) {
        
        firstName = fName;
    }
    
    /**
     * setLastName - Setter for last name.
     * @param lName (Last Name)
     */
    
    public void setLasttName(String lName) {
        
        lastName = lName;
    }
    
    /**
     * setBirthYear - Setter for birth year.
     * @param bYear (Birth Year)
     */
    
    public void setBirthYear(int bYear) {
        
        birthYear = bYear;
    }
    
    /**
     * setStudentNumber - Setter for Student Number.
     * @param stNo (Student Number)
     */
    
    public void setStudentNumber(int stNo) {
        
        stuNumber = stNo;
    }
    
    /**
     * setGpa - Setter for grade point average.
     * @param gradePoint (GPA)
     */
    
    public void setGpa(double gradePoint) {
        
        gpa = gradePoint;
    }
    
    /**
     * getFirstName - returns first name.
     * @return firstName
     */
    
    public String getFirstName() {
        
        return firstName;
    }
    
    /**
     * getLastName - returns last name.
     * @return lastName
     */
    
    public String getLastName() {
        
        return lastName;
    }
    
    /**
     * getBirthYear - returns birth year.
     * @return birthYear
     */
    
    public int getBirthYear() {
        
        return birthYear;
    }
    
    /**
     * getStudentNumber - returns student number.
     * @return stuNumber
     */
    
    public int getStudentNumber() {
        
        return stuNumber;
    }
    
    /**
     * getGpa - returns student grade point average.
     * @return gpa
     */
    
    public double getGpa() {
        
        return gpa;
    }
    
    /**
     * returns the student details.
     * @return firstName,lastName,birthYear,stuNumber,gpa
     */
    
    public String toString() {
        
        return firstName + " " + lastName + " " + birthYear + " " + stuNumber 
                + " " + gpa;
    }
}
