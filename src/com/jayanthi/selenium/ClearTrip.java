package com.jayanthi.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.GetTable;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("https://www.cleartrip.com/");
		String actualValueTitle = d.getTitle();
		System.out.println("Title page is" +actualValueTitle);
		String expectedValue = "cleartrip";
		System.out.println("home page is opened");
		
		//validate the flights
			if(d.findElement(By.linkText("Flights")).isEnabled())
			{
				d.findElement(By.linkText("Flights")).click();
			}
			else
			{
				System.out.println("Flights is not opened");
			}
		
		
		/*
		//d.findElement(By.xpath("//a[text()='Trains']")).click();
		
		d.findElement(By.xpath("//input[@id='from_station']")).sendKeys("hyderabad");   
		WebDriverWait wait = new WebDriverWait(d, 60);
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[@id='from_station']"))));
		d.findElement(By.xpath("//input[@id='to_station']")).sendKeys("banglore");
		WebElement trainClass = d.findElement(By.id("trainClass"));
		Select s = new Select(trainClass);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("multiselect dropdown");
		}
		else
		{
			System.out.println("it is a single drop down");
		}
		if(trainClass.getTagName().equalsIgnoreCase("select"))
		{
			s.selectByIndex(4);
			
		
		}
*/
			//validate the round trip radio button
			
			d.findElement(By.id("RoundTrip")).click();
			if(d.findElement(By.id("RoundTrip")).isSelected())
			{
				System.out.println("round trip is selected");
			}
			else
			{
				System.out.println("round trip is not selected");
			}
			//validate the from place
			if(d.findElement(By.id("FromTag")).isEnabled())
			{
				d.findElement(By.id("FromTag")).clear();
				d.findElement(By.id("FromTag")).sendKeys("Hyderabad");    
				System.out.println("from place entered");
			}
			else
			{
				System.out.println("from place not entered");
			}
			if(d.findElement(By.xpath("//input[@id='ToTag']")).isEnabled())
			{
				d.findElement(By.xpath("//input[@id='ToTag']")).clear();
				d.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Banglore");
				System.out.println("to place entered");
			}
			else
			{
				System.out.println("to place not entered");
			}
					
			d.findElement(By.xpath("//input[@id='DepartDate']")).click();
			
}
}
