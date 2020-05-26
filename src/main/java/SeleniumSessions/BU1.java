package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BU1 {

	WebDriver driver;
	
	public WebDriver initbrowse(String browser)
	{
		switch (browser) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			break;
		case "firefox":
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			break;
		case "safari":
	
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
	
			break;
	

		default:
			System.out.println(browser + "browser not found");
			break;
		} return driver;
	}
	
	public void launchURL(String url)
	{
		driver.get(url);
	}
	
	public String dogettitle(){
		String s=driver.getTitle();
		return s;
	}
	
}
