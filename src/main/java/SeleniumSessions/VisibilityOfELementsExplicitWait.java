package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfELementsExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		ElementUtil eu=new ElementUtil(driver);
		driver.get("https://www.freshworks.com/");
		By footerlinklist=By.cssSelector("ul.footer-nav li");
		List<WebElement> footerlink=eu.visiblityOfAllElemets(footerlinklist, 5);
		System.out.println(footerlink.size());
		for(int i=0;i<footerlink.size();i++)
		{
			System.out.println(footerlink.get(i).getText());
		}

	}

}
