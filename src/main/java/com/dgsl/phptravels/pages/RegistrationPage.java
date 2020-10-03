package com.dgsl.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dgsl.phptravels.base.TestBase;

public class RegistrationPage extends TestBase {
	
	@FindBy(xpath = "//div[text()='Sign Up']")
	@CacheLookup
	private static WebElement signUpText;
	
	@FindBy(id = "//input[@placeholder='First Name']")
	@CacheLookup
	private static WebElement firstName;
	
	@FindBy(id = "//input[@placeholder='Last Name']")
	@CacheLookup
	private static WebElement lastName;
	
	@FindBy(id = "//input[@placeholder='Mobile Number']")
	@CacheLookup
	private static WebElement mobileNumber;
	
	@FindBy(id = "//input[@placeholder='Email']")
	@CacheLookup
	private static WebElement email;
	
	@FindBy(id = "//input[@placeholder='Password']")
	@CacheLookup
	private static WebElement password;
	
	@FindBy(id = "//input[@placeholder='Confirm Password']")
	@CacheLookup
	private static WebElement confirmPassword;
	
	@FindBy(id = "//div[@class='form-group']/button")
	@CacheLookup
	private static WebElement signUpBtn;
	
	
	//Initializing page objects
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
		}
	
	public static String validateRegistrationPageTitle(){
		return driver.getTitle();
		}	
	
	public static boolean validateSignUpText(){
		return signUpText.isDisplayed();
		}
	
	public static AccountPage registerNewUser(String ftName, String ltName, long mobNumber, String mail, String pwd, String confirmPwd){
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		mobileNumber.sendKeys("mobNumber");
		password.sendKeys(pwd);
		confirmPassword.sendKeys(confirmPwd);
		signUpBtn.click();
		return new AccountPage();
		}
	}
