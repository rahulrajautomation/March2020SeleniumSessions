package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyLogInPageTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("login page title " +title);
	}
	

}
