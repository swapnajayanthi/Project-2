package com.jayanthi.selenium;

import java.util.List;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.gmail.com");
	
		String title = d.getTitle();
		System.out.println("the title page is:" +title);
		
		String url = d.getCurrentUrl();
		System.out.println("URL is: +url");
		
		String pagesource = d.getPageSource();
		System.out.println("pagesource is:" +pagesource);
		
		/*String WindowName = d.getWindowHandle();
		System.out.println("window name is:" +WindowName);
		
		Set<String> Window = d.getWindowHandles();
		System.out.println("windows are:" +Window.size());
		
		d.findElement(By.id("identifierId")).sendKeys("jayanthiashamolla@gmail.com");
		d.findElement(By.id("identifierNext")).click();*/
		
		/*List<WebElement> list = d.findElements(By.id("identifierId"));
		System.out.println("no of div tags are" +list.size());*/
		
		//d.close();
		
		//d.quit();
		
		 /*Navigation navigate = d.navigate();
		 navigate.to("https://www.gmail.com");
		 navigate.refresh();
		 navigate.back();
		 navigate.forward();*/
		 
		/*Options options = d.manage();
		d.manage().deleteAllCookies();*/
		 
	/*	TargetLocator target = d.switchTo();
		target.window("");*/
		 
		
		
		

	}

}
