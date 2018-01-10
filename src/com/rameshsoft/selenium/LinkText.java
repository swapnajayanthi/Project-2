package com.rameshsoft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LinkText {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("https://www.bing.com/");
		//d.findElement(By.linkText("MSN")).click();
		d.findElement(By.xpath("//*[text()='MSN']")).click();
		
		//d.findElement(By.partialLinkText("outlook.com")).click();
	}

}
