package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}

}
