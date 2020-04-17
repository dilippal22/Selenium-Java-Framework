package com.dgsl.phptravels.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dgsl.phptravels.base.TestBase;
import com.dgsl.phptravels.pages.RegistrationPage;

public class RegistrationPageTest extends TestBase{
	
	RegistrationPage registrationpage;
	
	public RegistrationPageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initBrowser();
		registrationpage = new RegistrationPage();
	}
	
	@Test(priority = 1)
	public void registrationPageTitleTest(){
		String registrationTitle = registrationpage.validateRegistrationPageTitle();
		Assert.assertEquals(registrationTitle, "Register");
	}
	
	@Test(priority = 2)
	public void signUpTextTest(){
		boolean signUpTextFlag = registrationpage.validateSignUpText();
		Assert.assertTrue(signUpTextFlag, "SignUp Text is missing");
	}	
	
	@Test(priority = 3)
	public void registerNewUserTest(){
		long mob_number = Long.parseLong(prop.getProperty("mobilenumber"));
		registrationpage.registerNewUser(prop.getProperty("firstname"), prop.getProperty("lastname"), mob_number, prop.getProperty("email"), prop.getProperty("password"), prop.getProperty("confmpassword"));
	}
	
	@AfterMethod
	public void tearDown(){
		closeBrowser();
	}

}
