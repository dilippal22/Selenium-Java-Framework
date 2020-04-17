package com.dgsl.phptravels.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dgsl.phptravels.base.TestBase;
import com.dgsl.phptravels.pages.AccountPage;
import com.dgsl.phptravels.pages.LoginPage;

public class AccountPageTest extends TestBase{
	
	AccountPage accountpage;
	LoginPage loginpage;
	
	public AccountPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initBrowser();
		accountpage = new AccountPage();
	}
	
	@Test(priority = 1)
	public void accountPageTitleTest(){
		String accountTitle = accountpage.validateAccountPageTitle();
		Assert.assertEquals(accountTitle, "My Account");
		}
	
	@Test(priority = 2)
	public void logoutLinkTest(){
		loginpage = accountpage.clickOnLogoutLink();
		}
	
	@AfterMethod
	public void tearDown(){
		closeBrowser();
		}

}
