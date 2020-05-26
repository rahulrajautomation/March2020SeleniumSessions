package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		ElementUtil eu=new ElementUtil(driver);
		driver.get("https://app.hubspot.com/login");
		
		String title=eu.WaitForTitleToBePresent("Hub", 10);
		System.out.println("Login Page title is " +title);
		
		if(eu.waitForURL("login", 5)){
			System.out.println("login is present in URL");
		}
		
		By user=By.id("username");
		By pass=By.id("password");
		By login=By.id("loginBtn");
		
		ElementUtil elementutil=new ElementUtil(driver);
		elementutil.waitForElementPresent(user, 10).sendKeys("naveen@gmail.com");
		elementutil.dosendkeys(pass, "test@1234");
		elementutil.waitForElementToBeClickable(login, 5).click();
	}

}
