package com.dgsl.phptravels.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.dgsl.phptravels.base.TestBase;

public class TestUtil extends TestBase{
	
	public void switchToFrame(){
		driver.switchTo().frame("mainpane1");
	}
	
	public void takeScreenshotAtEndOfTest(){
		String currentDir = System.getProperty("user.dir");
		try{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(currentDir + "/EndOfTestScreenshot/" + System.currentTimeMillis() + ".png"));
			}catch(IOException e){
				e.printStackTrace();
			}
	}
}