package com.piklu.unit4;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("When running barking dog tests")
public class BarkingDogTest {
	
	BarkingDog barkingDog;
	
	@BeforeEach
	void init() {
		barkingDog = new BarkingDog();
	}
	
	@Test
	@DisplayName("if dog not barking")
	void testShouldReturnFalseIfDogNotBarking() {
		boolean barking = false;
		int hourOfDay = 10;
		assertFalse(barkingDog.shouldWakeUp(barking, hourOfDay));
	}
	
	@Test
	@DisplayName("negative hour")
	void testShouldReturnFalseForNegativeHour() {
		boolean barking = true;
		int hourOfDay = -2;
		assertFalse(barkingDog.shouldWakeUp(barking, hourOfDay));
	}
	
	@Test
	@DisplayName("hour greater than 23")
	void testShouldReturnFalseIfHourGreaterThan() {
		boolean barking = true;
		int hourOfDay = 25;
		assertFalse(barkingDog.shouldWakeUp(barking, hourOfDay));
	}
	
	@Test
	@DisplayName("hour after 8 and before 22")
	void testShouldReturnFalseIfHourAfterEightAndBeforeTwentyTwo() {
		assertAll(
				() -> assertFalse(barkingDog.shouldWakeUp(true, 8)),
				() -> assertFalse(barkingDog.shouldWakeUp(true, 22))
				);
	}
	
	@Test
	@DisplayName("hour before 8 and after 22")
	void testShouldReturnTrueIfHourBeforeEightAndAfterTwentyTwo() {
		assertAll(
				() -> assertTrue(barkingDog.shouldWakeUp(true, 5)),
				() -> assertTrue(barkingDog.shouldWakeUp(true, 7)),
				() -> assertTrue(barkingDog.shouldWakeUp(true, 23))
				);
	}
}



















