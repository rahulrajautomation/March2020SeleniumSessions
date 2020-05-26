package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		//id
		
		Thread.sleep(5000);
		
		// case 1:
		
		/*driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();*/
		
		// case 2:

		/*WebElement uname=driver.findElement(By.id("username"));
		WebElement pass=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		
		uname.sendKeys("abc@gmail.com");
		pass.sendKeys("test@123");
		login.click();
	*/	
		//case 3: by locators:
		
		/*By email=By.id("username");
		By pass=By.id("password");
		By login=By.id("loginBtn");
		
		WebElement email1=driver.findElement(email);
		email1.sendKeys("ttest@gmail.com");*/
		
		//case 4 : String locators
		
		/*String emailid="username";
		String pass="password";
		String login="loginBtn";
		
		By email=By.id(emailid);
		By pass1=By.id(pass);
		By login1=By.id(login);
		
		driver.findElement(email).sendKeys("test@gmail.com");
		driver.findElement(pass1).sendKeys("test@123");
		driver.findElement(login1).click();*/
		
		//2.name
		//driver.findElement(By.name("username")).sendKeys("test@gmail.com ");
		
		//3.classname

		/*driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		driver.findElement(By.className("login-password")).sendKeys("test@123");
		*/
		//4. xpath- is the address of the element in HTML DOM but its not an attribute

		/*driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");;
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
		*/
		
		//5. css Selector- its not the attribute

		/*driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
		
		//linktext - only for links
		
		driver.findElement(By.linkText("Sign up")).click();*/
		
		//partiallinktext= only for links
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		String str=driver.findElement(By.tagName("h1")).getText();
		System.out.println(str);
		
		String st2=driver.findElement(By.linkText("Platform")).getText();
		System.out.println(st2);
		
		

	}

}
