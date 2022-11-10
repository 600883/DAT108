package no.hvl.dat108.app.util;

public class InputValidator {

	private static final String ANY_DIGIT = "[0-9]";
	private static final String EIGHT_DIGIT = "{8}";
	
	public static boolean isValid(String mobil) {
		return mobil != null && mobil.matches(ANY_DIGIT + EIGHT_DIGIT); 
	}
	
}
