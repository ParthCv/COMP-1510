package ca.bcit.comp1510.lab08;

import java.util.Scanner;


/**
 * Represent a valid Gregorian date on or after 24 February 1584.
 * 
 * @author blink
 * @version 1.0
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    /**
     * Constructor for Date class.
     * @param theDay (day)
     * @param theMonth (month)
     * @param theYear (year)
     */
    
    public Date(int theDay, int theMonth, int theYear) {
        // fill this code in and only store a valid date.   
        // throw exception if parameters are not a valid date
        if (isDateValid(theDay, theMonth, theYear)) {
            day = theDay;
            month = theMonth;
            year = theYear;
                     
        }
        else {
            throw new ArithmeticException("not a valid date");
        }
    }
    
    /**
     * Checks if the month is valid.
     * @param m (month form the input)
     * @return if the month is valid or not.
     */
    
    public static boolean isMonthValid(int m) {
        if (m >= 1 && m <= 12) {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if the year is valid.
     * @param year (year of the input)
     * @return if the year is valid or not.
     */
    
    public static boolean isYearValid(int year) {
        if (year >= 1582 && year <= 2999) {
            return true;
        }
        return false;
    }
    
    /**
     * Checks if the year is a leap year or not.
     * @param year (year of the input)
     * @return if the year is leap year or not.
     */
    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            else { 
                return true;
            }
        }
        else {        
            return false;
        }
    }
    
    /**
     * Calculates the days in the month.
     * @param month (month)
     * @param year (year)
     * @return the number of days.
     */
    
    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1 : return 31;
            case 2 : if (Date.isLeapYear(year)) {
                    return 29;
                }
                else {
                    return 28;
                     }
            case 3 : return 31;
            case 4 : return 30;
            case 5 : return 31;
            case 6 : return 30;
            case 7 : return 31;
            case 8 : return 31;
            case 9 : return 30;
            case 10 : return 31;
            case 11 : return 30;
            case 12 : return 31;
            default : return 31;
        }       
    }
    
    /**
     * Checks if the date is valid or not.
     * @param day (day)
     * @param month (month)
     * @param year (year)
     * @return if the date is vaild or not
     */
    
    public static boolean isDateValid(int day, int month, int year) {
        if (isYearValid(year)) {
            if (isMonthValid(month)) {
                if (day <= daysInMonth(month, year)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Drives the program.
     * @param args (unused)
     */
    
    public static void main(String[] args) { 
        //date read in from user
        int month, day, year;
        //true if parts of input from user is valid
        boolean monthValid, yearValid, dayValid;  
        //number of days in month read in
        int daysInMonth;
        //true if user's year is a leap year
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the month");
        month = scan.nextInt();
        
        System.out.println("Enter the day");
        day = scan.nextInt();
        
        System.out.println("Enter the year");
        year = scan.nextInt();
        
        Date d = new Date(day, month, year);
        
        System.out.println("It is a valid date");
        
        leapYear = Date.isLeapYear(d.year);
        
        
        if (leapYear) {
            System.out.println("It is a Leap Year");
        } 
        else {
            System.out.println("It is not a Leap Year");
        }
        
        daysInMonth = Date.daysInMonth(month, year);
        System.out.println("The days in the month are " + daysInMonth);
        
        System.out.println("The valid date is - ");
        System.out.println(day + "/" + month + "/" + year);
        
        scan.close(); 
        
        //Get integer month, day, and year from user
        //Use the methods to check to see if month is valid
        //Use the methods to check to see if year is valid
        //Use the methods to determine whether it's a leap year
        //Use the methods to determine number of days in month
        //Use the methods to see if day is valid
        //Use the methods to determine whether date is valid
        //   and print appropriate message
        //Create a Date object with month, day, year
    } 
} 
