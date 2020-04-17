package com.dgsl.ippdgsl.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.dgsl.ippdgsl.util.Constants;
import com.dgsl.ippdgsl.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

//Author: Dilip P

public class Resources {

	protected static WebDriver driver;
	
	protected static Properties prop = new Properties();	
	protected static String webElement;
	protected static String keyword;
	protected static String TSID;
	protected static String Description;
	protected static String TestData;
	protected static String TestDataField;
	
	protected static Xls_Reader TestSuite;
	protected static Xls_Reader TestSuiteData;
	protected static File file;
	protected static FileInputStream inputstream;
	protected static ExtentReports report;
	protected static ExtentTest test;
	
	public static void Initialize() throws IOException{
		TestSuite = new Xls_Reader(Constants.TEST_SUITE);
		TestSuiteData = new Xls_Reader(Constants.TEST_SUITE_DATA);
		
		file = new File(Constants.VENDOR_CREATION);
		inputstream = new FileInputStream(file);
		prop.load(inputstream);
		
		file = new File(Constants.VENDOR_SELF_REG);
		inputstream = new FileInputStream(file);
		prop.load(inputstream);
		
		file = new File(Constants.MENU);
		inputstream = new FileInputStream(file);
		prop.load(inputstream);
	
		file = new File(Constants.USER);
		inputstream = new FileInputStream(file);
		prop.load(inputstream);
		
		file = new File(Constants.INVOICE_UPLOAD);
		inputstream = new FileInputStream(file);
		prop.load(inputstream);
	}
}
