package com.rameshsoft.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartCollection {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.flipkart.com");
		
		List<WebElement> headers = d.findElements(By.xpath("//*[@class='Wbt_B2']"));
		System.out.println("headers size is:" +headers.size());
		
		
		/*Iterator<WebElement> women = headers.iterator();
		while(women.hasNext())
		{
			WebElement e = women.next();
			System.out.println(e.getText());
		}*/
		
		ListIterator<WebElement> electronics = headers.listIterator();
     	while(electronics.hasNext())
      	{
			WebElement e = electronics.next();
 		    String s = e.getText();
			System.out.println(s);
      	}

		WebElement women = d.findElement(By.xpath("//*[text()='Women']"));
		Actions a = new Actions(d);
		a.moveToElement(women).build().perform();
		System.out.println("women button is clicked");
		
      	}
		
	

}
