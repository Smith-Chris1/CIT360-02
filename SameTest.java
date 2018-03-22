import static org.junit.Assert.*;
import org.junit.Test;

public class SameTest {

	@Test
	public void sameTest() {
		Junit test = new  Junit();
		String result = "Is this the same?";
		assertSame("this is the same", "Is this the same?", result);
	}

}