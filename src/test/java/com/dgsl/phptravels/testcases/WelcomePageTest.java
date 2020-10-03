package com.dgsl.phptravels.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dgsl.phptravels.base.TestBase;
import com.dgsl.phptravels.pages.RegistrationPage;
import com.dgsl.phptravels.pages.WelcomePage;
import com.dgsl.phptravels.util.TestUtil;

public class WelcomePageTest extends TestBase {
	
	Logger log = Logger.getLogger(WelcomePageTest.class);

	WelcomePage welcomepage;
	RegistrationPage registrationpage;

	public WelcomePageTest() {
		super();
	}

	@BeforeTest
	public void setExtent() {
		TestUtil.setExtentReport();
	}

	@BeforeMethod
	public void setUp() {
		initBrowser();
		welcomepage = new WelcomePage();
	}

	@Test(priority = 1)
	public void welcomePageTitleTest() {
		TestUtil.extentTest = TestUtil.report.startTest("welcomePageTitleTest");
		String welcomeTitle = welcomepage.validateWelcomPageTitle();
		Assert.assertEquals(welcomeTitle, "PHPTRAVELS | Travel Technology Partner");
	}

	@Test(priority = 2)
	public void welcomePageLogoTest() {
		TestUtil.extentTest = TestUtil.report.startTest("welcomePageLogoTest");
		boolean welcomeLogoFlag = welcomepage.validateWelcomePageLogo();
		Assert.assertTrue(welcomeLogoFlag, "The Welcome Page logo is mismatch");
	}

	@Test(priority = 3)
	public void signUpLinkTest() {
		TestUtil.extentTest = TestUtil.report.startTest("signUpLinkTest");
		registrationpage = welcomepage.clickOnSignupLink();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		TestUtil.setTestStatus(result);
	}

	@AfterTest
	public void endExtent() {
		TestUtil.endExtentReport();
	}

}