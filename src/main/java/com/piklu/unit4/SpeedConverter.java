package com.piklu.unit4;

public class SpeedConverter {
	
	long convertKilometersToMiles(double kilometersPerHour) {
		
		double kilometersToMilesRatioPerHour = 1 / 1.609;
		
		return (long) Math.round(
				kilometersToMilesRatioPerHour * kilometersPerHour
			);
	}

	public long toMilesPerHour(double kilometersPerHour) {
		
		long invalidKmph = -1;
		
		if (kilometersPerHour < 0) {
			return invalidKmph;
		}
		
		return convertKilometersToMiles(kilometersPerHour);
	}

	public String printConversion(double kilometersPerHour) {
		
		String invalidString = "Invalid Value";
		
		if(kilometersPerHour < 0) {
			return invalidString;
		}
		
		long milesPerHour = convertKilometersToMiles(kilometersPerHour);
		
		return kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
	}
}
