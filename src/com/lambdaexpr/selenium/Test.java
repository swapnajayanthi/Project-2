package com.lambdaexpr.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

interface A<T>
{
	boolean check(T t);
}

public class Test {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://gmail.com");
		WebElement e = d.findElement(By.id("identifierId"));
		A <WebElement> a = (e1)->{boolean b = true;
		if(e.isDisplayed() && e.isEnabled())
		{
			System.out.println("element entered");
			e.clear();
			e.sendKeys("jayanthi");
		}
		else
		{
			b = false;
		}
		return b;
		};
	a.check(e);	

	}

}
