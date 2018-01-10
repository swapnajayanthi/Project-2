package com.jayanthi.selenium;

public class SingleTonTest {
	private static SingleTonTest test = null;
	private SingleTonTest()
	{
		System.out.println("private constructor");
	}
	public static SingleTonTest getSingleTonTest()
	{
		if(test==null)
		{
			test = new SingleTonTest();
		}
		return test;
		
	}
   public static void main(String[] args) {
	SingleTonTest s1 = SingleTonTest.getSingleTonTest();
	System.out.println("s1"+s1.hashCode());
	
	SingleTonTest s2 = SingleTonTest.getSingleTonTest();
	System.out.println("s2"+s2.hashCode());
	
	SingleTonTest s3 = SingleTonTest.getSingleTonTest();
	System.out.println("s3"+s3.hashCode());
	
}

}
