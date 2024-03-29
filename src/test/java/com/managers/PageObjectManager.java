package com.managers;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
}
