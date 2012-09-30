package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrganization {

	@FindBy(className = "createorganization")
	private WebElement createOrganizationLink;

	@FindBy(name = "organization[name]")
	private WebElement orgNameBox;

	public void createOrg(String orgName) {
		createOrganizationLink.click();
		orgNameBox.sendKeys(orgName);
	}
}
