package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCascade {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(4000);
		driver.findElement(By.id("justAnInputBox1")).click();	
		//selectCascadeParentChoice(driver, "choice 2");
		selectCascadeChildChoice(driver, "choice 2 3","choice 6 1");
	}
public static void selectCascadeParentChoice(WebDriver driver,String value){
		
		List<WebElement> choiceList =driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		System.out.println(choiceList.size());
		
		for(int i=0;i<choiceList.size();i++)
		{
			String st=choiceList.get(i).getText();
			if(st.equals(value)){
				choiceList.get(i).click();
			}}}
public static void selectCascadeChildChoice(WebDriver driver,String... value){
	
	List<WebElement> choiceList =driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

	if(! value[0].equalsIgnoreCase("all")){
		
		for(int i=0;i<choiceList.size();i++){
			String st=choiceList.get(i).getText();
			System.out.println(st);
			for(int k=0;k<value.length;k++)
			{if(st.equals(value[k])){
				choiceList.get(i).click();break;}
				
				
			}
		}

}
}
}
