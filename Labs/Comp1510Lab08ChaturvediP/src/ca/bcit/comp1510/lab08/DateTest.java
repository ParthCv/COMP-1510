/**
 * 
 */
package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Dell
 *
 */
class DateTest {
        
    @Test
    void TestConstructor() {
//        try {
//            Date date = new Date(22,4,9999);
//            fail();
//        }
//        catch(ArithmeticException ex) {
//            assertEquals("not a valid date",ex.getMessage());            
//        }
        assertThrows(ArithmeticException.class, () -> new Date(12, 5, 1580));
    }
    
    @Test
    void MonthTest() {
        assertEquals(true,Date.isMonthValid(1));
        assertEquals(false,Date.isMonthValid(0));
        assertEquals(true,Date.isMonthValid(5));
        assertEquals(false,Date.isMonthValid(13));
    }
    
    @Test
    void YearTest() {
        assertEquals(true,Date.isYearValid(1582));
        assertEquals(true,Date.isYearValid(1992));
        assertEquals(true,Date.isYearValid(2999));
        assertEquals(false,Date.isYearValid(1581));
        assertEquals(false,Date.isYearValid(3030));
    }
    
    @Test
    void LeapTest() {
        assertEquals(true,Date.isLeapYear(2000));
        assertEquals(false,Date.isLeapYear(1700));
        assertEquals(true,Date.isLeapYear(2020));
        assertEquals(false,Date.isLeapYear(2021));
    }
    
    @Test
    void DayInMonthTest() {
        assertEquals(31,Date.daysInMonth(1, 2021));
        assertEquals(28,Date.daysInMonth(2, 2021));
        assertEquals(29,Date.daysInMonth(2, 2020));
        assertEquals(31,Date.daysInMonth(3, 2021));
        assertEquals(30,Date.daysInMonth(4, 2021));
        assertEquals(31,Date.daysInMonth(5, 2021));
        assertEquals(30,Date.daysInMonth(6, 2021));
        assertEquals(31,Date.daysInMonth(7, 2021));
        assertEquals(31,Date.daysInMonth(8, 2021));
        assertEquals(30,Date.daysInMonth(9, 2021));
        assertEquals(31,Date.daysInMonth(10, 2021));
        assertEquals(30,Date.daysInMonth(11, 2021));
        assertEquals(31,Date.daysInMonth(12, 2021));
        assertEquals(31,Date.daysInMonth(13, 2021));
    }
    
    @Test
    void DateValidTest() {
        assertEquals(true,Date.isDateValid(22, 3, 2017));
        assertEquals(false,Date.isDateValid(22, 3, 3344));
        assertEquals(false,Date.isDateValid(22, 66, 2017));
        assertEquals(false,Date.isDateValid(999, 3, 2017));
    }
}
