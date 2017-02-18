import org.junit.Test;

import junit.framework.TestCase;

public class test1 extends TestCase {

	@Test
	public void testadd(){
		
			Model m2=new Model();
			double result=m2.addition(2.0, 3.5);
			assertEquals(5.5,result);
		
		
		
	}
}
