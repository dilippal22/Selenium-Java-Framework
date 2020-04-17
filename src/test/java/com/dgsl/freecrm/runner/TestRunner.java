package com.dgsl.freecrm.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.dgsl.freecrm.util.Constants;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:/Selenium Practice/FreeCRM Cucumber/src/main/java/com/dgsl/freecrm/feature/login.feature",
			glue = {"com/dgsl/freecrm/stepdefinition"},
			plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:extent-report/FreeCRMExtent.html","html:test-output/FreeCRMReport.html", "junit:junit_xml/FreeCRM.xml"},
			monochrome = true,
			strict = true,
			dryRun = true
//			tags = {"@SmokeTest", "@RegressionTest", "@End2End"}
			)

public class TestRunner {
		
		@AfterClass
		public void setExtent(){
			Reporter.loadXMLConfig(Constants.EXTENT_CONFIG);
			Reporter.setSystemInfo("OS", "Windows-10");
			Reporter.setSystemInfo("Environment", "Test");
			Reporter.setSystemInfo("Host Name", "Dilip.P");
			Reporter.setTestRunnerOutput("Test Logs");
		}

}
