package exercise57;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class UniqueFileCatalogTest {

	private UniqueFileCatalog underTest;
	
	@Before
	public void setup() {
		underTest = new UniqueFileCatalog();
	}
	
	@Test
	public void shouldReturnUniqueArrayTestCase1() {
		String[] input = {"doc", "doc", "image", "doc(1)", "doc"};
		String[] output = {"doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"};
		assertThat(underTest.fileNaming(input), is(output));
	}
}
