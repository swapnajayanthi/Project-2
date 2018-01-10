package com.jayanthi.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		d.get("https://www.amazon.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement departments = d.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-single-row-link']"));
		
		Actions a = new Actions(d);
		a.moveToElement(departments);
		a.build().perform();
		System.out.println("departments is selected");
		
		
		
		WebElement amazonvideo = d.findElement(By.xpath("//span[@aria-label='Amazon Video']"));
		
		Actions a1 = new Actions(d);
		a1.moveToElement(amazonvideo);
		a1.build().perform();
		System.out.println("amazon is selected");
		
		

	}
}
