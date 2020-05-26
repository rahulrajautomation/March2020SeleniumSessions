package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.init_driver("chrome");
		br.LaunchURL("https://app.hubspot.com/");
		
		Thread.sleep(5000);
		System.out.println(br.dogetTitle());
		
		By emailid=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn123");
		By header=By.cssSelector("h1.private-page__title");
		
		ElementUtil elementU=new ElementUtil(driver);
		elementU.dosendkeys(emailid, "naveenanimation30@gmail.com");
		elementU.dosendkeys(password, "Test@1234");
		
		//driver.findElement(login).isDisplayed();
		
		if(elementU.doisdiplayed(login)){
		
		elementU.doclick(login);}
		
		Thread.sleep(5000);
		
		System.out.println("Home page header " + elementU.dogettext(header));
		
		br.doquit();
	}

}
