package com.dgsl.phptravels.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.dgsl.phptravels.util.Constants;
import com.dgsl.phptravels.util.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Dilip.Pal PageBase will contains the all methods which is common for
 *         all pages.
 */

public class TestBase {

	protected static WebDriver driver;
	protected static Properties prop;
	protected static EventFiringWebDriver e_driver;
	protected static WebEventListener eventListener;

	// Constructor
	public TestBase() {
		if (driver == null) {
			initConfig();
		}
	}

	// Initialize Project configuration File
	public static void initConfig() {

		// Initializing Properties File
		prop = new Properties();

		// Read the config.properties File
		try {
			FileInputStream readconfig = new FileInputStream(Constants.CONFIG_FILE_PATH);

			// Load config.properties File
			prop.load(readconfig);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Initialize the Browser
	public static void initBrowser() {

		/*
		 * Check the Browser form properties file and open Browser Check if any previous
		 * WebDriver Instance is exist then execute the code in same web browser
		 * instance
		 */

		// If no existing Browser, then open the new Browser
		if (driver == null) {
			String browserName = prop.getProperty("testBrowser");
			if (browserName.equalsIgnoreCase("Mozilla")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

			else if (browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}

			e_driver = new EventFiringWebDriver(driver);
			// Creating object of EventListener to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			// Registering object of WebEventListener() with EventFiringWebDriver()
			e_driver.register(eventListener);
			driver = e_driver;

			// Maximize the Launched Browser
			driver.manage().window().maximize();

			// Delete all cookies
			driver.manage().deleteAllCookies();

			// Page load time out
//		Long PAGE_LOAD_TIMEOUT = Long.parseLong(prop.getProperty("pageLoadTimeout"));
//		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

			// Using implicit wait
			Long IMPLICIT_WAIT = Long.parseLong(prop.getProperty("implicitWait"));
			driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		}

		// Get the URL of the application
		driver.get(prop.getProperty("appURL"));
	}
}