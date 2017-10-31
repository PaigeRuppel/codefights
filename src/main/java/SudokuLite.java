import java.util.HashSet;
import java.util.Set;

public class SudokuLite {

	public boolean sudoku(int[][] grid) {
		// TODO Auto-generated method stub
		return isValidHorizontal(grid);
	}

	private boolean isValidHorizontal(int[][] grid) {
		Set<Integer> values = buildPossibleNumbersSet();
		boolean isValid = true;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				int currentNumber = grid[row][col];
				if (values.contains(currentNumber)) {
					values.remove(currentNumber);
				} else {
					isValid = false;
					break;
				}
			}
			values = buildPossibleNumbersSet();
		}
		return isValid;
	}
	
	private boolean isValidSmallerGrids(int[][] grid) {
		 
	}

	private Set<Integer> buildPossibleNumbersSet() {
		Set<Integer> oneThroughNine = new HashSet<>();
		oneThroughNine.add(1);
		oneThroughNine.add(2);
		oneThroughNine.add(3);
		oneThroughNine.add(4);
		oneThroughNine.add(5);
		oneThroughNine.add(6);
		oneThroughNine.add(7);
		oneThroughNine.add(8);
		oneThroughNine.add(9);
		return oneThroughNine;
	}

}
