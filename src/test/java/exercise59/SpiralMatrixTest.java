package exercise59;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SpiralMatrixTest {

	private SpiralMatrix underTest;
	
	@Before
	public void setup() {
		underTest = new SpiralMatrix();
	}
	
	@Test
	public void shouldReturn3By3MatrixFrom9TestCase1() {
		int[][] spiralMatrix = {{1,2,3},{8,9,4},{7,6,5}};
		assertThat(underTest.spiralNumbers(3), is(spiralMatrix));
	}
}
