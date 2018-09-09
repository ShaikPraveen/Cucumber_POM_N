package com.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		try
		{
			prop =new Properties();
			FileInputStream fis=new FileInputStream("E:\\Praveen_Automation\\Cucumber_BDD\\Cucumber_POM_N\\src\\main\\java\\com\\config\\Config.properties");
			prop.load(fis);
			
		} catch (IOException e) {
			
			e.getMessage();
		}
	}
	
	 public static void initilization()
	 {
		 String brosername=prop.getProperty("browser");
		 
		 if (brosername.equals("chrome"))
		 {
			 driver=new ChromeDriver();
			
		}else if (brosername.equals("firefox"))
		 {
			 driver=new FirefoxDriver();
			
		}
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("testsiteurl"));
	 }
}
