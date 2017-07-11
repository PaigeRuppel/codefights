package exercise28;

import org.junit.Assert;
import org.junit.Test;

public class AlphabetShifterTest {

	@Test
	public void shouldReturnbcd() {
		AlphabetShifter underTest = new AlphabetShifter();
		String response = underTest.alphabeticShift("abc");
		Assert.assertEquals("bcd", response);
	}
}
