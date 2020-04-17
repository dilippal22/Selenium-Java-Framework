package com.datamatics.meritor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.datamatics.meritor.base.TestBase;
import com.datamatics.meritor.util.TestUtil;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[@id='menu-top']/li/span")
	private WebElement userName;

	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logoutLink;

	public String validateHomePageTitle() {
		WebDriverWait wait = new WebDriverWait(getDriver(),
				TestUtil.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.titleIs(prop
				.getProperty("homepage_title")));

		return getDriver().getTitle();

	}

	public LoginPage logoutApp() {
		Actions builder = new Actions(getDriver());
		builder.moveToElement(userName).moveToElement(logoutLink).click()
				.build().perform();
		return new LoginPage();
	}
}
