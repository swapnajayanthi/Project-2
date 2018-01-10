package com.jayanthi.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelSuiteDemo {
	String testName=" ";
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("initializing suite");
	}
@BeforeTest
@Parameters({"testName"})
public void beforeTest(String testName)
{
	this.testName = testName;
	long id = Thread.currentThread().getId();
	System.out.println("before test"+testName+"thread id is:"+id);
}
@BeforeClass
public void beforeClass()
{
	long id = Thread.currentThread().getId();
	System.out.println("before test class"+testName+"thread id is:"+id);
}
@Test
public void testMethodOne()
{
	long id = Thread.currentThread().getId();
	System.out.println("test method1"+testName+"thread id is:"+id);
}
@AfterClass
public void afterClass()
{
	long id = Thread.currentThread().getId();
	System.out.println("afterclass"+testName+"thread id is:"+id);
}
@AfterTest
public void afterTest()
{
	long id = Thread.currentThread().getId();
	System.out.println("aftertest"+testName+"thread id is:"+id);
}


}
