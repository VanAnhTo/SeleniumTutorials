package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "login-link")
	private WebElement loginRegisterLink;

	@FindBy(id = "user-name")
	private WebElement fullnameBox;

	@FindBy(id = "user-nick")
	private WebElement nicknameBox;

	@FindBy(id = "user-email")
	private WebElement emailBox;

	@FindBy(id = "user-password")
	private WebElement passwordBox;
	
	@FindBy(id = "session-email")
	private WebElement sessionEmail;
	
	@FindBy(id = "session-email")
	private WebElement sessionPassword;

	public void registerNewUser(String fullname, String nickname, String emailId,
			String password) {
		loginRegisterLink.click();
		fullnameBox.sendKeys(fullname);
		nicknameBox.sendKeys(nickname);
		emailBox.sendKeys(emailId);
		passwordBox.sendKeys(password);
		passwordBox.submit();
	}
	
	public void loginAsRegisteredUser(String emailId, String passwd){
		loginRegisterLink.click();
		sessionEmail.sendKeys(emailId);
		sessionPassword.sendKeys(passwd);
		sessionPassword.submit();
	}

}
