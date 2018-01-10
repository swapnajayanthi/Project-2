package com.jayanthi.listeners;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.pattern.PropertiesPatternConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.mongodb.diagnostics.logging.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverUtility 
{
  private static WebDriver d;
/*  private static ExtentReports er;
  private static ExtentTest et;
  private static Logger log;*/
  
  @BeforeSuite
  public static void openBrowser(String browser)
  {
	  
		  if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Program Files selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				d = new FirefoxDriver();
				d.manage().window().maximize();
				d.manage().deleteAllCookies();
				d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files selenium\\chromedriver_win32\\chromedriver.exe");
				d = new ChromeDriver();
				d.manage().window().maximize();
				d.manage().deleteAllCookies();
				d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
		}
		public static WebDriver getDriver()
		{
			return d;
		}
		
		/*@BeforeMethod
		public void beforeMethod(Method m)
		{
			et = er.startTest(m.getName());
			
		}

		@AfterMethod
		public void afterMethod(ITestResult result) throws IOException
		{
			er.endTest(et);
			er.flush();
			if(ITestResult.FAILURE==result.getStatus())
			{
				ScreenShotUtility.screenShot(result.getName(), getDriver());
			}
		}
		
		public static ExtentTest getExtenttest()
		{
			return et;
			
		}
		@AfterSuite
		public void closeBrowser()
		{
		if(d!=null)
		{
				System.out.println("close the browser");
		}
		else
		{
			System.out.println("webdriver is null");
		}
		}*/
		/*public static void main(String[] args) {
			{
				DriverUtility du = new DriverUtility();
				du.openBrowser("chrome");
				du.closeBrowser();
			}
		}*/
}

