package com.jayanthi.listeners;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotDemo {
	WebDriver d;
	public void screenShot(String imageName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)d;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\screenshots"+imageName+".jpeg"));
	}
	@Test
public void gmailLogin()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files selenium\\chromedriver_win32\\chromedriver.exe");
    d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	d.get("https://www.gmail.com");
	d.findElement(By.id("IdentifierI")).sendKeys("jayanthiashamolla@gmail.com");
}
	
	@BeforeMethod
	public void beforeMethod(Method m)
	{
		System.out.println("executing the testcase:"+ m.getName());

	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			screenShot(result.getName());
		}
	}
	
}