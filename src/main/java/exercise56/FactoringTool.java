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
		String converted = "-1";
		
		for(int i=2; i <= temp; i++){
            while(temp % i==0){
                factors.add(i);
                temp = temp/i;

                if (factors.get(0) * temp == product) {
                	converted = factors.get(0) + "" + temp;
                }
            }
        }
		
		if (factors.contains(product)) {
			converted = "-1";
		}
		
		return Integer.parseInt(converted);
		
	}

}
