package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertJS {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
	System.out.println(alert.getText());
	
	alert.accept();
	driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
	Thread.sleep(5000);
	
	Alert alert1=driver.switchTo().alert();
	
System.out.println(alert1.getText());

alert1.dismiss();

driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
Thread.sleep(5000);

Alert alert2=driver.switchTo().alert();

System.out.println(alert2.getText());

alert2.sendKeys("1234");;
alert2.accept();

		
	}

}
