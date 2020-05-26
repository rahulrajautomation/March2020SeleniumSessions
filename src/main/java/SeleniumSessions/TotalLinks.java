package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
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
