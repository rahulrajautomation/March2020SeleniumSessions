package TestNGSessions;

import org.testng.annotations.Test;

public class DisableTest {

@Test()
	
	public void Test1()
	{
		System.out.println("This is Test 1");
	}
	@Test(enabled=false)
	
	public void Test2()
	{
		System.out.println("This is Test 2");
	}
	@Test(enabled=false)

	public void Test3()
{
	System.out.println("This is Test 3");
}
	@Test()

	public void Test4()
{
	System.out.println("This is Test 4");
}
	@Test()

public void Test5()
{
	System.out.println("This is Test 5");
}

}
