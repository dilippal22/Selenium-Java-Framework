package com.dgsl.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dgsl.freecrm.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//*[@placeholder='Username']")
	private WebElement username;

	@FindBy(xpath = "//*[@placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//*[@value='Login']")
	private WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}

}
