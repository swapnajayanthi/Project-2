package com.jayanthi.testng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CloveItTest {
	public static void main(String[] args) {
	
	String s ="cloveabcclovehelloclovewelcomefreshers";
	int count=0;
	 
		Pattern p = Pattern.compile("clove");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			
			count++;
		}
			System.out.println("count is:"+count);
		
	}
}
