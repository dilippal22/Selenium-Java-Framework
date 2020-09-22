package com.dgsl.selenium.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class ScrollPageByJS {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://jqueryui.com");

		// Wait for 5 second
		Thread.sleep(5000);

		// This will scroll page down by 1000 pixel vertical
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");

		// This will scroll the page down upto the total height of the page
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
