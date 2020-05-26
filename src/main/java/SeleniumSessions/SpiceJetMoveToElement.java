package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(5000);
		WebElement wb = driver.findElement(By.xpath("//a[contains(@id,'HyperLinkLogin')]"));
		WebElement wb1 = driver.findElement(By.xpath("//div[@id='smoothmenu1']/ul/li[15]/ul/li[2]/a"));
		WebElement wb2 = driver.findElement
		(By.xpath("//div[@id='smoothmenu1']/ul/li[15]/ul/li[2]/ul/li[1]/a[contains(text(),'Member Login')]"));
		
		mouseOverLevel1(wb,wb1,wb2,driver);
		
	}
	
	public static void mouseOverLevel1(WebElement element1, WebElement element2, 
			WebElement element3,WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element1).build().perform();
		act.moveToElement(element2).build().perform();
		act.click(element3).build().perform();
	}


}
