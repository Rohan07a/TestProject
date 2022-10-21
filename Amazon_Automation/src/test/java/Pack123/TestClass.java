package Pack123;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite-1");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest-1");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class-1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method-1");
	}
	@Test(priority=0)
	public void testA()
	{
		System.out.println("testA");
	}
	@Test(priority=1)
	public void testB()
	{
		System.out.println("testB");
	}
	@Test(priority=2)
	public void testC()
	{
		System.out.println("testC");
	}
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("after method-1");
	}
	@AfterClass()
	public void afterClass()
	{
		System.out.println("after class-1");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest-1");
	}
	@AfterSuite
	public void afterSuite()
	{
	System.out.println("afterSuite-1");
	}

}
