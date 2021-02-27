package com.piklu.unit4;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("when running MegBytesConsumerTest")
public class MegaBytesConverterTest {
	
	MegaBytesConverter megaBytesConverter;
	
	@BeforeEach
	void init() {
		megaBytesConverter = new MegaBytesConverter();
	}
	
	@Test
	@DisplayName("test negative kilobytes")
	void testNegativeKilobytes() {
		String expected = "Invalid Value";
		String actual = megaBytesConverter.printMegaBytesAndKiloBytes(-78);
		
		assertEquals(expected, actual, () -> "should return 'Invalid Value' for (-ve) kilo bytes");
	}
	
	@Test
	@DisplayName("test print format for MegaBytes aand KiloBytes conversion")
	void testPrintMegaBytesAndKiloBytes() {
		assertAll(
				() -> assertEquals("2500 KB = 2 MB and 452 KB", megaBytesConverter.printMegaBytesAndKiloBytes(2500), () -> "should print 2500 KB = 2 MB and 452 KB"),
				() -> assertEquals("5000 KB = 4 MB and 904 KB", megaBytesConverter.printMegaBytesAndKiloBytes(5000), () -> "should print 5000 KB = 4 MB and 904 KB")
				);
	}

}
