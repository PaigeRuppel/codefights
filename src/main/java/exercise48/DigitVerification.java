package exercise48;

import java.util.regex.Pattern;

public class DigitVerification {

	public boolean isDigit(char c) {
		String asString = "" + c;
		return Pattern.matches("[0-9]", asString);
	}

}
