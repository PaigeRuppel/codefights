package exercise33;

import java.util.ArrayList;

public class StringRearrangeScanner {

	/**
	 * Given an array of equal-length strings, check if it is possible to rearrange
	 * the strings in such a way that after the rearrangement the strings at
	 * consecutive positions would differ by exactly one character.
	 */
	public boolean stringsRearrangement(String[] inputArray) {
		int differences = 0;
		int duplicates = 0;

		for (int first = 0; first < inputArray.length - 1; first++) {
			for (int next = first + 1; next < inputArray.length; next++) {
				if (areOffByOneChar(inputArray[first], inputArray[next])) {
					differences++;
				} else if (isDuplicate(inputArray[first], inputArray[next])) {
					duplicates++;
				}
			}
		}
		int numberPairs = inputArray.length - 1;
		/**
		 * TODO - think about how duplicates constrain the way in which the array can be
		 * rearranged to satisfy the conditions - may need to store duplicates in a
		 * separate array to look at the actual rearrangement in some cases?
		 */
		int availableSwaps = differences - duplicates;
		if (duplicates > 1 && inputArray.length % 2 == 0) {
			return availableSwaps > inputArray.length - 1;
		} else {
			return availableSwaps >= inputArray.length - 1;
		}
	}

	public boolean areOffByOneChar(String a, String b) {
		int differences = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				differences++;
			}
		}
		return differences == 1;
	}

	public boolean isDuplicate(String a, String b) {
		return a.equals(b);
	}

}
