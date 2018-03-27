package testsuitedemo;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for testsuitedemo");
		//$JUnit-BEGIN$
		suite.addTestSuite(SimpleFractionTest.class);
		suite.addTestSuite(AnotherTest.class);
		//$JUnit-END$
		return suite;
	}
}
