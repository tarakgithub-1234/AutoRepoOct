package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ConfigFileReader;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver rdriver){
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//*[text()='First Name']//following::input[1]")
	WebElement Firstname;
	public  void setFirstName()
	{
		Firstname.sendKeys("name");
	}
	public  void launchbrowser() throws IOException {
		driver.get(ConfigFileReader.getProperty("url"));
	}
}
