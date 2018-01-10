package com.jayanthi.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BingTest {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("https://www.bing.com/");
		//d.findElement(By.linkText("MSN")).click();
		WebElement msn = d.findElement(By.xpath("//*[text()='MSN']"));
		msn.click();
		WebDriverWait wait = new WebDriverWait(d, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='store']")));
	    d.findElement(By.xpath("//li[@class='store']"));
		
		
		

		

	}

}
