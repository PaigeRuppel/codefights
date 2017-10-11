package exercise49;

import java.util.ArrayList;
import java.util.List;

public class Encoder {

	public String lineEncoding(String input) {
		String encoded = "";
		char[] asArray = input.toCharArray();
		int count = 1;

		for (int first = 0, next = 1; next < asArray.length; first++, next++) {
			if (asArray[first] == asArray[next]) {
				count++;
			} else {
				encoded += count + "" + asArray[first];
				count = 1;
			}
			if (next == asArray.length - 1) {
				encoded += count + "" + asArray[next];
			}
		}
		encoded = encoded.replaceAll("1", "");

		return encoded;
	}

}
