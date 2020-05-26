package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	
	public void loginTest() {
		System.out.println("Login mthod");
		//int i=9/0;
	}

@Test(dependsOnMethods="loginTest",priority=2)
	
	public void homePageTest() {
		System.out.println("homePageTest mthod");
	}
@Test(dependsOnMethods="loginTest",priority=1)

public void searchPageTest() {
	System.out.println("searchPageTest mthod");
}
}
