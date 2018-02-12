package TestNgTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@Test(groups="Regression", priority=1)
	public void test()
	{
		System.out.println("@Test");
	}
	
	@Test(groups="Smoke", priority=3)
	public void test2()
	{
		System.out.println("@Test2");
	}
	
	@Test(groups="Regression", priority=2)
	public void test3()
	{
		System.out.println("@Test3");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@BeforeGroups(groups="Regression")
	public void beforeGroups()
	{
		System.out.println("@BeforeGroups");
	}
	@BeforeGroups(groups = "Smoke")
	public void beforeGroups2()
	{
		System.out.println("@BeforeGroups2");
	}
	

}
