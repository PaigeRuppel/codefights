package exercise35;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DigitDetectorTest {

	private DigitDetector underTest;
	
	@Before
	public void setup() {
		underTest = new DigitDetector();
	}
	@Test
	public void shouldReturn1() {
		assertThat(underTest.firstDigit("var_1__Int"), is('1'));
	}
}
