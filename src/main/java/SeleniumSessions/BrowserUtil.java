package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	WebDriver driver;
	
	/**
	 * this method is used to initialize the driver on basis of browser name
	 * @param browsername
	 * @return driver
	 */
	
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
			
			System.out.println(browsername + "is not found");
			break;
		}
		return driver;
		
	}
	
	public void LaunchURL(String URL)
	{
		driver.get(URL);
	}
	
	public void navigatetoUrl(String URL){
		driver.navigate().to(URL);
	}
	
	public String dogetTitle(){
		return driver.getTitle();
	}
	
	public void doquit()
	{
		driver.quit();
	}

}
