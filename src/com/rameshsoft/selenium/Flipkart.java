package com.rameshsoft.selenium;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.flipkart.com");
        d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement electronics = d.findElement(By.xpath("//a[@title='Electronics']"));
        Actions a = new Actions(d);
        a.moveToElement(electronics).build().perform();
        
        WebDriverWait wait = new WebDriverWait(d, 120);
        wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.xpath("//a[@title='Electronics']"))));
       
            
        WebElement mobiles = d.findElement(By.xpath("//a[@title='Mobiles']"));
        mobiles.click();
        System.out.println("mobiles button is clicked");
        
        List<WebElement> initialfilterlist = d.findElements(By.xpath("//section[@class='U94Qha _2Zm4Qh']/div"));
        System.out.println("the filter list is:"+initialfilterlist.size());
        
       /* WebElement min = d.findElement(By.xpath("//select[@class='a_eCSK']"));
        Select s = new Select(min);
        s.selectByValue("4000");
        System.out.println("min value entered");*/
        
        Select s = new Select(d.findElement(By.xpath("//div[@class='_2yCtb1']/div[1]/select")));
        s.selectByValue("4000"); 
        System.out.println("min pricerange is selected");
        
        Thread.sleep(2000);
        List<WebElement> minprice = d.findElements(By.xpath("//section[@class='U94Qha _2Zm4Qh']/div"));
        System.out.println("the filter list is:"+minprice.size());
        
        WebElement max = d.findElement(By.xpath("//div[@class='_2yCtb1']/div[@class='_3nSxeA']/select[@class='a_eCSK']"));
        Select s1 = new Select(max);
        s1.selectByValue("16000");
        System.out.println("max pricerange is selected");
        
        Thread.sleep(3000);
        List<WebElement> maxprice = d.findElements(By.xpath("//section[@class='U94Qha _2Zm4Qh']/div"));
        System.out.println("the filter list is:"+maxprice.size());
        
        
       
        
        
      /*  WebElement filter = d.findElement(By.xpath("//div[@class='_2GQLOX']/span[text()='Filters']"));
        String Text = filter.getText();   
        System.out.println("text:" +Text);
       
        
 
        WebElement filter1 = d.findElement(By.xpath("//div[@class='_2bbnvJ']"));
        String Text1 = filter1.getText();
        System.out.println("text1:" +Text1);
        
        WebElement max = d.findElement(By.xpath("//div[@class='_2yCtb1']/div[@class='_3nSxeA']/select[@class='a_eCSK']"));
        Select s1 = new Select(max);
        s1.selectByValue("16000");
        System.out.println("max value entered");
        
        WebElement filter2 = d.findElement(By.xpath("//div[@class='_2bbnvJ']"));
        String Text2 = filter2.getText();
        System.out.println("text2:" +Text2);*/
       
        Thread.sleep(3000);
        WebElement brand = d.findElement(By.xpath("//div/section[@class='_2XJuDa _2Zm4Qh']/div/div[text()='Brand']"));
        a.contextClick(brand).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("brand selected");
                
        /*List<WebElement> brands = d.findElements(By.xpath("//*[text()='Brand']"));
        System.out.println("brands size is:" +brands.size());*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        		
        
        
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        
        
       /* ListIterator<WebElement> list = brands.listIterator();
        int count=0;
        int count1=0;
        while(list.hasNext())
        {
        	WebElement e = list.next();
        	String s = e.getText();
        	
        	if(e.isDisplayed() && e.isEnabled())
        	{
        	  count++;	
        	}
        	else
        	{
        		count1++;
        	}
        	
        }*/
        
        
        
        
        
        
        
      /*  ListIterator<WebElement> samsung = brands.listIterator();
        while(samsung.hasNext())
        {
        	WebElement e = samsung.next();
        	String s = e.getText();
        	System.out.println(s);
        }*/
        
       
 
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
       
        
	}
}
        
        
   
        
        
        
      
        
    
