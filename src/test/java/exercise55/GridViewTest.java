package exercise55;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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

}
