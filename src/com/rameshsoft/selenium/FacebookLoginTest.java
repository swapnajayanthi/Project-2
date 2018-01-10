package com.rameshsoft.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com");
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//WebElement userName = d.findElement(By.xpath("//input[@class='inputtext']"));
		/*WebElement userName = d.findElement(By.xpath("//input[@data-testid='royal_email']"));
		userName.clear();
		userName.sendKeys("jayanthiashamolla@gmail.com");
		
		WebElement pass = d.findElement(By.xpath("//input[@tabindex='2']"));
		pass.clear();
		pass.sendKeys("jayanthi.swap@880");
		
		WebElement login = d.findElement(By.xpath("//input[@value='Log In']"));
		login.click();*/
		
		WebElement userName = d.findElement(By.cssSelector("input[data-testid='royal_email']"));
		userName.clear();
		userName.sendKeys("jayanthiashamolla@gmail.com");
		
		/*WebElement pass = d.findElement(By.cssSelector("input[id='pass']"));
		pass.clear();
		pass.sendKeys("abcde");
		
		//WebElement login = d.findElement(By.cssSelector("input[id='u_0_5']"));
		WebElement login = d.findElement(By.cssSelector("input[value='Log In']"));
		login.click();
*/		
		//d.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("jayanthi");
		
		//d.findElement(By.xpath("//div[@class='_5dbb']/div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@id='u_0_g']")).sendKeys("jayanthi");//
		
		d.findElement(By.xpath("//div[@id='u_0_f']/div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@id='u_0_g']")).sendKeys("jayanthi");
		//d.findElement(By.xpath("//div[@class='_5dbb']//input[@id='u_0_g']")).sendKeys("jayanthi");
		
		d.findElement(By.cssSelector("input[name='lastname']")).sendKeys("ashamolla");
		
		d.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("8801266282");
		d.findElement(By.cssSelector("input[id='u_0_s']")).sendKeys("sairam");
		//d.findElement(By.cssSelector("button[class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		
		/*WebElement day = d.findElement(By.id("day"));
		Select s = new Select(day);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("multiselect dropdown");
		}
		else
		{
			System.out.println("it is single select dropdown");
		}
		if(day.getTagName().equalsIgnoreCase("select"))
		{
			s.selectByIndex(5);
			s.selectByValue("9");
			s.selectByVisibleText("16");
		
		
		WebElement element = s.getFirstSelectedOption();
		System.out.println("first selected option:" +element.getText());
		List<WebElement> list = s.getOptions();
		System.out.println("total no.of elements in a dropdown:" +list.size());
	}
	*/
	/*else
	{
		
         d.findElement(By.xpath("//*[@id='day'])/option[9]")).click();
         List<WebElement> list = d.findElements(By.xpath("//*[@id='day']"));
         System.out.println("total no.of elements:" list.size());
	}
}*/

		
		WebElement month = d.findElement(By.id("month"));
		Select s = new Select(month);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("multiselect dropdown");
		}
		else
		{
			System.out.println("it is single select dropdown");
		}
		if(month.getTagName().equalsIgnoreCase("select"))
		{
			//s.selectByIndex(august);
			s.selectByValue("oct");
			s.selectByVisibleText("dec");
		
		
		WebElement element = s.getFirstSelectedOption();
		System.out.println("first selected option:" +element.getText());
		List<WebElement> list = s.getOptions();
		System.out.println("total no.of elements in a dropdown:" +list.size());
	}

	
		
		
		
		
		
		
		
		
		
		
		
	}

}