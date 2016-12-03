package demowork;

import junit.framework.TestCase;

public class Testcalculator extends TestCase{
	
	public void testAdd()
	{
		calculator obj = new calculator();
		assertEquals(10,obj.add(4,7));
	}

}
