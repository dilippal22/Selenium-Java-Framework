package com.datamatics.meritor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datamatics.meritor.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "User_Name")
	private WebElement userName;

	@FindBy(id = "User_Password")
	private WebElement userPwd;

	@FindBy(id = "login")
	private WebElement btn;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public HomePage login(String uName, String uPwd) {
		userName.sendKeys(uName);
		userPwd.sendKeys(uPwd);
		btn.click();
		return new HomePage();
	}

	public String validateLoginPageTitle() {
		return getDriver().getTitle();
	}

}
