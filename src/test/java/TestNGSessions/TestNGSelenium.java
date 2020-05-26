package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSelenium {

	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get("https://app.hubspot.com/login");

	}
	
	@Test(priority=2)
	public void verifyLogInPageTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("login page title " +title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=1)
	public void verifySignUpLinkTest()
	{
		Assert.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
	}
	
	@Test(priority=3)
	public void loginTest(){
		driver.findElement(By.id("username")).sendKeys("naveem@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@1234");
		driver.findElement(By.id("loginBtn")).click();
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
		
	}
}
