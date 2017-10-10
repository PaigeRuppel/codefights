package exercise47;

import java.util.ArrayList;
import java.util.List;

public class MacVerification {

	public static List<Character> validChars = new ArrayList<>();
	
	public boolean isMAC8Address(String inputString) {
		boolean valid = true;
		buildValidCharList();
		String[] splitOnHyphens = inputString.split("-", 6);
		valid = isValidLength(splitOnHyphens);
		
		
		for (int i = 0; i < splitOnHyphens.length; i++) {
			char[] pair = splitOnHyphens[i].toCharArray();
			if (!isValidPair(pair)) {
				valid = false;
			}
		}
		
		return valid;
	}
	
//	private boolean isValidPattern(String input) {
//		return 
//	}
	private boolean isValidPair(char[] pair) {
		return pair.length == 2 && validChars.contains(pair[0]) && validChars.contains(pair[1]);
	}

	private boolean isValidLength(String[] splitOnHyphens) {
		return splitOnHyphens.length == 6;
	}
	
	private void buildValidCharList() {
		validChars.add('0');
		validChars.add('1');
		validChars.add('2');
		validChars.add('3');
		validChars.add('4');
		validChars.add('5');
		validChars.add('6');
		validChars.add('7');
		validChars.add('8');
		validChars.add('9');
		validChars.add('A');
		validChars.add('B');
		validChars.add('C');
		validChars.add('D');
		validChars.add('E');
		validChars.add('F');
	}

}
