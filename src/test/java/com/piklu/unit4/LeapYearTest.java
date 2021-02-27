package com.piklu.unit4;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("When running leap year test")
public class LeapYearTest {
	
	LeapYear leapYear;
	
	@BeforeEach
	void init() {
		leapYear = new LeapYear();
	}
	
	@Test
	@DisplayName("year outside range 1 - 9999")
	void testShouldReturnFalseForValueNotInRange() {
		assertFalse(leapYear.isLeapYear(-1600));
	}
	
	@Test
	@DisplayName("assert isLeapYear or not")
	void testCheckIfLeapYear() {
		assertAll(
				() -> assertFalse(leapYear.isLeapYear(2017)),
				() -> assertTrue(leapYear.isLeapYear(1600)),
				() -> assertFalse(leapYear.isLeapYear(1900)),
				() -> assertTrue(leapYear.isLeapYear(2000))
				);
	}
	
}
