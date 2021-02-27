package com.piklu.unit4;

public class BarkingDog {

	public boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (!barking) {
			return false;
		} else {
			if (hourOfDay < 0 || hourOfDay > 23 || (hourOfDay >= 8 && hourOfDay <= 22)) {
				return false;
			}
		}
		return true;
	}

}
