package com.jayanthi.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationsDemo {
	
	@Test
	public void testCase1()
	{
		System.out.println("this is the testcase1");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("this is the testcase2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this will execute before every method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this will execute after every method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this will execute before the class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("this will execute after the class");
	}
	
	@BeforeTest
	
	public void beforeTest()
	{
		System.out.println("this will execute before the test");
	}
	
	@AfterTest
	
	public void afterTest()
	{
		System.out.println("this will execute after test");
	}
	
	@BeforeSuite
	
	public void beforeSuite()
	{
		System.out.println("this will execute before the test suite");
	}
	
	@AfterSuite
	
	public void afterSuite()
	{
		System.out.println("this will execut after the test suite");
	}
	
	

}
