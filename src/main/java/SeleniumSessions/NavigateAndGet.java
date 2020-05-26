package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGet {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.in");
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().to("https://www.rediff.com");
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().forward(); 
		
		driver.navigate().refresh();
		
	}

}
