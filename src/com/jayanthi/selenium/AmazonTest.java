package com.jayanthi.selenium;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement search = d.findElement(By.xpath("//input[@id='lst-ib']"));
		 Actions a = new Actions(d);
		 a.sendKeys("www.amazon.com").build().perform();
		 
		 d.findElement(By.xpath("//div[@class='sbqs_c']")).click();
		
		WebElement googlesearch =  d.findElement(By.xpath("//input[@value='Google Search']"));
		a.click(googlesearch);
		System.out.println("amazon opened");
		
		WebElement link = d.findElement(By.xpath("//a[text()='Amazon.com: Online Shopping for Electronics, Apparel, Computers ...']"));
		link.click();
		System.out.println("link is opened");
		
		WebElement departments = d.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		Actions a1 = new Actions(d);
		a1.moveToElement(departments);
		a1.build().perform();
		System.out.println("departments opened");
		
		Thread.sleep(4000);
		List<WebElement> headers = d.findElements(By.xpath("//*[@class='nav-text']"));
		System.out.println("headers size is:" +headers.size());
		
		ListIterator<WebElement> amazonvideo = headers.listIterator();
			while(amazonvideo.hasNext())
			{
				WebElement e = amazonvideo.next();
				String s = e.getText();
				System.out.println(s);
		}
		
		WebElement amazonvedio1 = d.findElement(By.xpath("//*[text()='Amazon Video']"));
		a1.moveToElement(amazonvedio1).build().perform();
		System.out.println("amazon vedio selected");	

	}

}
