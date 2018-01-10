package com.jayanthi.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement googlesearch= d.findElement(By.cssSelector("input[id='lst-ib']"));
		
		Actions a = new Actions(d);
		a.sendKeys(googlesearch, "paytm.com");
		a.build().perform();
		
		d.findElement(By.cssSelector("div[id='sbse0']")).click();
		System.out.println("paytm clicked");
		
		WebElement link = d.findElement(By.xpath("//a[text()='Paytm.com – Digital & Utility Payment, Entertainment, Travel, Payment ...']"));
		link.click();
		System.out.println("link is opened");
		
		List<WebElement> headers = d.findElements(By.xpath("//*[@class='_3CX4']"));
		System.out.println("headers size is:" +headers.size());
		
		
		Thread.sleep(4000);
		ListIterator<WebElement> mobile = headers.listIterator();
		while(mobile.hasNext())
		{
			WebElement ele = mobile.next();
			String s = ele.getText();
			System.out.println(s);
		}
		
	}

}
