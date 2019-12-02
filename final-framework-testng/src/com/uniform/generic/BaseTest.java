package com.uniform.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstants
{
	
	public WebDriver driver ;
	
	@BeforeMethod
	public void preCondition()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://uniformm1.upskills.in");	
	}

	@AfterMethod
	public void postCondition(ITestResult res)
	{
		int status = res.getStatus();
		if (status ==2) 
		{
			String name = res.getName();
			GenericUtils.takescreenshot(driver, name);
		}
		driver.close();
	}
}
