package com.dgsl.selenium.testngconcept;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestngFeature {

	WebDriver driver;

	
	@Test(priority = 4, invocationCount = 5, alwaysRun = true, enabled = true)
	public void TestCaseOne() {
		System.out.println("TestCaseFirst -- This is First Test Case");
		System.out.println("TestCaseOne -- This is first Test Case");
	}

	@Test(priority = 2, invocationTimeOut = 5, dependsOnMethods = "TestCaseOne")
	public void TestCaseSecond() {
		System.out.println("TestCaseSecond -- This is Second Test Case");
	}

	@Test(priority = 1, groups = { "Regression", "Smoke" }, dependsOnMethods = "TestCaseSecond")
	public void TestCaseThird() {
		System.out.println("TestCaseThird -- This is Third Test Case");
	}

	@Test(priority = 3, groups = { "Regression", "Sanity" })
	public void TestCaseFourth() {
		System.out.println("TestCaseFourth -- This is Fourth Test Case");
	}

	@Test(dependsOnGroups = "Regression")
	public void TestCaseFifth() {
		System.out.println("TestCaseFifth -- This is Fifth Test Case");
	}

}
