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
		int givenProd = product;
		StringBuffer converted = new StringBuffer();
		getSingleDigitAnswer(product);
		
		if (product >= 10) {
			factors.clear();
			product = generateFactors(product);
		} 
		
		int checkProduct = 1;
		for (int i = 0; i < factors.size(); i++) {
			converted.append(factors.get(i));
			checkProduct *= factors.get(i);
		}
	
		if (checkProduct != givenProd && givenProd > 9) {
			converted.replace(0, factors.size(), "-1");
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
