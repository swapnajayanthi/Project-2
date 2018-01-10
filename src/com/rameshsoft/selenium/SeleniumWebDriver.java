package com.rameshsoft.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWebDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
     WebElement search = d.findElement(By.xpath("//input[@id='lst-ib']"));
     Actions a = new Actions(d);
     a.sendKeys(search,"search by selenium webdriver by ramesh anapati").build().perform();
     
    /* Actions a1 = new Actions(d);
     a1.sendKeys("search by selenium webdriver by ramesh anapati").build().perform();*/
     
     /*search.sendKeys("search by selenium webdriver by ramesh anapati");
     search.click();*/
     
     
     WebElement googlesearch = d.findElement(By.xpath("//input[@value='Google Search']"));
     googlesearch.click();
     
     WebElement link = d.findElement(By.xpath("//a[text()='Selenium : Selenium WebDriver By Ramesh Anapati']"));
     
     link.click();
     Thread.sleep(2000);
     List<WebElement> links = d.findElements(By.tagName("a"));
     System.out.println("links size is:" +links.size());
     
     
   // ListIterator<WebElement> list = links.listIterator();
    Iterator<WebElement> list = links.listIterator();
    int count=0;
    int count1=0;
    while(list.hasNext())
    {
    	WebElement ele = list.next();
    	String s = ele.getText();
    
    	if(ele.isDisplayed() && ele.isEnabled())
    	{
    		count++;
    		
    	}
    	
    	else
    	{
    		count1++;
    		
    	}
    }
    	System.out.println("enabled links:"+count);
    	System.out.println("disabled links:"+count1);
    	 
    }
   
   
 }


