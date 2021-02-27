package com.piklu.unit4;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@DisplayName("When runnning speed convertor tests")
class SpeedConverterTest {
	
	SpeedConverter speedConverter;
	
	@BeforeEach
	void init() {
		speedConverter = new SpeedConverter();
	}
	
	@Nested
	@DisplayName("test conversion of kilometers per hour to miles per hour")
	@Tag("CalculateToMiles")
	class TestToMilesPerHour {

		@Test
		@DisplayName("negative kmps return -1")
		void testNegativeKilometersPerHour() {
			double kilometersPerHour = -9.5;
			long expected = -1;
			long actual = speedConverter.toMilesPerHour(kilometersPerHour);
			
			assertEquals(expected, actual, () -> "negative kmps should return -1");
		}
		
		@Test
		@DisplayName("convert kmph to mph")
		void testToMilesConversion() {
			assertAll(
					() -> assertEquals(
							1,
							speedConverter.toMilesPerHour(1.5),
							() -> "1.5 kmph = 1 mph but converted to " + speedConverter.toMilesPerHour(1.5) + "mph"),
					() -> assertEquals(
							6,
							speedConverter.toMilesPerHour(10.25),
							() -> "10.25 kmph = 6 mph but converted to " + speedConverter.toMilesPerHour(10.25) + "mph"),
					() -> assertEquals(
							16,
							speedConverter.toMilesPerHour(25.42),
							() -> "25.42 kmph = 16 mph but converted to " + speedConverter.toMilesPerHour(25.42) + "mph"),
					() -> assertEquals(
							47,
							speedConverter.toMilesPerHour(75.114),
							() -> "75.114 kmph = 47 mph but converted to " + speedConverter.toMilesPerHour(75.114) + "mph")
					);
		}
		
	}
	
	@Nested
	@DisplayName("test print conversion of kilometers per hour to miles per hour")
	@Tag("DisplayToMiles")
	class TestPrintConversion {
		
		@Test
		@DisplayName("invalid value")
		void testNegativeKilometersPerHour() {
			String expected = "Invalid Value";
			String actual = speedConverter.printConversion(-2.0);
			assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("print in format 'XX km/h = YY mi/h'")
		void testPrintConversion() {
			assertAll(
					() -> assertEquals(
							"1.5 km/h = 1 mi/h",
							speedConverter.printConversion(1.5),
							() -> "should return 1.5 km/h = 1 mi/h but returned, 1.5 km/h = " + speedConverter.printConversion(1.5) + " mi/h"),
					() -> assertEquals(
							"10.25 km/h = 6 mi/h",
							speedConverter.printConversion(10.25),
							() -> "should return 10.25 km/h = 6 mi/h but returned, 10.25 km/h = " + speedConverter.printConversion(10.25) + " mi/h"),
					() -> assertEquals(
							"25.42 km/h = 16 mi/h",
							speedConverter.printConversion(25.42),
							() -> "should return 25.42 km/h = 16 mi/h but returned, 25.42 km/h = " + speedConverter.printConversion(25.42) + " mi/h"),
					() -> assertEquals(
							"75.114 km/h = 47 mi/h",
							speedConverter.printConversion(75.114),
							() -> "should return 75.114 km/h = 47 mi/h but returned, 75.114 km/h =" + speedConverter.printConversion(75.114) + " mi/h")
					);
		}
	}

}




























