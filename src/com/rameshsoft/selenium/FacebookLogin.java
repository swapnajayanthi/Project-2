package com.rameshsoft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");
		WebElement userName = d.findElement(By.id("email"));
		userName.clear();
		userName.sendKeys("jayanthiashamolla@gmail.com");
		/*WebElement pwd = d.findElement(By.name("pass"));
		pwd.clear();
		pwd.sendKeys("abc123");
		Thread.sleep(2000);
		WebElement login = d.findElement(By.id("u_0_5"));
		login.click();
		Thread.sleep(2000);*/
	
		WebElement firstName = d.findElement(By.id("u_0_g"));
		firstName.clear();
		firstName.sendKeys("swathi");
		d.findElement(By.name("lastname")).sendKeys("ashamolla");
		
		d.findElement(By.name("reg_email__")).sendKeys("8801266282");
		d.findElement(By.name("reg_passwd__")).sendKeys("sairam");
	    d.findElement(By.id("u_0_y")).click();
	    
	    
	    
	    /*d.get("https://www.facebook.com/");
	    d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement userName = d.findElement(By.xpath("//input[@name='email']"));
		userName.clear();
		userName.sendKeys("jayanthiashamolla@gmail.com");
	    WebElement pwd = d.findElement(By.xpath("//input[@name='pass']"));
		pwd.clear();
		pwd.sendKeys("abc123");
		Thread.sleep(2000);
		WebElement login = d.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		Thread.sleep(2000);
	
		WebElement firstName = d.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		firstName.clear();
		firstName.sendKeys("swapna");
		
		d.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("ashamolla");
		//d.findElement(By.xpath("//input[@type='text']")).sendKeys("8801266282"); ---> type-- multiple
			
		d.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("8801266282");
		d.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("sairam");
		//d.findElement(By.xpath("//input[@type='submit']")).click();----> type ---- multiple
		
		d.findElement(By.xpath("//input[@id='u_0_y']")).click();
		
		}*/

	}
}
