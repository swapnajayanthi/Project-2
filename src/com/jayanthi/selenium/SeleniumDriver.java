package com.jayanthi.selenium;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new FirefoxDriver();
		d.get("https://www.google.com");
		WebElement search = d.findElement(By.cssSelector("input[class='gsfi']"));
		Actions a = new Actions(d);
		a.sendKeys("selenium webdriver by ramesh anapati");
		a.build().perform();
		
		WebElement googlesearch = d.findElement(By.cssSelector("input[value='Google Search']"));
		googlesearch.click();
		
		WebElement link = d.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati"));
		link.click();
		
	    Thread.sleep(4000);
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println("links size is:" +links.size());
		
		ListIterator<WebElement> list = links.listIterator();
		int  count=0;
		int count1=0;
		while(list.hasNext())
		{
			WebElement ele = list.next();
			
			if(ele.isEnabled() && ele.isDisplayed())
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("enabled links are:" +count);
		System.out.println("disabled links are:" +count1);
		

	}

}
