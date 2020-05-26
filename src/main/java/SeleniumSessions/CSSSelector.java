package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		// #username
		//input#username
		//.login-email
		// input.login-email - using 1 class(class should be unique)
		//.form-control.private-form__control.login-email -using multiple class(remove space and put a dot)
		//.c1.c2.c3
		// input.login-email#username - we can mix id and user name
		//input#username.login-email
		// input.form-control.private-form__control.login-email#username
		
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("naveen");
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("naveen");
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("naveen");
		
		// //input[@id='username'] - XPath
		// input[id='username'] - CSS
		
		// input[id='username'][type='email'] - Multiple property for CSS
		
		//input[id='username'][type='email'][tabindex='1']
		
		//input[id][type][tabindex] - without property values
		
		//------------ From parent to child traversing in CSS-------------
		
		// div.private-form__input-wrapper > input#username
		
		// div > input#username 
		//div  input#username - just provide space after parent
		
		//ul.nav.navbar-nav.navbar-right  li a
		//ul.nav.navbar-nav.navbar-right > li > a
		
		//--contains() in CSS
		
		//input[id*='user']
		//input[id*='name']

		//--Starts with in CSS
		
		//input[id^='user']
		
		//--Ends with in CSS
		
		//input[id$='name']
		
		//---comma in CSS----
		
		// input#username,input#password
		//input#username,input#password,button#loginBtn
		//input#username,input#password,#loginBtn
		
		List<WebElement> li=driver.findElements(By.cssSelector("input#username,input#password,#loginBtn"));
		System.out.println(li.size());
		
		// ---------Indexing in CSS - nth of type-------
		
		//ul.nav.navbar-nav.navbar-right  li:nth-of-type(1) - 1st of all
		//ul.nav.navbar-nav.navbar-right  li:nth-of-type(n) - will give all the elements
		//ul li:nth-of-type(4)
		
		//-- Following Sibling concept in CSS--------
		
		//div.private-form__input-wrapper+div  - Following sibling by using + operator
		
		//---Not Operator in CSS--------
		
		//input.form-control.private-form__control:not(.login-password)
		//input.form-control.private-form__control:not(#password)
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
