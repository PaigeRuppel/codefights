package exercise33;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringRearrangeScannerTest {

	
	@Test
	public void shouldReturnFalse() {
		StringRearrangeScanner underTest = new StringRearrangeScanner();
		String[] inputArray = {"aba", "bbb", "bab"};
		boolean response = underTest.stringsRearrangement(inputArray);
		assertEquals(false, response);
	}
	
	@Test
	public void shouldReturnTrue() {
		StringRearrangeScanner underTest = new StringRearrangeScanner();
		String[] inputArray = {"ab", "bb", "aa"};
		boolean response = underTest.stringsRearrangement(inputArray);
		assertEquals(true, response);
	}
}
