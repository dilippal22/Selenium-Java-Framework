package com.dgsl.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dgsl.phptravels.base.TestBase;

public class WelcomePage extends TestBase{
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']/li[2]//a")
	private WebElement signUpBtn;
	
	@FindBy(xpath = "//img[@class='logo']")
	private WebElement welcomePageLogo;
	
	//Initializing Page objects
	public WelcomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateWelcomPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateWelcomePageLogo(){
		return welcomePageLogo.isDisplayed();
	}
	
	public RegistrationPage clickOnSignupLink(){
		signUpBtn.click();
		return new RegistrationPage();
	}


}
