package com.dgsl.selenium.scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) {
		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Automation Project\\JavaSeleniumConcepts\\BrowserDrivers\\geckodriver-v0.18.0-win64.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Automation Project\\JavaSeleniumConcepts\\BrowserDrivers\\chromedriver-v2.36-win32.exe");
			driver = new ChromeDriver();
		}
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 0)
	public void verifypageTitle() {
		String title_name = driver.getTitle();
		System.out.println(title_name);
		Assert.assertEquals(title_name, "Google", "Failed: Page Title Mismatch Test");
	}

	@Test(priority = 1)
	public void verifyPageLogoName() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String logoText = driver.findElement(By.id("hplogo")).getText();
		System.out.println(logoText);
		Assert.assertEquals(logoText, "Google", "Failed: Page Title Mismatch Test");
	}

	@AfterMethod
	public void teaDown() {
		driver.quit();
	}

}
