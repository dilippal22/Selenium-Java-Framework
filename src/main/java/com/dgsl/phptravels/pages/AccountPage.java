package com.dgsl.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dgsl.phptravels.base.TestBase;

public class AccountPage extends TestBase {

	/*
	 * @FindBy(xpath = "//li[@class='']/a")
	 * 
	 * @CacheLookup private static WebElement userName;
	 */

	@FindBy(xpath = "//ul[@class='dropdown-menu']/li[2]//a")
	@CacheLookup
	private static WebElement logoutLink;

	// Initializing Page Objects
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}

	public static String validateAccountPageTitle() {
		return driver.getTitle();
	}

	public static LoginPage clickOnLogoutLink() {
		logoutLink.click();
		return new LoginPage();
	}
}
