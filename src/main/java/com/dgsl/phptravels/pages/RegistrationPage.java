package com.dgsl.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dgsl.phptravels.base.TestBase;

public class RegistrationPage extends TestBase {
	
	@FindBy(xpath = "//div[text()='Sign Up']")
	@CacheLookup
	private WebElement signUpText;
	
	@FindBy(id = "//input[@placeholder='First Name']")
	@CacheLookup
	private WebElement firstName;
	
	@FindBy(id = "//input[@placeholder='Last Name']")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(id = "//input[@placeholder='Mobile Number']")
	@CacheLookup
	private WebElement mobileNumber;
	
	@FindBy(id = "//input[@placeholder='Email']")
	@CacheLookup
	private WebElement email;
	
	@FindBy(id = "//input[@placeholder='Password']")
	@CacheLookup
	private WebElement password;
	
	@FindBy(id = "//input[@placeholder='Confirm Password']")
	@CacheLookup
	private WebElement confirmPassword;
	
	@FindBy(id = "//div[@class='form-group']/button")
	@CacheLookup
	private WebElement signUpBtn;
	
	
	//Initializing page objects
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
		}
	
	public String validateRegistrationPageTitle(){
		return driver.getTitle();
		}	
	
	public boolean validateSignUpText(){
		return signUpText.isDisplayed();
		}
	
	public AccountPage registerNewUser(String ftName, String ltName, long mobNumber, String mail, String pwd, String confirmPwd){
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		mobileNumber.sendKeys("mobNumber");
		password.sendKeys(pwd);
		confirmPassword.sendKeys(confirmPwd);
		signUpBtn.click();
		return new AccountPage();
		}
	}
