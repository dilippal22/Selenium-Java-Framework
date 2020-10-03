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
import com.dgsl.phptravels.pages.AccountPage;
import com.dgsl.phptravels.pages.LoginPage;
import com.dgsl.phptravels.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	Logger log = Logger.getLogger(LoginPageTest.class);

	LoginPage loginpage;
	AccountPage accountpage;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setExtent() {
		TestUtil.setExtentReport();
	}

	@BeforeMethod
	public void setUp() {
		initBrowser();
		loginpage = new LoginPage();
	}

	@Test
	public void loginPageTitleTest() {
		TestUtil.extentTest = TestUtil.report.startTest("loginPageTitleTest");
		String loginTitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals(loginTitle, "Login");
	}

	@Test(dataProvider = "LoginTestData")
	public void loginTest() {
		TestUtil.extentTest = TestUtil.report.startTest("loginTest");
		loginpage.getLogin(prop.getProperty("username"), prop.getProperty("password"));
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
