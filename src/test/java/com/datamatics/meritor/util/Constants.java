package com.datamatics.meritor.util;

public class Constants {

	// Config Properties File Path
	public static String CONFIG_FILE = System.getProperty("user.dir")
			+ "\\src\\test\\java\\com\\datamatics\\meritor\\config\\config.properties";

	// Screenshot File Path
	public static String SCREENSHOT = System.getProperty("user.dir")
			+ "\\FailedScreenshot\\";

	// Chrome Driver File Path
	public static String CHROME_DRIVER = System.getProperty("user.dir")
			+ "\\BrowserDrivers\\chromedriver-v2.36-win32.exe";

	// Gecko Driver File Path
	public static String GECKO_DRIVER = System.getProperty("user.dir")
			+ "\\BrowserDrivers\\geckodriver-v0.16.0-win64.exe";

	// extent-report xml File Path
	public static String EXTENT_CONFIG = System.getProperty("user.dir")
			+ "\\src\\test\\java\\com\\datamatics\\meritor\\config\\extent-config.xml";
}
