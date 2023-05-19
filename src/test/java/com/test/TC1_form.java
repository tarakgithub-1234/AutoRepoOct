package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.managers.PageObjectManager;
import com.pages.HomePage;
import com.utils.BrowserFactory;


public class TC1_form {
	WebDriver driver;
	HomePage homepage;
	PageObjectManager pom=new PageObjectManager(driver);
	@BeforeMethod()
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
			driver = new ChromeDriver();
	}
	@Test
		public void fillForm() throws IOException {
			homepage=pom.getHomePage();
			homepage.launchbrowser();
			homepage.setFirstName();
		}
		
}
