package com.jayanthi.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardDemo {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com");
		Actions a = new Actions(d);
		a.sendKeys(Keys.END).build().perform();
		a.sendKeys(Keys.HOME).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();

	}

}
