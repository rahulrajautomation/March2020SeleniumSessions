package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		 //System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		Thread.sleep(6000);
		driver.get("https://www.google.com");
	}

}
