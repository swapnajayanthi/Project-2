package com.rameshsoft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickableActions {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		d.get("https://www.gmail.com");
		WebElement username = d.findElement(By.xpath("//input[@id='identifierId']"));
		Actions a = new Actions(d);
		a.click(username).sendKeys("swapna@gmail").build().perform();
		WebElement next = d.findElement(By.id("identifierNext"));
		//next.click();
		//next.submit();
		//a.click(next).build().perform();
		//a.doubleClick(next).build().perform();
		//a.sendKeys(next, Keys.ENTER).build().perform();
		a.clickAndHold(next).build().perform();
		//a.moveToElement(next).click().build().perform();
		//javaScript executor

	}

}
