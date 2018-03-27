package testsuitedemo;

import junit.framework.TestCase;

public class AnotherTest extends TestCase {
	private SimpleFraction f1, f2;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		f1 = new SimpleFraction(15, 25);
		f2 = new SimpleFraction(-27, 6);
	}

	public void testGetNumerator() {
		
		int result = f1.getNumerator();
		assertTrue("getNumerator() returned " + result + " instead of 15.",
		result == 15);
		result = f2.getNumerator();
		assertEquals(-27, result);
	}

	public void testSetDenominator() {
		int result;
		f1.setDenominator(100);
		result = f1.getDenominator();
		assertEquals(100, result);
		
		f2.setDenominator(200);
		result = f2.getDenominator();
		assertEquals(200, result);
	}

	public void testSetNumerator() {
		int result;
		f1.setNumerator(11);
		result = f1.getNumerator();
		assertEquals(11, result);
		
		f2.setNumerator(22);
		result = f1.getNumerator();
		//result = f2.getNumerator();
		assertEquals(22, result);
	}

}
