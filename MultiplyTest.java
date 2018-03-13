import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Junit test = new  Junit();
		int result = test.multiply(12, 9);
		assertEquals(108, result);
	}

}
