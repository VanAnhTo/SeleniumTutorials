package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.pages.CreateOrganization;
import com.example.pages.HomePage;

public class ExamplesInSelenium {

	private WebDriver driver = new FirefoxDriver();
	HomePage homePageHandle = PageFactory.initElements(driver, HomePage.class);
	CreateOrganization createOrgHandle = PageFactory.initElements(driver, CreateOrganization.class);

	
	@BeforeTest
	public void launchBrowser() {
		driver.navigate().to("https://www.kanbanpad.com/");
	}
	
//	@Test
//	public void registerNewUser() {
//		homePageHandle.registerNewUser("User Name", "User Nick Name", "User_Email_Id@blah-blah.com",
//				"test@12345");
//	}
	
	
	@Test
	public void loginAsRegisteredUser(){
		homePageHandle.loginAsRegisteredUser("nishuverma@gmail.com", "yahoo@1980");
		createOrgHandle.createOrg("TestOrg 12345");
	}
	
}