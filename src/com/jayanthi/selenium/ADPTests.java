package com.jayanthi.selenium;

//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ADPTests {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.ADP.com");
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
List<WebElement> adp = d.findElements(By.xpath("//*[contains(text(),'ADP')]"));
System.out.println("ADP size is:"+adp.size());
Thread.sleep(4000);

int disabledlinks=0;
int enabledlinks=0;
ListIterator<WebElement> ele = adp.listIterator();
while(ele.hasNext())
{
	
	WebElement e = ele.next();
	String s =e.getText();
	//System.out.println(s);
	
	if(e.isDisplayed() && e.isEnabled())
	{
		disabledlinks++;
		
	}
	else
	{
		enabledlinks++;
	}
}
System.out.println("enabled links are:"+enabledlinks);
System.out.println("disabled links are:"+disabledlinks);

int total = enabledlinks + disabledlinks;
int totallinks=0;
if(total==totallinks)
{
	System.out.println("count is matched");
}
else
{
	System.out.println("count not matched");
}



/*Iterator<WebElement> ele = adp.iterator();
while(ele.hasNext())
{
	WebElement e = ele.next();
	System.out.println(e.getText());
}*/


	}

}
