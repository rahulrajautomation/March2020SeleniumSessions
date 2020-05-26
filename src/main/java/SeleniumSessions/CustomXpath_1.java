package SeleniumSessions;

public class CustomXpath_1 {

	public static void main(String[] args) {

		//input[@data-testid='royal_email']
		//input[@data-testid='royal_email' and @type='email']
		//input[@id='email' and @type='email']
		// (//input[@id])[1] - with index
		// (//input[@id])[position()=2]
		//*[@name='username']
		
		//div//input[@id='username'] - Direct child+ indirect child elemnts
		//div/input[@id='username'] - Direct child
		// (//ul[@class='footer-nav'])[2]/li
		//div[@class='col-sm-6']//ul[@class='footer-nav']/li
		//div[@class='col-sm-6']/p
		//ul[@class='l-nav-list nav-main-menu']/li/span[@class='nav-label']
		//ul[@class='l-nav-list nav-main-menu']/li/a
		//i18n-string[@data-key='login.signupLink.cta']
		
		// text() in xpath for links,span and labels
		//i18n-string[text()='Sign up']
		//a[text()='Sign up']

		//h3[text()='Contact Management']
		
		//starts-with() function in xpath
		
		//input[starts-with(@id,'user')]
		
		//contains():
		
		//input[contains(@id,'name')]
		
		//a[contains(text(),'Pricing')]
		
		//input[@id='username' and contains(@type,'email')]
		
		
	}

}
