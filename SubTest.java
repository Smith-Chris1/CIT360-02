import static org.junit.Assert.*;
import org.junit.Test;

public class SubTest {

	@Test
	public void testSubtract() {
		Junit test = new  Junit();
		int result = test.subtract(20, 4);
		assertEquals(16, result);
	}

}