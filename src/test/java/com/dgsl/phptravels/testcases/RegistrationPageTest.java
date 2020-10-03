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
import com.dgsl.phptravels.util.TestUtil;

public class RegistrationPageTest extends TestBase {
	
	Logger log = Logger.getLogger(RegistrationPageTest.class);

	RegistrationPage registrationpage;

	public RegistrationPageTest() {
		super();
	}

	@BeforeTest
	public void setExtent() {
		TestUtil.setExtentReport();
	}

	@BeforeMethod
	public void setUp() {
		initBrowser();
		registrationpage = new RegistrationPage();
	}

	@Test(priority = 1)
	public void registrationPageTitleTest() {
		TestUtil.extentTest = TestUtil.report.startTest("registrationPageTitleTest");
		String registrationTitle = RegistrationPage.validateRegistrationPageTitle();
		Assert.assertEquals(registrationTitle, "Register");
	}

	@Test(priority = 2)
	public void signUpTextTest() {
		TestUtil.extentTest = TestUtil.report.startTest("signUpTextTest");
		boolean signUpTextFlag = RegistrationPage.validateSignUpText();
		Assert.assertTrue(signUpTextFlag, "SignUp Text is missing");
	}

	@Test(priority = 3)
	public void registerNewUserTest() {
		TestUtil.extentTest = TestUtil.report.startTest("registerNewUserTest");
		long mob_number = Long.parseLong(prop.getProperty("mobilenumber"));
		RegistrationPage.registerNewUser(prop.getProperty("firstname"), prop.getProperty("lastname"), mob_number,
				prop.getProperty("email"), prop.getProperty("password"), prop.getProperty("confmpassword"));
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
