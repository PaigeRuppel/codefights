package exercise55;

import java.util.HashMap;
import java.util.Map;

public class GridView {

	/*
	 * Given a rectangular matrix containing only digits, calculate the number of
	 * different 2 × 2 squares in it.
	 */
	
	
	public int differentSquares(int[][] matrix) {
		//always a 2x2 square
		Map<String, Integer> possibleSquares = new HashMap<>();
		int leftEdge = matrix[0].length - 1;
		int bottomEdge = matrix.length - 1;
		
		for (int x = 0; x < leftEdge; x++) {
			for (int y = 0; y < bottomEdge; y++) {
					String square = "" + matrix[y][x] + matrix[y+1][x] + matrix[y][x+1] + matrix [y+1][x+1];
					possibleSquares.put(square, 0);
			}
		}
		
		return possibleSquares.size();
	}

}
