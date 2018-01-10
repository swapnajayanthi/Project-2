package com.jayanthi.listeners;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzer implements IRetryAnalyzer
{
 int retryCount=0;
 int maxRetryCount=3;
	@Override
	public boolean retry(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()&&retryCount<=maxRetryCount)
		{
			try
			{
				System.out.println("count is:" +retryCount+ " executing TC:" +result.getName());
				retryCount++;
				return true;
			}
			catch(InterruptedException Exception )
			{
				Exception.printStackTrace();
			}
			
		}
		
		return false;
	}

}
