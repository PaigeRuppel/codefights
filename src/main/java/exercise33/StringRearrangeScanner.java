package exercise33;

public class StringRearrangeScanner {

	public boolean stringsRearrangement(String[] inputArray) {
		int differences = 0;
		int first = 0;
		for (int next = 1; next < inputArray.length; next++) {
			char[] a = inputArray[first].toCharArray();
			char[] b = inputArray[next].toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					differences ++;
				}
				if (differences > 1) {
					String holder = inputArray[next];
					inputArray[next] = inputArray[first];
					inputArray[first] = holder;
				}
				if (differences > 2) {
					return false;
				}
			}
		}
		return true;
	}


}
