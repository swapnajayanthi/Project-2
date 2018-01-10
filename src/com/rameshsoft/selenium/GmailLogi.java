package com.rameshsoft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogi {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com");
		d.findElement(By.id("identifierId")).sendKeys("jayanthiashamolla@gmail.com");
		d.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(2000);
	
		d.findElement(By.name("password")).sendKeys("abc123");
		d.findElement(By.id("passwordNext")).click();
		
	
		Thread.sleep(2000);
		d.close();
	}
}
