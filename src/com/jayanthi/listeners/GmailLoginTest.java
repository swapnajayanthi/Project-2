package com.jayanthi.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GmailLoginTest {
@Test
public void login()
{
 DriverUtility.openBrowser("chrome");
 DriverUtility.getDriver().get("https://www.gmail.com");
 WebElement userName = DriverUtility.getDriver().findElement(By.id("Identifier"));
 userName.clear();
 userName.sendKeys("jayanthiashamolla@gmail.com");
 DriverUtility.getDriver().findElement(By.id("IdentifierNext")).click();
 
}
}
