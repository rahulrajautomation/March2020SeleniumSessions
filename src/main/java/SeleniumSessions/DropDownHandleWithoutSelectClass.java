package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String date="16-Jun-2011";
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		By dayoptions=By.xpath("//select[@id='day']/option");
		By monthoptions=By.xpath("//select[@id='month']/option");
		By yearoptions=By.xpath("//select[@id='year']/option");
		
		/*List<WebElement> optionslist =driver.findElements(By.xpath("//select[@id='day']/option"));
		for(int i=0;i<optionslist.size();i++)
		{
			String text=optionslist.get(i).getText();
			System.out.println(text);
			if(text.equals("23")){
				optionslist.get(i).click();break;
			}
				
		}*/
		
		/*doSelectDropDownValueWithoutSelect(driver, "//select[@id='day']/option", date.split("-")[0]);
		doSelectDropDownValueWithoutSelect(driver, "//select[@id='month']/option", date.split("-")[1]);
		doSelectDropDownValueWithoutSelect(driver, "//select[@id='year']/option", date.split("-")[2]);*/
		
		ElementUtil el=new ElementUtil(driver);
		el.doSelectDropDownValueWithoutSelect(dayoptions, date.split("-")[0]);
		el.doSelectDropDownValueWithoutSelect(monthoptions, date.split("-")[1]);
		el.doSelectDropDownValueWithoutSelect(yearoptions, date.split("-")[2]);
	}
	
	public static void doSelectDropDownValueWithoutSelect(WebDriver driver,String xpathvalue,String value)
	{
		List<WebElement> optionslist =driver.findElements(By.xpath(xpathvalue));
		for(int i=0;i<optionslist.size();i++)
		{
			String text=optionslist.get(i).getText();
			System.out.println(text);
			if(text.equals(value)){
				optionslist.get(i).click();break;
			}
				
		}
	}

}
