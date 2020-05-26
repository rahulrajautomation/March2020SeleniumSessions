package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopAssign {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> handles=driver.getWindowHandles(); 
		Iterator<String> it=handles.iterator();
		String parentwindowid=it.next();
		System.out.println("parent window id is " +parentwindowid);
		String childwindowid1=it.next();
		System.out.println("child window id 1 is " +childwindowid1);
		String childwindowid2=it.next();
		System.out.println("child window id 2 is " +childwindowid2);
		
		driver.switchTo().window(childwindowid1);
		
		System.out.println("child window1 title" +driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childwindowid2);
		
		System.out.println("child window2 title" +driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowid);
		System.out.println("parent title" +driver.getTitle());
		
	}

}
