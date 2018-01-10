package com.jayanthi.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenShotUtility {
	public static void screenShot(String imageName, WebDriver d) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)d;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\"+imageName+".jpeg"));
	}

}
