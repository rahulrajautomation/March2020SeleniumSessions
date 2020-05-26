package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		if(wait.until(ExpectedConditions.titleContains("Spot")))
				{
			String title=driver.getTitle();
				System.out.println("Correct Title found and it is " + title);
				}
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		Alert aler=wait.until(ExpectedConditions.alertIsPresent());
		//wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
	}

}
