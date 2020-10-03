package com.dgsl.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dgsl.phptravels.base.TestBase;

public class WelcomePage extends TestBase{
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']/li[2]//a")
	private static WebElement signUpBtn;
	
	@FindBy(xpath = "//img[@class='logo']")
	private static WebElement welcomePageLogo;
	
	//Initializing Page objects
	public WelcomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public static String validateWelcomPageTitle(){
		return driver.getTitle();
	}
	
	public static boolean validateWelcomePageLogo(){
		return welcomePageLogo.isDisplayed();
	}
	
	public static RegistrationPage clickOnSignupLink(){
		signUpBtn.click();
		return new RegistrationPage();
	}


}
