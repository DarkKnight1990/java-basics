package com.piklu.unit4;

public class MegaBytesConverter {
	
	String convertKiloByteToMegaByte(int kiloBytes) {
		int mbPart = kiloBytes / 1024;
		int kbPart = kiloBytes % 1024;
		
		return kiloBytes + " KB = " + mbPart + " MB and " + kbPart + " KB";
	}

	public String printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			return "Invalid Value";
		}
		return convertKiloByteToMegaByte(kiloBytes);
	}

}
