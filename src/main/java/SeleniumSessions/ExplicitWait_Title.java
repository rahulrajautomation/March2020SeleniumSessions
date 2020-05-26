package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Title {

	public static void main(String[] args) {

		//1. WebdriverWait
		//2. FluentWait
		//Webdriverwait is extending Fluentwait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		System.out.println(driver.getTitle());

	}

}
