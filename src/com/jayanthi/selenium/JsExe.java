package com.jayanthi.selenium;

import java.rmi.Remote;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JsExe {
	public static void main(String[] args) {
	RemoteWebDriver d = new FirefoxDriver();
	d.executeScript("https://www.gmail.com", "username");

	
	

}
}