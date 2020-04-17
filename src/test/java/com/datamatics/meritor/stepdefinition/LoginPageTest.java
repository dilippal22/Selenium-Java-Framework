package com.datamatics.meritor.stepdefinition;

import com.datamatics.meritor.pages.HomePage;
import com.datamatics.meritor.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageTest {

	LoginPage loginpage;
	HomePage homepage;

	@Given("^processor user is login page$")
	public void processor_user_is_login_page() {
		loginpage.validateLoginPageTitle();
	}

	@Then("^processor user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void processor_user_enters_and(String user_name, String pwd) {
		homepage = loginpage.login(user_name, pwd);
	}

}
