package junitdemo;

import junit.framework.TestCase;

public class SimpleFractionTest extends TestCase {

	
	private SimpleFraction f1, f2;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		f1 = new SimpleFraction(15, 25);
		f2 = new SimpleFraction(-27, 6);
	}

	public void testSimplify() {
		
		f1.simplify();
		assertEquals(3, f1.getNumerator());
		assertEquals(5, f1.getDenominator());
		/*
		f2.simplify();
		assertEquals(-9, f2.getNumerator());
		assertEquals(2, f2.getDenominator());
		*/
	}

	public void testGetDenominator() {
	
		int result = f1.getDenominator();
		assertTrue("getDenominator() returned " + result + " instead of 25.",
		result == 25);
		result = f2.getDenominator();
		assertEquals(6, result);
	}

}
