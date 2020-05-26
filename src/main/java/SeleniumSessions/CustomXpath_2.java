package SeleniumSessions;

public class CustomXpath_2 {

	public static void main(String[] args) {

		// Last Function:
		// (//ul[@class='footer-nav'])[last()]
		// (//ul[@class='nav navbar-nav navbar-right']/li)[last()]
		// (//ul[@class='footer-nav'])[last()-1]	
		// div[@class='input-group']//following::input
		// (//div[@class='input-group']//following::input)[last()]
		//input[@name='username']//preceding::div - it will go to the highest preceding div
		//input[@name='username']//parent::div - it will go to immediate parent
		//input[@name='username']//parent::div//parent::form
		//input[@name='username']//parent::div//parent::form//input[@name='password']
		//input[@name='username']/.. - will go to the immediate parent.
		//input[@name='username']/../..	
		//div[@class='input-group']//ancestor::div =highest div-grandparent
		
		//Web Tables:= https://datatables.net/extensions/select/examples/initialisation/checkbox.html
		
		//td[text()='Brenden Wagner']//parent::td//preceding-sibling::td
		//td[text()='Brenden Wagner']//parent::td//following-sibling::td
		
		
				
	}

}
