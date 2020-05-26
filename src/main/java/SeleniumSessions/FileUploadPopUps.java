package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUps {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("D:\\ee.png");
	}
	}


