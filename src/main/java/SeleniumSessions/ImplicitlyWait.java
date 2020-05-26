package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// implicit wait applied for all elements
		//implicit wait is dynamic.if element found in 5 seconds then 5 seconds will be cancelled out.
		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.id("username")).sendKeys("naveen");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		//nullify implicit wait
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
	}

}
