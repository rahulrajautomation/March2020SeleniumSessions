package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_WebElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		driver.get("https://app.hubspot.com/login");
		
		By user=By.id("username");
		By pass=By.id("password");
		By login=By.id("loginBtn");
		
		/*WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
		driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		
		wait=new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
		
		driver.findElement(By.id("loginBtn")).click();*/
		
		waitForElementPresent(driver, 10, user).sendKeys("naveen@gmail.com");
		driver.findElement(pass).sendKeys("test@1234");
		waitForElementPresent(driver, 5, login).click();

	}
	
	public static WebElement waitForElementPresent(WebDriver driver,int timeout,By locator){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
		

	}
}
