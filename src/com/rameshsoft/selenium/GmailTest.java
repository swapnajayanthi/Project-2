package com.rameshsoft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.gmail.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("swapna");
		
		WebDriverWait wait = new WebDriverWait(d, 180);
		wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.xpath("//input[@id='identifierId']"))));
		
		
		d.findElement(By.xpath("//div[@id='identifierNext']")).click();
		//Thread.sleep(3000);
		d.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("abc123");
		//WebDriverWait wait = new WebDriverWait(d, 180);
		wait.until(ExpectedConditions.visibilityOf(d.findElement(By.xpath("//input[@aria-label='Enter your password']"))));

		//Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		//d.findElement(By.xpath("//div[@role='button']/")).click();
		//d.findElement(By.id("passwordNext")).click();
		//Thread.sleep(2000);
		//d.close();

	}

}
