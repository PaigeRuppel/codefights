package exercise47;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MacVerificationTest {

	private MacVerification underTest;
	
	@Before
	public void setup() {
		underTest = new MacVerification();
	}
	
	@Test
	public void validMacAddressIsTrueTestCase1() {
		assertTrue(underTest.isMAC8Address("00-1B-63-84-45-E6"));
	}
	
	@Test
	public void invalidMacAddressWithZIsFalseTestCase2() {
		assertFalse(underTest.isMAC8Address("Z1-1B-63-84-45-E6"));
	}
	
	@Test
	public void stringEntryIsFalseTestCase3() {
		assertFalse(underTest.isMAC8Address("not a Mac-48 address"));
	}
}
