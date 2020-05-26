package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		//In select class we have to pass Webelement while in Actions class we have to pass driver.
		
		//action.dragAndDrop(src, des).build().perform();
		
		action.clickAndHold(src).moveToElement(des).release().build().perform();;

		
	}
	


}
