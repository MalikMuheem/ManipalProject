package com.uniform.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void takescreenshot(WebDriver driver, String name)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+name+".png");
			FileUtils.copyFile(src, dest);	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void selectByIndex(WebElement ele, int Index)
	{
		Select sel = new Select(ele);
		sel.selectByIndex(Index);
	}
	
	public static void selectByValue(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
	}
	
	public static void deselectByIndex(WebElement ele, int Index)
	{
		Select sel = new Select(ele);
		sel.deselectByIndex(Index);
	}
	
	public static void deselectByValue(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.deselectByValue(value);
	}
	
	public static void deselectByVisibleText(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.deselectByVisibleText(value);
	}
	
	public static void deselectAll(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.deselectAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
