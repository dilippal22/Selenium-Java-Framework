package com.dgsl.ippdgsl.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtil extends Resources{
	
	public static String getScreenshot(String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String destFolder = System.getProperty("user.dir") + "\\FailedTestScreenshot\\" + screenshotName + dateName
				+ ".png";
		File finalDest = new File(destFolder);
		FileUtils.copyFile(sourceFile, finalDest);
		return destFolder;
		}
	}
