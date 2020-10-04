package com.dgsl.java.util;

import java.io.IOException;

import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestUtil {

	public static ExtentReports report;
	public static ExtentTest extentTest;

	public static void setExtentReport() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\test-output\\ExtentReport.html", true);
		report.addSystemInfo("Host-Name", "Dilip-Windows-local");
		report.addSystemInfo("Username", "Dilip");
		report.addSystemInfo("Environment", "Test");
	}

	public static void endExtentReport() {
		report.flush();
	}

	public static void logTestStatus(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			// To add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
			// To add error or exception in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
			extentTest.log(LogStatus.SKIP, "TEST CASE SKIPPED IS " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
//			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
//			extentTest.log(LogStatus.PASS, "TEST CASE PASSED IS " + result.getThrowable());
		}

		// ending test and ends the current test and prepare to create html report
		report.endTest(extentTest);
	}
}
