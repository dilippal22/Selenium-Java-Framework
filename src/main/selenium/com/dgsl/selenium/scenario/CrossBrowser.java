package com.dgsl.selenium.scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifypageTitle(String browser) {
		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty(
					"webdriver.gecko.driver",
					"D:\\Project\\IPM\\SendMeritorMail\\browserdriver\\geckodriver-v0.16.0-win64.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jain.anuj\\workspace\\FreeCRM\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("http://www.google.com");
		String title_name = driver.getTitle();
		System.out.println(title_name);
	}

}
