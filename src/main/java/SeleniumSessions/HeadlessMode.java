package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessMode {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless"); //headless mode
		
		co.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are " + links.size());
		
		for(int i=0;i<links.size();i++)
		{
			String s=links.get(i).getText();
			if(!s.isEmpty()){
			System.out.println(i+ "===> " +s.trim());
			System.out.println(links.get(i).getAttribute("href"));
			}
		}
	}

}
