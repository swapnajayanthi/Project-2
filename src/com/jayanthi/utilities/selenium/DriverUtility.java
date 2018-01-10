package com.jayanthi.utilities.selenium;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility {
	
	private static WebDriver driver;
	public void openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files selenium\\chromedriver_win32.chrome.driver");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
	else if (browser.equalsIgnoreCase("ie")) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Program Files selenium\\IEDriverServer_x64_3.7.0.IEDriverServer.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
	}
	public static WebDriver getWebDriver()
	{
		return driver;
	}
		public void closeBrowser()
		{
			if(driver!=null)
			{
				driver.close();
				System.out.println("driver closed");
			}
			else
			{
				System.out.println("driver not closed");
				
			}
	}
   public static void main(String[] args) {
	DriverUtility du = new DriverUtility();
	du.openBrowser("firefox");
	du.closeBrowser();
}
}
