package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lip1 {

	public static void main(String[] args) {

		BU1 obj=new BU1();
		WebDriver driver=obj.initbrowse("firefox");
		obj.launchURL("http://thedemosite.co.uk/login.php");
		System.out.println(obj.dogettitle());
		
		By un=By.name("username");
		By pass=By.name("password");
		By login=By.name("FormsButton2");
		
		EU1 obj1=new EU1(driver);
		obj1.doSendKeys(un, "test");
		obj1.doSendKeys(pass, "test");
		obj1.doClick(login);
	}

}
