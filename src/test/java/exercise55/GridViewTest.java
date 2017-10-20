package exercise55;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GridViewTest {

	private GridView underTest;

	@Before
	public void setup() {
		underTest = new GridView();
	}

	@Test
	public void shouldReturn6DifferentSquaresTestCase1() {
		int[][] matrix = { { 1, 2, 1 }, { 2, 2, 2 }, { 2, 2, 2 }, { 1, 2, 3 }, { 2, 2, 1 } };
		assertThat(underTest.differentSquares(matrix), is(6));
	}

	@Test
	public void shouldReturn1SquareTestCase2() {
		int[][] matrix = { { 9, 9, 9, 9, 9 }, { 9, 9, 9, 9, 9 }, { 9, 9, 9, 9, 9 }, { 9, 9, 9, 9, 9 },
				{ 9, 9, 9, 9, 9 } };
		assertThat(underTest.differentSquares(matrix), is(1));
	}

	@Test
	public void shouldReturn0SquaresTestCase3() {
		int[][] matrix = { { 3 } };

		assertThat(underTest.differentSquares(matrix), is(0));
	}

}
