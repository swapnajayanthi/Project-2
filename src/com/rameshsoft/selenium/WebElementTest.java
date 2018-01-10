package com.rameshsoft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https)://www.facebook.com");
		WebElement userName = d.findElement(By.id("email"));
		if(userName.isDisplayed()&&userName.isEnabled())
		{
	
			userName.clear();
			userName.sendKeys();
		}
		else
		{
			//throws exception
		}
			String id = userName.getAttribute("id");
			String name = userName.getAttribute("name");
			String type = userName.getAttribute("type");
			System.out.println("id is" +id+ "name" +name+ "type" +type);
			String tagName = userName.getTagName();
			System.out.println("tagname is: "+tagName);
			userName.findElement(By.id("abc"));
			System.out.println("Height of the element is:" +userName.getSize().getHeight());
			System.out.println("Width of the element is:" +userName.getSize().getWidth());

			
			
			
			
		
	}

}
