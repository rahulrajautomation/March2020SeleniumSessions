package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginPageTest extends BaseTest {

	@Test(priority=2)
	public void verifyLogInPageTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("login page title " +title);
		Assert.assertEquals(title, "HubSpot Login111", "Title is not found");
	}
	
	@Test(priority=1)
	public void verifySignUpLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed(),"Signup link not found");
	}
	
	@Parameters({"username","password"})
	@Test(priority=3)
	public void loginTest(String un,String pwd){
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("loginBtn")).click();
	}
	
}
