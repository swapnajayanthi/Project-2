package com.jayanthi.testng;

import org.testng.annotations.Test;

public class GroupsDemo2 {
	
	@Test(groups={"ST", "RT"})
	public void m4()
	{
		System.out.println("m4() ST and RT");
	}
	@Test(groups="ST")
	public void m5()
	{
		System.out.println("m5() ST");
	}
	@Test(groups="RT")
	public void m6()
	{
		System.out.println("m6() RT");
	}
}
