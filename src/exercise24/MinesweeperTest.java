package exercise24;

import org.junit.Assert;
import org.junit.Test;

public class MinesweeperTest {

	@Test
	public void shouldReturnAllZeroes() {
		Minesweeper underTest = new Minesweeper();
		boolean[][] input = { { false, false, false }, { false, false, false } };
		int[][] answer = underTest.sweep(input);
		int[][] expectedAnswer = {{0,0,0},{0,0,0}}; 
		Assert.assertArrayEquals(expectedAnswer , answer);
	}
	
	@Test 
	public void testCase1FromCodeFights() {
		Minesweeper underTest = new Minesweeper();
		boolean[][] input = {{true,false,false}, {false, true, false}, {false, false, false}};
		int[][] answer = underTest.sweep(input);
		int[][] expectedAnswer = {{1, 2, 1}, {2, 1, 1}, {1, 1, 1}};
		Assert.assertArrayEquals(expectedAnswer,  answer);
	}
}
