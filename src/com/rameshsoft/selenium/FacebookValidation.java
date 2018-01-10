package com.rameshsoft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.DeleteAllVisibleCookies;

public class FacebookValidation {

	public static void main(String[] args) {
		String name = "jayanthiashamolla@gmail.com";
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.facebook.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement email = d.findElement(By.id("email"));          
		String beforeValue = email.getAttribute("value");
		System.out.println("before DTA:" +beforeValue);
		email.sendKeys("jayanthiashamolla@gmail.com");
		
		String afterValue = email.getAttribute("value");
		System.out.println("after DTA:"+"...."+afterValue);
		
		if(afterValue.equalsIgnoreCase(name))
		{
			System.out.println("data typing action is performed");
		}
		else
		{
			System.out.println("not performed any data typing action");
		}
		
 
	}

}
		
		

