package com.dgsl.selenium.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorHandle {

	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) {

		// Program 1- How to type in Selenium without using sendKeys() method
		// Open Firefox browser
		FirefoxDriver driver = new FirefoxDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Open applicatiion
		driver.get("enter your application URL");

		// This will execute JavaScript in your script
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('some id').value='mukesh';");
	}

	public static void main1(String[] args) {
		// clicking in Selenium if button or radio button is disable
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('some id').click();");
	}

	public static void main2(String[] args) {
		// unchecking checkbox in Selenium if checkbox is disabled
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('some id').checked=false;");

	}

}
