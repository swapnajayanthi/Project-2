package com.jayanthi.testng;

import org.testng.annotations.Test;

public class DependsOnGroupsDemo {
	@Test (groups={"group1"})
	public void TestPrintWelcomeMessage()
	{
	System.out.println("welcome to rameshsoft");	
	}
	@Test  (dependsOnGroups={"group1.*"})
	public void testMessage()
	{
		System.out.println("Masters in java with selenium");
	}
	@Test(groups={"goup1"})
	public void TestLocation()
	{
		System.out.println("at hyderabad");
	}

}
