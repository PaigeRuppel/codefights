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

		StringBuffer converted = new StringBuffer();
		converted.append(-1);
		getSingleDigitAnswer(product);
		
		if (product >= 10) {
			factors.clear();
			product = generateFactors(product);
		} 
		
		if (factors.size() > 0) {
			converted.delete(0, 2);
			for (int i = 0; i < factors.size(); i++) {
				converted.append(factors.get(i));
			}
		}

		return Integer.parseInt(converted.toString());

	}

	private int generateFactors(int product) {
		for (int factor = 9; factor >= 2; factor--) {
			while (product % factor == 0) {
				//add to 0 to generate in ascending order
				factors.add(0, factor);
				product = product / factor;
			}
		}
		return product;
	}
	
	private void getSingleDigitAnswer(int temp) {
		if (temp == 0) {
			factors.add(10);
		} else {
			factors.add(temp);
		}
	}
	
}
