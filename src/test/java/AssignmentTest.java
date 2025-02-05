package test.java;

import main.java.Assignment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    @Test
    void testCalculateMovieNight() {
        double expected = 56.25; // (2 * 12.50) + (3 * 8.00) + 7.25
        assertEquals(expected, Assignment.calculateMovieNight(), 0.01,
            "Movie night total should be $56.25");
    }

    @Test
    void testCanRentCar() {
        assertTrue(Assignment.canRentCar(25), "Age 25 should be able to rent a car");
        assertTrue(Assignment.canRentCar(30), "Age 30 should be able to rent a car");
        assertFalse(Assignment.canRentCar(24), "Age 24 should not be able to rent a car");
        assertFalse(Assignment.canRentCar(18), "Age 18 should not be able to rent a car");
    }

    @Test
    void testIsValidPasswordLength() {
        assertTrue(Assignment.isValidPasswordLength("password123"), 
            "Password of length 11 should be valid");
        assertTrue(Assignment.isValidPasswordLength("exactly8"), 
            "Password of length 8 should be valid");
        assertFalse(Assignment.isValidPasswordLength("short"), 
            "Password of length 5 should not be valid");
    }

    @Test
    void testNeedsOilChange() {
        assertTrue(Assignment.needsOilChange(65000, 59999), 
            "Should need oil change after 5001 miles");
        assertTrue(Assignment.needsOilChange(75000, 70000), 
            "Should need oil change after 5000 miles");
        assertFalse(Assignment.needsOilChange(64000, 59999), 
            "Should not need oil change after 4001 miles");
    }

    @Test
    void testGetDivisibleByThreeMessage() {
        assertEquals("Divisible by 3", Assignment.getDivisibleByThreeMessage(9),
            "9 should be divisible by 3");
        assertEquals("Divisible by 3", Assignment.getDivisibleByThreeMessage(0),
            "0 should be divisible by 3");
        assertEquals("", Assignment.getDivisibleByThreeMessage(7),
            "7 should not be divisible by 3");
        assertEquals("", Assignment.getDivisibleByThreeMessage(-7),
            "Negative numbers not divisible by 3 should return empty string");
        assertEquals("Divisible by 3", Assignment.getDivisibleByThreeMessage(-9),
            "Negative numbers divisible by 3 should return message");
    }

    @Test
    void testGetLeapYearMessage() {
        assertEquals("Leap Year", Assignment.getLeapYearMessage(2024),
            "2024 should be a leap year");
        assertEquals("Not Leap Year", Assignment.getLeapYearMessage(2100),
            "2100 should not be a leap year (divisible by 100 but not 400)");
        assertEquals("Leap Year", Assignment.getLeapYearMessage(2000),
            "2000 should be a leap year (divisible by 400)");
        assertEquals("Not Leap Year", Assignment.getLeapYearMessage(2023),
            "2023 should not be a leap year");
    }

    @Test
    void testGetTicketPriceCategory() {
        assertEquals("Free", Assignment.getTicketPriceCategory(4),
            "Age 4 should be free");
        assertEquals("Child Price", Assignment.getTicketPriceCategory(5),
            "Age 5 should be child price");
        assertEquals("Child Price", Assignment.getTicketPriceCategory(12),
            "Age 12 should be child price");
        assertEquals("Student Price", Assignment.getTicketPriceCategory(13),
            "Age 13 should be student price");
        assertEquals("Student Price", Assignment.getTicketPriceCategory(21),
            "Age 21 should be student price");
        assertEquals("Adult Price", Assignment.getTicketPriceCategory(22),
            "Age 22 should be adult price");
    }
}