package com.jayanthi.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickTest {
	
   @Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
		Thread.sleep(4000);
		d.findElement(By.name("btnK")).submit();
		Thread.sleep(4000);
		WebElement sele = d.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati"));
		Actions a = new Actions(d);
		a.contextClick(sele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	}

}
