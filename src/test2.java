import org.junit.Test;

import junit.framework.TestCase;

public class test2 extends TestCase {

	@Test
	public void testmult(){
		Model m3=new Model();
		double result3=m3.multiply(2.0, 3.5);
		assertEquals(7.0,result3);
		
	}
}
