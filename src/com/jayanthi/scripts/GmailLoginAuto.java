package com.jayanthi.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GmailLoginAuto {
	

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("https://www.google.com");
		System.out.println("google opened");
		WebElement search = d.findElement(By.cssSelector("input[id='lst-ib']"));
		//WebElement search = d.findElement(By.xpath("//input[@id='lst-ib']"));
		Actions a = new Actions(d);
		a.sendKeys(search, "gmail.com").build().perform();
		WebElement google_search = d.findElement(By.cssSelector("input[value='Google Search']"));
		google_search.click();
		WebElement link = d.findElement(By.xpath("//a[text()='Gmail']"));
		link.click();
		System.out.println("gmail link opened");
		Thread.sleep(2000);
		WebElement username = d.findElement(By.cssSelector("input[id='identifierId']"));
		a.sendKeys(username, "swapnajayanthiashamolla@gmail.com").build().perform();
		System.out.println("username entered");
		Thread.sleep(2000);
		WebElement next = d.findElement(By.cssSelector("div[id='identifierNext']"));
		a.click(next).build().perform();
		Thread.sleep(2000);
		WebElement pwd = d.findElement(By.cssSelector("input[class='whsOnd zHQkBf']"));
		a.sendKeys(pwd, "ammabaapu@sai123").build().perform();
		System.out.println("password entered");
		Thread.sleep(2000);
		WebElement pwdnext = d.findElement(By.cssSelector("div[id='passwordNext']"));
		a.click(pwdnext).build().perform();
		System.out.println("gmail page is opened");
		Thread.sleep(2000);
		/*WebElement compose = d.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']"));
		a.click(compose).build().perform();
		System.out.println("click on compose");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("textarea[id=':o4']")).sendKeys("jayanthiashamolla@gmail.com");
		System.out.println("text entered");
		Thread.sleep(3000);
		d.findElement(By.cssSelector("input[id=':nn']")).sendKeys("resume");
		System.out.println("subject entered");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("div[id=':pa']")).click();
		System.out.println("click on attatch file");
		Runtime.getRuntime().exec("C:\\Users\\jayanthi\\Desktop\\swapnaautoit.exe");
		System.out.println("first file upload");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\jayanthi\\Desktop\\swap.jayanthiauto.exe");
		System.out.println("2files successfully upload");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("div[id=':nd']")).click();
		System.out.println("file successfully send");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("span[class='gb_ab gbii']")).click();*/
		d.findElement(By.cssSelector("a[class='gb_Ea gb_Pf gb_Wf gb_De gb_Db']")).click();
		//d.findElement(By.cssSelector("a[id='gb_71']")).click();
		System.out.println("successfully signout");
		
		
		}

}
