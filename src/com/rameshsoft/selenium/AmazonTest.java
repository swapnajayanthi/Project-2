package com.rameshsoft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement search = d.findElement(By.cssSelector("input[id='lst-ib']"));
		Actions a = new Actions(d);
		a.sendKeys(search, "www.flipkart.com").build().perform();
		WebElement googlesearch = d.findElement(By.cssSelector("input[value='Google Search']"));
		a.click(googlesearch).build().perform();
		
		
	}

}
