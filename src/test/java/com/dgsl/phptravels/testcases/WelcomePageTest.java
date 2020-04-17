package com.dgsl.phptravels.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dgsl.phptravels.base.TestBase;
import com.dgsl.phptravels.pages.RegistrationPage;
import com.dgsl.phptravels.pages.WelcomePage;

public class WelcomePageTest extends TestBase{
	
	WelcomePage welcomepage;
	RegistrationPage registrationpage;
	
	public WelcomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initBrowser();
		welcomepage = new WelcomePage();
	}
	
	@Test(priority = 1)
	public void welcomePageTitleTest(){
		String welcomeTitle = welcomepage.validateWelcomPageTitle();
		Assert.assertEquals(welcomeTitle, "PHPTRAVELS | Travel Technology Partner");
	}
	
	@Test(priority = 2)
	public void welcomePageLogoTest(){
		boolean welcomeLogoFlag = welcomepage.validateWelcomePageLogo();
		Assert.assertTrue(welcomeLogoFlag, "The Welcome Page logo is mismatch");
	}
	
	@Test(priority = 3)
	public void signUpLinkTest(){
		registrationpage = welcomepage.clickOnSignupLink();
	}	
	
	@AfterMethod
	public void tearDown(){
		closeBrowser();
	}

}