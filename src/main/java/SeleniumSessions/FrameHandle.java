package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(5000);
		/*driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		int size=driver.findElements(By.tagName("frame")).size();
		System.out.println(size);
		//driver.switchTo().frame("main");
		//driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();// to switch back to page from frame
*/		
		
		driver.get("https://classic.crmpro.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.cssSelector(".btn-small")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[3]/a")).click();
	}

}
