package com.dgsl.phptravels.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dgsl.phptravels.base.TestBase;
import com.dgsl.phptravels.pages.AccountPage;
import com.dgsl.phptravels.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	AccountPage accountpage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initBrowser();
		loginpage = new LoginPage();
		}
	
	@Test
	public void loginPageTitleTest(){
		String loginTitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals(loginTitle, "Login");
	}
	
	@Test(dataProvider = "LoginTestData")
	public void loginTest(){
		loginpage.getLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		closeBrowser();
	}
}
