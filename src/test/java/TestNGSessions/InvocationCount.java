package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	
	public void googletest() {
		System.out.println("This is my google test");
	}
}
