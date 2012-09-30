package com.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHandler {
	private WebDriver browser;

	public WebDriver LaunchBrowser() {
		browser = new FirefoxDriver();
		return browser;
	}
	

	public void CloseBrowser() {
		browser.close();
	}

}
