package com.jayanthi.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemoOne {
	
	WebDriver driver;
	
	@BeforeSuite
	public void browseropen()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	@Test
	public void main()
	{
		driver.get("https://www.flipkart.com");
		System.out.println("flipkart open");
	}

}
