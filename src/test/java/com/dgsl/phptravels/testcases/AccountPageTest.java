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

public class AccountPageTest extends TestBase {

	Logger log = Logger.getLogger(AccountPageTest.class);

	AccountPage accountpage;
	LoginPage loginpage;

	public AccountPageTest() {
		super();
	}

	@BeforeTest
	public void setExtent() {
		TestUtil.setExtentReport();
	}

	@BeforeMethod
	public void setUp() {
		initBrowser();
		accountpage = new AccountPage();
	}

	@Test(priority = 1)
	public void accountPageTitleTest() {
		TestUtil.extentTest = TestUtil.report.startTest("accountPageTitleTest");
		String accountTitle = accountpage.validateAccountPageTitle();
		Assert.assertEquals(accountTitle, "My Account");
	}

	@Test(priority = 2)
	public void logoutLinkTest() {
		TestUtil.extentTest = TestUtil.report.startTest("logoutLinkTest");
		loginpage = accountpage.clickOnLogoutLink();
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
