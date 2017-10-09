package exercise46;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ElectionProjectionTest {

	private ElectionProjection underTest;
	
	
	@Before
	public void setup() {
		underTest = new ElectionProjection();
	}
	
	@Test
	public void shouldReturn2PossibleWinnersTestCase1() {
		int[] votes = {2, 3, 5, 2};
		assertThat(underTest.electionsWinners(votes, 3), is(2));
	}
}
