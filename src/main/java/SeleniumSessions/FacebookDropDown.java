package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String date="16-Jun-2011";
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		/*ElementUtil element=new ElementUtil(driver);
		
		element.doselectbyvisibletext(day, date.split("-")[0]);
		element.doselectbyvisibletext(month, date.split("-")[1]);
		element.doselectbyvisibletext(year, date.split("-")[2]);*/
		
		/*Select selectday =new Select(driver.findElement(day));
		List<WebElement> dayslist=selectday.getOptions();
		
		System.out.println(dayslist.size());
		
		for(int i=0;i<dayslist.size();i++)
		{
			String text=dayslist.get(i).getText();
			System.out.println(text);
			
			if(text.equals("15")){
				dayslist.get(i).click();break;
			}
		}
		
		System.out.println("============================");*/
		
		/*Select selectmonth =new Select(driver.findElement(month));
		List<WebElement> monthlist=selectmonth.getOptions();
		
		System.out.println(monthlist.size());
		
		for(int i=0;i<monthlist.size();i++)
		{
			String text=monthlist.get(i).getText();
			System.out.println(text);
		}System.out.println("============================");
		
		Select selectyear =new Select(driver.findElement(year));
		List<WebElement> yearlist=selectyear.getOptions();
		
		System.out.println(yearlist.size());
		
		for(int i=0;i<yearlist.size();i++)
		{
			String text=yearlist.get(i).getText();
			System.out.println(text);
		}*/
		
		/*ArrayList<String> dayList=doGetDropDownOptions(driver, day);
		System.out.println(dayList.size());
		System.out.println(dayList);
		ArrayList<String> monthList=doGetDropDownOptions(driver, month);
		System.out.println(monthList.size());
		System.out.println(monthList);
		ArrayList<String> yearList=doGetDropDownOptions(driver, year);
		System.out.println(yearList.size());
		System.out.println(yearList);
		
		System.out.println("Total no of options in daylist box" +dodropdownoptioncount(driver, day));
		System.out.println("Total no of options in monthlist box" +dodropdownoptioncount(driver, month));
		System.out.println("Total no of options in yearlist box" +dodropdownoptioncount(driver, year));*/
		
		doselectdropdownvalue(driver, day, "10");
		doselectdropdownvalue(driver, month, "Dec");
		doselectdropdownvalue(driver, year, "1998");
	}
	
	public static void doselectdropdownvalue(WebDriver driver,By locator,String value){
		
		Select selectday =new Select(driver.findElement(locator));
		List<WebElement> optionslist=selectday.getOptions();
		
		//System.out.println(dayslist.size());
		
		for(int i=0;i<optionslist.size();i++)
		{
			String text=optionslist.get(i).getText();
			//System.out.println(text);
			
			if(text.equals(value)){
				optionslist.get(i).click();break;
			}
		}
	}
	
	public static int dodropdownoptioncount(WebDriver driver,By locator){
		return doGetDropDownOptions(driver, locator).size();
	}
		public static ArrayList<String> doGetDropDownOptions(WebDriver driver,By locator){
			
			ArrayList<String> ar=new ArrayList<String>();
			Select select =new Select(driver.findElement(locator));
			List<WebElement> Optionlist=select.getOptions();
			
			//System.out.println(Optionlist.size());
			
			for(int i=0;i<Optionlist.size();i++)
			{
				String text=Optionlist.get(i).getText();
				ar.add(text);
				//System.out.println(text);
			
		}return ar;
	}

}
