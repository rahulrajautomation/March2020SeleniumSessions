package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lip {

	public static void main(String[] args) throws InterruptedException {

		BU br=new BU();
		WebDriver driver=br.init_driver("chrome");
		br.launchURL("http://www.google.com");
		br.navigateto("https://app.hubspot.com/");
		
		Thread.sleep(5000);
		String s=br.dogettitle();
		System.out.println(s);
		
		Thread.sleep(5000);
		
		By emailid=By.id("username");
		By pass=By.id("password");
		By login=By.id("loginBtn");
		By header=By.cssSelector("h1.private-page__title");

		
		EU elem=new EU(driver);
		elem.dosendkeys(emailid, "naveenanimation30@gmail.com");
		elem.dosendkeys(pass, "Test@1234");
		elem.doclick(login);
		
		String ss=elem.dogettext(header);	
		System.out.println(ss);
		br.doquit();
	}

}
