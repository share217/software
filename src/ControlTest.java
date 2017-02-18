import static org.junit.Assert.*;

import org.junit.Test;

public class ControlTest {

	
	@Test
	public void test() {
		Controller c3=new Controller(12.0,5.0);
		double result4=c3.opsub();
		assertEquals(7.0,result4,.00);
	}

	
}
