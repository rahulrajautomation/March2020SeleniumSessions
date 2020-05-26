package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDFacebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		
		/*List<WebElement> monthoptions=driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> dayoptions=driver.findElements(By.xpath("//select[@id='day']/option"));
		By monthOptions=By.xpath("//select[@id='day']/option");
		By yearOptions=By.xpath("//select[@id='day']/option");*/
		
		String date="27-May-2020";
		
		selectdropdownwithoutselect(driver, "//select[@id='day']/option", date.split("-")[0]);
		selectdropdownwithoutselect(driver, "//select[@id='month']/option", date.split("-")[1]);
		selectdropdownwithoutselect(driver, "//select[@id='year']/option", date.split("-")[2]);
		
	}
	
	public static void selectdropdownwithoutselect(WebDriver driver,String xpathvalue,String value){
List<WebElement> dayoptions=driver.findElements(By.xpath(xpathvalue));
		
		for(int i=0;i<dayoptions.size();i++)
		{
			String text=dayoptions.get(i).getText();
			System.out.println(text);
			if(text.equals(value)){
				dayoptions.get(i).click();break;
			}
		}
			
	}

}
