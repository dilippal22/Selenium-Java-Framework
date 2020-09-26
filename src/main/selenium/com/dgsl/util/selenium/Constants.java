package com.dgsl.util.selenium;

public class Constants {

	public static final String CONFIG_FILE = System.getProperty("user.dir")
			+ "\\FreeCRM Cucumber\\src\\main\\java\\com\\dgsl\\freecrm\\config\\config.properties";

	public static final String CHROME_DRIVER = System.getProperty("user.dir")
			+ "/FreeCRM Cucumber/BrowserDriver//chromedriver2.8.exe";

	public static final String IE_DRIVER = System.getProperty("user.dir")
			+ "\\FreeCRM Cucumber\\BrowserDriver\\IEDriverServer.exe";

	public static final String GECKO_DRIVER = System.getProperty("user.dir")
			+ "\\FreeCRM Cucumber\\BrowserDriver\\geckodriver win32 0.20.exe";

	public static final String EXTENT_CONFIG = System.getProperty("user.dir")
			+ "\\FreeCRM Cucumber\\src\\main\\java\\com\\dgsl\\freecrm\\config\\extent-config.xml";

	public static final String PDF_FILE_PATH = System.getProperty("user.dir") + "\\pdffile\\printTicket.pdf";

	public static final String TEST_DATA = System.getProperty("user.dir")
			+ "\\src\\main\\selenium\\com\\dgsl\\util\\selenium\\ReadExcel.xlsx";
}
