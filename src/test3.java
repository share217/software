import static org.junit.Assert.*;

import org.junit.Test;

public class test3 {

	
	@Test
	public void test() {
		Model m40=new Model();
		double res=m40.division(12.0,2.0);
		assertEquals(6.0,res,.00);
	}

	 
	@Test
	public void divideByZeroShouldBeDetected(){
	    Model m = new Model();
	    float res=(float) m.division(12.0,0.0);
	    
	    
	    assertEquals("divide float by zero should be infinity", true, Float.isInfinite(res));
	}
}
