package com.datamatics.meritor.stepdefinition;

import com.datamatics.meritor.pages.HomePage;
import com.datamatics.meritor.pages.LoginPage;

import cucumber.api.java.en.Given;

public class HomePageTest {

	HomePage homepage;
	LoginPage logipage;

	@Given("^processor user is on home page$")
	public void processor_user_is_on_home_page() {
		homepage.validateHomePageTitle();
		logipage = homepage.logoutApp();
	}

}
