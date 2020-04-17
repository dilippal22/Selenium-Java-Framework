package com.datamatics.meritor.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.datamatics.meritor.base.TestBase;

public class TestUtil extends TestBase {

	public static int IMPLICIT_WAIT = 10;

	public static int EXPLICIT_WAIT = 10;

	public static int FLUENT_WAIT = 20;

	public void fluentWait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
				.withTimeout(FLUENT_WAIT, TimeUnit.SECONDS)
				.pollingEvery(FLUENT_WAIT, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

	}

	public void switchToAlert() {
		getDriver().switchTo().alert();

	}

	public void switchFrame() {
		getDriver().switchTo().frame(0);
	}

	public void takeScreenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")
				+ "//FailedScreenshot" + fileName + ".jpg"));

	}

}
