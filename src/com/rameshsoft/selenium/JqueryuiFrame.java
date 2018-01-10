/*Q: Frames basic concepts
  i) idntifying no.of frames
  ii) perform operations on frames
  iii) switch to from frame to window 
*/

package com.rameshsoft.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryuiFrame {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		//d.get("https://www.jqueryui.com");
		d.navigate().to("https://www.jqueryui.com");
		d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		Actions a = new Actions(d);
		WebElement autocomp = d.findElement(By.xpath("//a[text()='Autocomplete']"));
		a.click(autocomp).build().perform();
		
		List<WebElement> frames = d.findElements(By.tagName("iframe"));
		System.out.println("no.of frames are"+frames.size());
		
		//switch to frame
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@id='tags']")).sendKeys("selenium");
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[text()='Draggable']")).click();
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		
	}

}
