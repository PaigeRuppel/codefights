package exercise24;

public class Minesweeper {

	public int[][] sweep(boolean[][] input) {
		int row = input.length;
		int col = input[0].length;
		int[][] answer = new int[row][col];

		for (int x = 0; x < row; x++) { // iterate over the rows
			for (int y = 0; y < col; y++) { // iterate over the columns
				if (input[x][y]) { // if the input matrix at that position is
									// true
					updateCells(answer, x, y); // call the update cell method
												// that updates all neighboring
												// cells
				}

			}
		}
		return answer;
	}

	/**
	 * this method will look at all potential neighboring cells depending on the
	 * current position in the iteration needs to look at a maximum of 8
	 * positions (4 corners + 4 sides) - i.e. 8 increments in this method
	 */

	public void updateCells(int[][] answer, int x, int y) {
		if (x > 0) { // if x is not at the min value
			answer[x - 1][y]++; // look back one x value and increment that cell
			if (y > 0) { // if y is not at the min value
				answer[x - 1][y - 1]++; // look back one x and one y value and
										// increment that cell
			}
			if (y < answer[0].length - 1) { // if y is not at the maximum value,
											// look forward one y value and
											// increment that cell
				answer[x - 1][y + 1]++;
			}
		}

		if (y > 0) { // same idea for y, if not at the min value
			answer[x][y - 1]++; // stay on that row, and look back one column to
								// ++
		}

		if (y < answer[0].length - 1) {
			answer[x][y + 1]++; // if y is not at the maximum, look forward one
								// column and increment
		}

		if (x < answer.length - 1) { // if x is not at the max value
			answer[x + 1][y]++; // look forward one row at that column to
								// increment
			if (y > 0) // and y is greater than 0
				answer[x + 1][y - 1]++; // look forward one row and back one
										// column to increment
			if (y < answer[0].length - 1)
				answer[x + 1][y + 1]++; // if y is not at the maximum, look
										// forward one row and one column and
										// increment
		}

	}
}
