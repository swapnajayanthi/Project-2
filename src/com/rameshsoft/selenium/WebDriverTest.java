package com.rameshsoft.selenium;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.unix.X11.Window;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.gmail.com");
		//d.get("https://www.bing.com");
		
		//String title = d.getTitle();
		//System.out.println("title of the page is:" +title);
		
		/*String url = d.getCurrentUrl();
		System.out.println("URL is:" +url);
		
		String pagesource =  d.getPageSource();
		System.out.println(pagesource);*/
		
		String WindowName = d.getWindowHandle();
		System.out.println("window name is:" +WindowName);
		
		/*Set<string> window = d.getWindowHandles();
		System.out.println("windows are:" +window.size());*/
		
	    //d.findElement(By.id("identifierId"));
		List<WebElement> list = d.findElements(By.tagName("input"));
		System.out.println("no of ANCHOR TAGS are:" +list.size());
		
		/*d.close();
		d.quit();*/
		
	    Navigation navigate = d.navigate();
	    navigate.to("https://www.gmail.com");
	   // navigate.to(new URL("https://www.gmail.com"));
	    navigate.refresh();
	    navigate.back();
	    navigate.forward();
	    
	    
	   /* Options options = d.manage();
	    options.deleteAllCookies();
	    d.manage().deleteAllCookies();
	    */
	    
	   

	}

}
