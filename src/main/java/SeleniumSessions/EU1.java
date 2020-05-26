package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EU1 {
	
	WebDriver driver;
	
	public EU1(WebDriver driver){
		this.driver=driver;
		
	}
	
	public WebElement getElement(By locator){
		WebElement element =driver.findElement(locator);
		return element;
	}
	
	public void doSendKeys(By locator,String value){
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public void dogettext(By locator)
	{
		getElement(locator).getText();
	}

}
