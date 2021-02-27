package com.piklu.unit5;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
	
	SimpleCalculator simpleCalculator;

	@Nested
	class TestSimpleCalculatorContructor {
		
		@Test
		@DisplayName("no-arg constructor throws error")
		void testNoArgConstructorThrowsError() {
			assertThrows(IllegalArgumentException.class, () -> new SimpleCalculator());
		}
	}
	
	@Nested
	class TestSimpleCalculatorMethods {
		
		@BeforeEach
		void init() {
			double firstNumber = 5.5;
			double second
		}
		
	}

}
