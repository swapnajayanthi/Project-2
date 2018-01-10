package com.lambdaexpr.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Function;

public class FunctionTest {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.gmail.com");
		WebElement element = d.findElement(By.id("identifierId"));
		
		Function<String, Integer> f1 = s->{int c = s.length(); return c;};
		int s = f1.apply("java with selenium");
		System.out.println(s);
		
		Function<WebElement, Boolean> f2 = (e)->{boolean b = true;
		if (e.isDisplayed() && e.isEnabled()) 
		{
			b = true;
			
		}
		else
		{
			b = false;
		}
		return b;};
		if(f2.apply(element))
		{
			element.sendKeys("jayanthi123");
		}
		
				
		}
		
	}


