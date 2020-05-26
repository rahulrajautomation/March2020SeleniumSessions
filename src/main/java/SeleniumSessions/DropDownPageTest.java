package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPageTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		ElementUtil eu=new ElementUtil(driver);
		
		By dropdown=By.id("dropdown");
		eu.doselectbyvisibletext(dropdown, "Option 2");
		
	}

}
