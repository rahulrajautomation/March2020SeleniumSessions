package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableGeneric {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();
		
		selectContact(driver, "Naveen");
		selectContact(driver, "Tom");
		
	}
	
	public static void selectContact(WebDriver driver,String contact){
		
		driver.findElement(By.xpath("//span[text()='"+contact+"']//ancestor::td//preceding-sibling::td//"
				+ "span[class='private-checkbox__indicator']"));
		
	}

}
