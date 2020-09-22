package com.dgsl.selenium.scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserProfileHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		FirefoxProfile fp = new FirefoxProfile();
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		driver = new FirefoxDriver();

		driver.get("http://google.com");

		/*
		 * public void desiredCapabilities() { DesiredCapabilities dc = new
		 * DesiredCapabilities(); dc.setCapability(CapabilityType.BROWSER_NAME,
		 * "Firefox"); dc.setCapability(CapabilityType.PLATFORM_NAME, "Windows");
		 * dc.setCapability(CapabilityType.BROWSER_VERSION, "58");
		 * 
		 * driver.get("http://google.com");
		 */

	}

}
