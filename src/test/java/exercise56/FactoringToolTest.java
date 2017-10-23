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

	@Test
	public void shouldReturnNegative1From18TestCase2() {
		assertThat(underTest.digitsProduct(19), is(-1));
	}
	
	@Test
	public void shouldReturnNegative2559From450TestCase3() {
		assertThat(underTest.digitsProduct(450), is(2559));
	}
}
