package exercise56;

import java.util.ArrayList;
import java.util.List;

public class FactoringTool {

	/*
	 * Given an integer product, find the smallest positive (i.e. greater than 0)
	 * integer the product of whose digits is equal to product. If there is no such
	 * integer, return -1 instead.
	 */

	public int digitsProduct(int product) {
		List<Integer> factors = new ArrayList<>();

		int temp = product;
		String converted = "";

		// try starting from 9 and working down to 2 instead... Will eliminate having duplicate 2s 3s etc 
		for (int factor = 9; factor >= 2; factor--) {
			while (temp % factor == 0) {
				factors.add(0, factor);
				temp = temp / factor;
			}
		}
		if (factors.size() == 0) {
			converted = "-1";
		} else {
			for (int i = 0; i < factors.size(); i++) {
				converted += "" + factors.get(i);
			}
		}
		return Integer.parseInt(converted);

	}
}
