package com.jayanthi.utilities.selenium;

public class Facebook {
public void login()
{
	DriverUtility du = new DriverUtility();
	du.getWebDriver().get("https://www.facebook.com");
}
}
