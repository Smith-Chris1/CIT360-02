import static org.junit.Assert.*;
import org.junit.Test;

public class DivideTest {

	@Test
	public void testDivide() {
		Junit test = new  Junit();
		int result = test.divide(81, 9);
		assertEquals(9, result);
	}

}