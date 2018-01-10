package com.rameshsoft.selenium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateDropDown {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Select select = new Select(d.findElement(By.id("day")));
		List<WebElement> elements = select.getOptions();
		Set<WebElement> set = new HashSet<WebElement>();
		for(WebElement element:elements)
		{
			boolean b = set.add(element);
			if(b)
			{
				System.out.println("not duplicate");
			}
			else
			{
				System.out.println("found duplicate:"+element);
			}
		}
		
	}

}
