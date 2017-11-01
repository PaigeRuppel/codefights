import java.util.HashSet;
import java.util.Set;

public class SudokuLite {

	public boolean sudoku(int[][] grid) {
		return isValidHorizontal(grid) && isValidVertical(grid) && isValidSmallGrids(grid);
	}

	private boolean isValidSmallGrids(int[][] grid) {
		Set<Integer> values = buildPossibleNumbersSet();
		boolean isValid = true;
		int colStart = 0;
		while (colStart < 7 && isValid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = colStart; col < colStart + 3; col++) {
				if (row == 0 || row == 3 || row == 6) {
					values = buildPossibleNumbersSet();
				}
				int currentNumber = grid[row][col];
				if (!values.contains(currentNumber)) {
					return false;
				}
				values.remove(currentNumber);
			}
		}
		colStart += 3;
		}
		return isValid;
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

	private boolean isValidVertical(int[][] grid) {
		Set<Integer> values = buildPossibleNumbersSet();
		boolean isValid = true;
		for (int col = 0; col < grid[0].length; col++) {
			for (int row = 0; row < grid.length; row++) {
				int currentNumber = grid[row][col];
				if (!values.contains(currentNumber)) {
					isValid = false;
					break;
				}
				values.remove(currentNumber);
			}
			values = buildPossibleNumbersSet();
		}
		return isValid;
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
