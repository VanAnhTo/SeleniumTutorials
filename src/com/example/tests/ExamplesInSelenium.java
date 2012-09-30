package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.pages.HomePage;

public class ExamplesInSelenium {

	private WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void launchBrowser() {
		driver.navigate().to("https://www.kanbanpad.com/");
	}

	@Test
	public void textboxHandling() {
		HomePage page = PageFactory.initElements(driver, HomePage.class);
		page.RegisterAUser("nishant verma", "nishu", "nishuverma@gmail.com",
				"test@12345");
	}
	
	
	

}
