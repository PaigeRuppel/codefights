package exercise52;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class LongestWordTest {

	private LongestWord underTest;
	
	@Before
	public void setup() {
		underTest = new LongestWord();
	}

	@Test
	public void shouldReturnSteadyFromReadySteadyGo() {
		assertThat(underTest.longestWord("ready, steady, go"), is("steady"));
	}
}
