package com.dgsl.freecrm.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.dgsl.freecrm.base.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase{
	
	@Before
	public void setUp(){
		TestBase.initBrowser();
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario){
		if(scenario.isFailed()){
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			String destPath = System.getProperty(System.getProperty("user.dir") + "/FailedScreenshot/" + scenario.getName() + System.currentTimeMillis() + ".png");
			File finalPath = new File(destPath);
			try {
				FileUtils.copyFile(srcFile, finalPath);
				Reporter.addScreenCaptureFromPath(destPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@After(order = 0)
	public void tearDown(){
		driver.quit();
	}

}
