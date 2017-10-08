package exercise39;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreasureValueCalculatorTest {

	private TreasureValueCalculator underTest;
	
	@Before
	public void setup() {
		underTest = new TreasureValueCalculator();
	}
	
	@Test
	public void shouldReturnGreatestValue4GivenValues3And4() {
		assertThat(underTest.findGreatestValue(4, 3), is(4));
	}

	@Test
	public void shouldReturnGreatestValue8GivenValues1And8() {
		assertThat(underTest.findGreatestValue(1, 8), is(8));
	}
	
	@Test
	public void isWeight8GreaterThan6ShouldReturnTrue() {
		assertTrue(underTest.isGreaterThanMaxWeight(8, 6));
	}
	
	@Test
	public void isWeight6GreaterThan6ShouldReturnFalse() {
		assertFalse(underTest.isGreaterThanMaxWeight(6, 6));
	}

}
 