package com.jayanthi.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo2
{
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
	@Test(priority=2, enabled=true)
	public void amain()
	{
		driver.get("https://www.facebook.com");
		System.out.println("facebook open");
	}
	@Test(priority=1)

	public void bmain()
	{
		driver.get("https://www.gmail.com");
		System.out.println("gmail");
	}
	@Test(priority=0, enabled=false)

	public void cmain()
	{
		driver.get("https://www.amazon.com");
		System.out.println("amzon");
	}

}

