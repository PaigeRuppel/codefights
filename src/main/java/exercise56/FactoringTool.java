package exercise56;

import java.util.ArrayList;
import java.util.List;

public class FactoringTool {

	/*
	 * Given an integer product, find the smallest positive (i.e. greater than 0)
	 * integer the product of whose digits is equal to product. If there is no such
	 * integer, return -1 instead.
	 */

	private List<Integer> factors = new ArrayList<>();

	public int digitsProduct(int product) {

		int temp = product;
		StringBuffer converted = new StringBuffer();
		converted.append(-1);
		getSingleDigitAnswer(temp);
		
		if (product >= 10) {
			factors.clear();
			generateFactors(temp);
		} 
		
		if (factors.size() == 1 && product < 10) {
			converted.delete(0, 2);
			for (int i = 0; i < factors.size(); i++) {
				converted.append(factors.get(i));
			}
		} else if (factors.size() > 1) {
			converted.delete(0, 2);
			for (int i = 0; i < factors.size(); i++) {
				converted.append(factors.get(i));
			}
		}

		return Integer.parseInt(converted.toString());

	}

	private void generateFactors(int temp) {
		for (int factor = 9; factor >= 2; factor--) {
			while (temp % factor == 0) {
				//add to 0 to generate in ascending order
				factors.add(0, factor);
				temp = temp / factor;
			}
		}
	}
	
	private void getSingleDigitAnswer(int temp) {
		if (temp == 0) {
			factors.add(10);
		} else {
			factors.add(temp);
		}
	}
	
}
