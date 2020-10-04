package com.dgsl.selenium.testngconcept;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.dgsl.java.util.TestUtil;

public class TestngFeature {

	Logger log = Logger.getLogger(TestngFeature.class);

	WebDriver driver;

	@BeforeTest
	public void setExtent() {
		TestUtil.setExtentReport();
	}

	@Test(priority = 4, invocationCount = 5, alwaysRun = true, enabled = true)
	public void TestCaseOne() {
		System.out.println("TestCaseFirst -- This is First Test Case");
		log.info("TestCaseFirst -- This is First Test Case");
		System.out.println("TestCaseOne -- This is first Test Case");
		log.info("TestCaseOne -- This is first Test Case");
	}

	@Test(priority = 2, invocationTimeOut = 5, dependsOnMethods = "TestCaseOne")
	public void TestCaseSecond() {
		System.out.println("TestCaseSecond -- This is Second Test Case");
		Assert.assertTrue(true);
		log.info("TestCaseSecond -- This is Second Test Case");
	}

	@Test(priority = 1, groups = { "Regression", "Smoke" }, dependsOnMethods = "TestCaseSecond")
	public void TestCaseThird() {
		System.out.println("TestCaseThird -- This is Third Test Case");
		log.info("TestCaseThird -- This is Third Test Case");
	}

	@Test(priority = 3, groups = { "Regression", "Sanity" })
	public void TestCaseFourth() {
		System.out.println("TestCaseFourth -- This is Fourth Test Case");
		log.info("TestCaseFourth -- This is Fourth Test Case");
	}

	@Test(dependsOnGroups = "Regression")
	public void TestCaseFifth() {
		System.out.println("TestCaseFifth -- This is Fifth Test Case");
		log.info("TestCaseFifth -- This is Fifth Test Case");
	}

	@AfterMethod
	public void setTestResult(ITestResult result) throws IOException {
		TestUtil.logTestStatus(result);
	}

	@AfterTest
	public void endExtent() {
		TestUtil.endExtentReport();
	}

}
