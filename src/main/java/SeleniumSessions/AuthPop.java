package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		 //System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		Thread.sleep(6000);
		
		String username="admin";
		String password="admin";
		
		driver.get("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
	
	}

}
