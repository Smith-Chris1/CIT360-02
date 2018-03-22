import static org.junit.Assert.*;
import org.junit.Test;

public class NullTest {

	@Test
	public void nullTest() {
		Junit test = new  Junit();
		String result = null;
		assertNull("this is null", result);
	}

}