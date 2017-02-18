import static org.junit.Assert.*;

import org.junit.Test;

public class ControllerTest2 {

	@Test
	public void test(){
			Controller c9=new Controller(12.0,5.0);
			double result10=c9.opmod();
			assertEquals(2.0,result10,.00);
	}

}
