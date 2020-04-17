package com.dgsl.phptravels.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.dgsl.phptravels.base.TestBase;

public class ScreenshotUtil extends TestBase{
	
	//This method will execute before starting of Test suite.
	public void onStart(ITestResult tr){
		
	}
		
	
	//This method will execute, Once the Test suite is finished.
	public void onFinish(ITestResult tr){
		
	}
	
	
	//This method will execute only when the test is pass.
	public void onTestPassed(ITestResult tr){
		if(prop.getProperty("screenShotOnPass").equalsIgnoreCase("yes")){
			captureScreenshot(tr, "pass");
		}
	}
	
	
	//This method will execute only when the test is fail.
	public void onTestFailure(ITestResult tr){
		if(prop.getProperty("screenShotOnFail").equalsIgnoreCase("yes")){
			captureScreenshot(tr, "fail");
		}
	}
	
	
	//This method will execute before the main test start (@Test)
	public void onTestStart(ITestResult tr){
		
	}
	
	
	//This method will execute only if any of the main test(@Test) get skipped
	public void onTestSkipped(ITestResult tr){
		
	}
	
	
	public void captureScreenshot(ITestResult result, String status){
		String destDir = "";
		
		//To get Test Case name
		String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy--hh:mm:ss");
		
		//if status = pass/fail then set the destination folder name
		if(status.equalsIgnoreCase("pass")){
			destDir = "Screnshots/Passed";
		}else if(status.equalsIgnoreCase("fail")){
			destDir = "Screenshots/Failed";
			}
		
		//Creating folder to save Screenshots
		new File(destDir).mkdirs();
		
		//Setting file name with combination of Test case name + Date time Format
		String destFile = passfailMethod+" - "+dateFormat.format(new Date()) + ".png";
		
		//Saving file at destination folder location
		try{
			FileUtils.copyFile(srcFile, new File(destDir + "/" + destFile));
		}catch(IOException e){
			e.printStackTrace();
			}
		}
	}
