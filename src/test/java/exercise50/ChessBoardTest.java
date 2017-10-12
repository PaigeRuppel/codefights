package exercise50;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ChessBoardTest {

	private ChessBoard underTest;

	@Before
	public void setup() {
		underTest = new ChessBoard();
	}
	
	@Test
	public void shouldReturnTwoPossibleMovesFromPositionA1() {
		assertThat(underTest.chessKnight("A1"), is(2));
	}
	
	@Test
	public void shouldReturnTwoPossibleMovesFromPositionC2() {
		assertThat(underTest.chessKnight("C2"), is(6));
	}
}
