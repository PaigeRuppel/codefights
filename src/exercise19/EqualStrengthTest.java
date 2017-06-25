package exercise19;

import org.junit.Assert;
import org.junit.Test;

public class EqualStrengthTest {

	@Test
	public void identicalEntriesShouldReturnTrue() {
		EqualStrength underTest = new EqualStrength();
		int yourLeft = 10;
		int yourRight = 10;
		int friendsLeft = 10;
		int friendsRight = 10;
		boolean response = underTest.areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
		Assert.assertEquals(true, response);
	}
}
