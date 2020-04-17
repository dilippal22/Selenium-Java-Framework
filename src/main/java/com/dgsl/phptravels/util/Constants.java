package com.dgsl.phptravels.util;

public class Constants {
	
	//config.properties File Path
	public static String CONFIG_FILE_PATH = System.getProperty("user.dir")
			+"\\src\\main\\java\\com\\dgsl\\phptravels\\config\\config.properties";
	
	//TestCaseList File Path
	public static String TESTCASELIST_FILE_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\dgsl\\phptravels\\testdata\\TestCaseList.xlsx";
	
	//TestCaseData File Path
	public static String TESTCASEDATA_FILE_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\dgsl\\phptravels\\testdata\\TestCaseData.xlsx";
	
	//ChromerDriver File Path
	public static String CHROMEDRIVER_FILE_PATH = System.getProperty("user.dir")
			+ "\\BrowserDriver\\chromedriver2.0.exe";
	
	//IEDriver File Path
	public static String IEDRIVER_FILE_PATH = System.getProperty("user.dir")
			+ "\\BrowserDriver\\IEDriverServer.exe";

}
