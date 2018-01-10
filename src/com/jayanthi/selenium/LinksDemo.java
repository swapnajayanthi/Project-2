package com.jayanthi.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//search selenium webdriver by ramesh
		WebElement search = d.findElement(By.xpath("//input[@id='lst-ib']"));
		Actions a = new Actions(d);
		a.sendKeys(search, "selenium webdriver by ramesh").build().perform();
		
		Thread.sleep(4000);
		WebElement googlesearch = d.findElement(By.xpath("//input[@value='Google Search']"));
		a.click(googlesearch).build().perform();
		//go to the link
		WebElement link = d.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati"));
		link.click();
		System.out.println("link is clicked");
		//link size
		List<WebElement> links = d.findElements(By.tagName("a"));
		int totallinks = links.size();
		int disabledlinks=0;
		int enabledlinks=0;
		System.out.println("total no.of links are:" +totallinks);
		
		Thread.sleep(3000);
		Iterator<WebElement> i = links.iterator();
		while(i.hasNext())
		{
			WebElement link1 = i.next();
			if(link1.isDisplayed() && link1.isEnabled())
			{
				disabledlinks++;
			}
			else
			{
				enabledlinks++;
			}
		}
			System.out.println("disabled links are:"+disabledlinks);
			System.out.println("enabled links are:"+enabledlinks);
			
			int total  = disabledlinks + enabledlinks;
			if(total==totallinks)
			{
				System.out.println("count is matching");
			}
			else
			{
				System.out.println("count is not matcing");
			}
		}
		
	
	}


