package com.utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BrowserFactory {
	 WebDriver driver;
	
	public  void setup() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Driver//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
			driver = new ChromeDriver();
		
		
	
	}
	
	public void teardown ()
	{
	
			driver.quit();
		
	}
}