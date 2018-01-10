package com.jayanthi.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgTestcase2 {
	@Test
	public void fbLogin()
	{
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		d.get("https://www.facebook.com");
		System.out.println("facebook page is opened");
	}

}
