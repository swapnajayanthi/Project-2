package com.jayanthi.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgTestcase1 {
	/*WebDriver d;
	@BeforeSuite
	public void browser()
	{
		System.out.println("browser launched");
		WebDriver d = new FirefoxDriver();
	}
	@AfterSuite
	public void close()
	{
		
		System.out.println("close browser");
		d.close();
	}*/
	
	@Test
	public void gmailLogin()
	{
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		d.get("https://www.gmail.com");
		System.out.println("gmail page is opened");
	}

}
