package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpWithList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles=driver.getWindowHandles(); 
		
		List<String> handlellist=new ArrayList<String>(handles);
		System.out.println(handlellist.size());
		String parentwindowid=handlellist.get(0);
		String childwindowid=handlellist.get(1);
		
		System.out.println(parentwindowid +" " + childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();
	}

}
