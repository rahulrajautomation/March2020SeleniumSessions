package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String Browser="chrome";
		WebDriver driver=null;
		
		if(Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			}
		else if(Browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\geckodriver.exe");

			driver=new FirefoxDriver();
			}
		else if(Browser.equals("safari"))
		{
			driver=new SafariDriver();
			}
driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//Verification point- Checkpoint
		if(title.equals("Google"))
		{
			System.out.println("Correct URL");
		}else{
			System.out.println("Incorrect URL");
		}
		
		System.out.println(driver.getCurrentUrl());
	
	}

}
