package com.jayanthi.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="SetData")
	public void gmailLogin(String username, String password)
	{
		System.out.println("username is:"+username);
		
		System.out.println("password is:"+password);
	}
	@DataProvider
	public Object[][] setdata()
	{
	Object[][] object = new Object[2][2];
	object[0][0] = "jayanthiashamolla@gmail.com";
    object[0][1] = "abc123";
    object[1][0] = "swathiashamolla@gmail.com";
    object[1][1] = "bgkgk";
    return object;
		
	}

}
