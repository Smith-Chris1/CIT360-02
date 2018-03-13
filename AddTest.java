import static org.junit.Assert.*;
import org.junit.Test;

public class AddTest {

	@Test
	public void testAdd () {
		Junit test = new  Junit();
		int result = test.add(110, 10);
		assertEquals(120, result);		
	}

}
