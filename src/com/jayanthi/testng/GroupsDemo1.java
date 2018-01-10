package com.jayanthi.testng;

import org.testng.annotations.Test;

public class GroupsDemo1 {
	@Test(groups="RT")
	public void m1()
	{
		System.out.println("m1() RT");
	}
	
	@Test(groups="RT")
	public void m2()
	{
		System.out.println("m2() RT");
	}
	
	@Test(groups="ST")
	public void m3()
	{
		System.out.println("m3() ST");
	}

}
