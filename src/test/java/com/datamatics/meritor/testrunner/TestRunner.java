package com.datamatics.meritor.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.datamatics.meritor.base.TestBase;
import com.datamatics.meritor.util.Constants;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/resources/java/com/datamatics/meritor/features/meritor.feature",
			glue = {"com/datamatics/meritor/stepdefinition"},
			plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:extent-report/MeritorTestRunReport.html", "html:default-report", "json:json-report/MeritorTestRunReport.json","junit:junit-report/MeritorTestRunReport.html"},
			monochrome = true,
			strict = true,
//			tags = {"@SmokeTest", "@SanityTest", "@RegressionTest"},
			dryRun = true
			)
	
public class TestRunner extends TestBase {
	@AfterClass
	public static void setExtent() {
		Reporter.loadXMLConfig(new File(Constants.EXTENT_CONFIG));
		Reporter.setSystemInfo("OS", "Windows-7");
		Reporter.setSystemInfo("Environment", "Test-Environment");
		Reporter.setTestRunnerOutput("Test Runner Logs");
		Reporter.setSystemInfo("Host", "Dilip-PC");
	}

}
