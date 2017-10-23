package exercise56;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FactoringToolTest {

	private FactoringTool underTest;
	
	@Before
	public void setup() {
		underTest = new FactoringTool();
	}

	@Test
	public void shouldReturn26From12TestCase1() {
		assertThat(underTest.digitsProduct(12), is(26));
	}

}
