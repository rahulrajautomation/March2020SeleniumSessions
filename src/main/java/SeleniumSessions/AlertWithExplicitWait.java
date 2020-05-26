package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		ElementUtil eu=new ElementUtil(driver);
		By ClickforJSAlert=By.xpath("//button[(text()='Click for JS Alert')]");
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		//eu.waitForElementToBeClickable(ClickforJSAlert, 6).click();
		eu.ClickWhenReady(ClickforJSAlert, 5);
		
		Alert alert=eu.waitForAlertToBePresent(5);
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
	}

}
