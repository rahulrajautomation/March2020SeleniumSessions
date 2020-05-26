package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	// If no priority given, it will execute in alphabetical fashion.
	// If priority given, it will be executed as per the priority
	// If 2 priority is same for e.g for two different test cases the priority is same then it will check the alphabetical order in this case.
	// priority can be zero or in negative, in that case the negative number will be given higher priority
	// If few test have priority and few have not, in that case the non priority ones will be executed first.
	
	@Test(priority=1)
	
	public void Test1()
	{
		System.out.println("This is Test 1");
	}
	@Test(priority=4)
	
	public void Test2()
	{
		System.out.println("This is Test 2");
	}
	@Test(priority=2)

	public void Test3()
{
	System.out.println("This is Test 3");
}
	@Test(priority=5)

	public void Test4()
{
	System.out.println("This is Test 4");
}
	@Test(priority=3)

public void Test5()
{
	System.out.println("This is Test 5");
}
}
