package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BU {
	
	WebDriver driver;
	
	public WebDriver init_driver(String browsername)
	{
		switch (browsername) {
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
			
			System.out.println(browsername +" is not found");
			break;
		}
		return driver;
	}
	
	public void launchURL(String url)
	{
		driver.get(url);;
	}
	
	public void navigateto(String url)
	{
		driver.navigate().to(url);
	}
	
	public String dogettitle(){
		String title=driver.getTitle();
		return title;
	}
	
	public void doquit(){
		driver.quit();
	}

}
