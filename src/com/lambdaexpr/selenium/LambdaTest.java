package com.lambdaexpr.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bsh.commands.dir;
@FunctionalInterface
interface Check
{
	void click(WebElement e);
}

public class LambdaTest {
WebElement e;
	public static void main(String[] args) {
		Check c = (WebElement e)->{if(e.isDisplayed() && e.isEnabled())
		{
			e.click();
		}
		else
		{
			System.out.println("element is not displayed");
		}
		};		
		

		}}
