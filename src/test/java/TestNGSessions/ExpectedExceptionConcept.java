package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions=Exception.class)
	public void divTest()
	{
		int a=9/0;
	}
}
