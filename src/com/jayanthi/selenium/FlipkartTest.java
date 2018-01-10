package com.jayanthi.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTest {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		d.get("https://www.flipkart.com");
		d.findElement(By.xpath("//button[text()='✕']")).click();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement electronics = d.findElement(By.xpath("//a[@title='Electronics']"));
		
		WebDriverWait  wait = new WebDriverWait(d, 100);
		wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.xpath("//a[@title='Electronics']"))));
		
		Actions a = new Actions(d);
		a.moveToElement(electronics).build().perform();
		System.out.println("eletronics is selected");
		
		
		WebElement  mobiles = d.findElement(By.xpath("//*[text()='Mobiles']"));
		mobiles.click();
		System.out.println("mobiles button is clicked");
		
		WebElement min = d.findElement(By.xpath("//select[@class='a_eCSK']"));
		
		Select s = new Select(min);
		s.selectByValue("4000");
		System.out.println("min price entered");
		
		WebElement max = d.findElement(By.xpath("//div[@class='_2yCtb1']/div[@class='_3nSxeA']/select[@class='a_eCSK']"));
		
	    Select s1 = new Select(max);
	    s1.selectByVisibleText("16000");
		System.out.println("max price entered");
		
		
		
		
		
		
		 
		
	}

}
