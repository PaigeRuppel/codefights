package exercise58;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BinaryEncoderTest {

	private BinaryEncoder underTest;
	
	@Before
	public void setup() {
		underTest = new BinaryEncoder();
	}
	
	@Test
	public void shouldReturnHelloFrom8BitBinaryTestCase1() {
		assertThat(underTest.messageFromBinaryCode("010010000110010101101100011011000110111100100001"), is("Hello!"));
	}
}
