package com.jayanthi.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverUtility {
	private String browser;
	WebDriver webdriver;
	@BeforeSuite
public void OpenBrowser(String browser)
{
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();
		webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\geckodriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();
		webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
public WebDriver getDriver()
{
	return webdriver;
}

@AfterSuite
public void closeBrowser()
{
if(webdriver!=null)
{
		System.out.println("close the browser");
}
else
{
	System.out.println("webdriver is null");
}
}
public static void main(String[] args) {
	{
		DriverUtility du = new DriverUtility();
		du.OpenBrowser("firefox");
		du.closeBrowser();
	}
}

}
