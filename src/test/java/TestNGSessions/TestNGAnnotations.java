package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	
	public void connectWithDB()
	{
		System.out.println("connect With DB");
	}
	
	@BeforeTest
	public void createUser()
	{
		System.out.println("Create User");
	}
	
	@BeforeClass
	
	public void launchBrowser()
	{System.out.println("Launch Browser");
		
	}
	@BeforeMethod
	
	public void logInApp()
	{
		System.out.println("Login to  app");
	}

	@Test
	
	public void verifyTitleTest()
	{
		System.out.println("verifyTitleTest");
	}
	@Test
	
	public void verifyLoggedInUser()
	{
		System.out.println("verifyLoggedInUser");
	}
	
	@AfterMethod
	
	public void logOut(){
		System.out.println("Log out");
	}
	
	@AfterClass
	
	public void closeBrowser(){
		System.out.println("Close the browser");

	}
	@AfterTest
	public void deleteUser(){
		System.out.println("Delete the user");
	}
	@AfterSuite
	
	public void disconnectDB(){
		
		System.out.println("Disconnect DB");
	}
}
